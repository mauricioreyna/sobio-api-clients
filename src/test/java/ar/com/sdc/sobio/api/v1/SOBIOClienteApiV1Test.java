/*
 * SOBIO
 * SOBIO Biometric Services
 *
 * OpenAPI spec version: 1
 * Contact: info@softwaredelcentro.com.ar
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ar.com.sdc.sobio.api.v1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import ar.com.sdc.sobio.client.v1.ApiException;
import ar.com.sdc.sobio.model.v1.BiometricData;
import ar.com.sdc.sobio.model.v1.ExtractFaceFromImageInput;
import ar.com.sdc.sobio.model.v1.ExtractFaceFromImageResult;
import ar.com.sdc.sobio.model.v1.ExtractFaceFromVideoInput;
import ar.com.sdc.sobio.model.v1.ExtractFaceFromVideoResult;
import ar.com.sdc.sobio.model.v1.FaceExtractionParams;
import ar.com.sdc.sobio.model.v1.Gender;
import ar.com.sdc.sobio.model.v1.VerificationParameters;
import ar.com.sdc.sobio.model.v1.VerifyResult;
import ar.com.sdc.sobio.model.v1.VerifyT2TInput;

public class SOBIOClienteApiV1Test {

	protected byte[] cargar(String rscName) throws IOException {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(rscName).getFile());
		FileInputStream fis = new FileInputStream(file);
		byte[] cnt = IOUtils.toByteArray(fis);
		fis.close();
		return cnt;
	}

	@Test
	public void extractFaceWithGenderFromImage01() throws ApiException, IOException {
		ExtractionApi api = new ExtractionApi();
		ExtractFaceFromImageInput input = new ExtractFaceFromImageInput();
		input.setAuditToken("tok123");
		input.setImage(cargar("paul-1.jpg"));
		FaceExtractionParams params = new FaceExtractionParams();
		params.setDetectGender(true);
		input.setParams(params);
		ExtractFaceFromImageResult output = api.extractFaceImage(input);
		assertEquals(output.getExtractedFaces().size(), 1);
		assertEquals(output.getExtractedFaces().get(0).getProperties().getGender().getType(), Gender.TypeEnum.MALE);

	}

	@Test
	public void match2Faces() throws ApiException, IOException {
		ExtractionApi apiExtraction = new ExtractionApi();
		MatchingApi apiMatching = new MatchingApi();
		ExtractFaceFromImageInput input = new ExtractFaceFromImageInput();
		input.setAuditToken("tok123");
		input.setImage(cargar("paul-1.jpg"));
		ExtractFaceFromImageResult output1 = apiExtraction.extractFaceImage(input);
		input = new ExtractFaceFromImageInput();
		input.setAuditToken("tok456");
		input.setImage(cargar("paul-2.jpg"));
		ExtractFaceFromImageResult output2 = apiExtraction.extractFaceImage(input);
		BiometricData subject1BioInfo = new BiometricData();
		subject1BioInfo.addFacesItem(output1.getExtractedFaces().get(0).getFace());
		BiometricData subject2BioInfo = new BiometricData();
		subject2BioInfo.addFacesItem(output2.getExtractedFaces().get(0).getFace());
		VerifyT2TInput verifyInput = new VerifyT2TInput();
		VerificationParameters verifyParams = new VerificationParameters();
		verifyParams.setFar(0.0005);// sets to accept valid a 0.05% False Acceptance Rate
		verifyInput.setParams(verifyParams);
		verifyInput.bioInfo1(subject1BioInfo);
		verifyInput.bioInfo2(subject2BioInfo);
		VerifyResult verifyOutput = apiMatching.verifyT2t(verifyInput);
		assertEquals(verifyOutput.getStatus(), VerifyResult.StatusEnum.VERIFY_OK);
		assertTrue(verifyOutput.getFaP() < 0.0005d);// Assess that matched probability is below accepted rate
	}

	@Test
	public void extractFaceFromVideo01() throws ApiException, IOException {
		ExtractionApi api = new ExtractionApi();
		ExtractFaceFromVideoInput input = new ExtractFaceFromVideoInput();
		FaceExtractionParams params = new FaceExtractionParams();
		params.setDetectGender(true);
		input.setParams(params);
		input.setAuditToken("tok123");
		input.setVideo(cargar("paul-3.mp4"));// Extracted from https://www.youtube.com/watch?v=ui4at87SCB0
		ExtractFaceFromVideoResult output = api.extractFaceVideo(input);
		assertEquals(output.getStatus(), ExtractFaceFromVideoResult.StatusEnum.OK);
		assertEquals(output.getProperties().getGender(), Gender.TypeEnum.MALE);
	}

	@Test
	public void matchFaceFromVideo2FaceFromImage() throws ApiException, IOException {
		ExtractionApi apiExtraction = new ExtractionApi();
		ExtractFaceFromVideoInput inputVideo = new ExtractFaceFromVideoInput();
		inputVideo.setAuditToken("tok123");
		inputVideo.setVideo(cargar("paul-3.mp4"));// Extracted from https://www.youtube.com/watch?v=ui4at87SCB0
		ExtractFaceFromVideoResult outputVideo = apiExtraction.extractFaceVideo(inputVideo);
		ExtractFaceFromImageInput inputImage = new ExtractFaceFromImageInput();
		inputImage.setAuditToken("tok123");
		inputImage.setImage(cargar("paul-1.jpg"));
		ExtractFaceFromImageResult outputImage = apiExtraction.extractFaceImage(inputImage);
		BiometricData subject1BioInfo = new BiometricData();
		subject1BioInfo.addFacesItem(outputVideo.getFace());
		BiometricData subject2BioInfo = new BiometricData();
		subject2BioInfo.addFacesItem(outputImage.getExtractedFaces().get(0).getFace());
		VerifyT2TInput verifyInput = new VerifyT2TInput();
		VerificationParameters verifyParams = new VerificationParameters();
		verifyParams.setFar(0.07);// sets to accept valid a 7% False Acceptance Rate 
		verifyInput.setParams(verifyParams);
		verifyInput.bioInfo1(subject1BioInfo);
		verifyInput.bioInfo2(subject2BioInfo);
		MatchingApi apiMatching = new MatchingApi();
		VerifyResult verifyOutput = apiMatching.verifyT2t(verifyInput);
		assertEquals(verifyOutput.getStatus(), VerifyResult.StatusEnum.VERIFY_OK);
	}
	
	@Test
	public void matchIDCardImage2SelfieImage01() throws ApiException, IOException {
		ExtractionApi apiExtraction = new ExtractionApi();
		MatchingApi apiMatching = new MatchingApi();
		ExtractFaceFromImageInput inputIDCard = new ExtractFaceFromImageInput();
		inputIDCard.setAuditToken("tok123");
		inputIDCard.setImage(cargar("idcard-01.jpg"));
		ExtractFaceFromImageResult outputIDCard = apiExtraction.extractFaceImage(inputIDCard);
		ExtractFaceFromImageInput inputSelfie= new ExtractFaceFromImageInput();
		inputSelfie.setAuditToken("tok123");
		inputSelfie.setImage(cargar("selfie-01.jpg"));
		ExtractFaceFromImageResult outputSelfie = apiExtraction.extractFaceImage(inputSelfie);
		BiometricData subject1BioInfo = new BiometricData();
		subject1BioInfo.addFacesItem(outputIDCard.getExtractedFaces().get(0).getFace());
		BiometricData subject2BioInfo = new BiometricData();
		subject2BioInfo.addFacesItem(outputSelfie.getExtractedFaces().get(0).getFace());
		VerifyT2TInput verifyInput = new VerifyT2TInput();
		VerificationParameters verifyParams = new VerificationParameters();
		verifyParams.setFar(0.009);// sets to accept valid a 0.09% False Acceptance Rate
		verifyInput.setParams(verifyParams);
		verifyInput.bioInfo1(subject1BioInfo);
		verifyInput.bioInfo2(subject2BioInfo);
		VerifyResult verifyOutput = apiMatching.verifyT2t(verifyInput);
		assertEquals(verifyOutput.getStatus(), VerifyResult.StatusEnum.VERIFY_OK);
		assertTrue(verifyOutput.getFaP() < 0.009d);// Assess that matched probability is below accepted rate
	}

	@Test
	public void matchIDCardImage2SelfieVideo01() throws ApiException, IOException {
		ExtractionApi apiExtraction = new ExtractionApi();
		MatchingApi apiMatching = new MatchingApi();
		ExtractFaceFromImageInput inputIDCard = new ExtractFaceFromImageInput();
		inputIDCard.setAuditToken("tok123");
		inputIDCard.setImage(cargar("idcard-01.jpg"));
		ExtractFaceFromImageResult outputIDCard = apiExtraction.extractFaceImage(inputIDCard);
		ExtractFaceFromVideoInput inputSelfieVideo = new ExtractFaceFromVideoInput();
		inputSelfieVideo.setAuditToken("tok123");
		inputSelfieVideo.setVideo(cargar("selfie-vid-01.mp4"));
		ExtractFaceFromVideoResult outputSelfieVideo = apiExtraction.extractFaceVideo(inputSelfieVideo);
		BiometricData subject1BioInfo = new BiometricData();
		subject1BioInfo.addFacesItem(outputIDCard.getExtractedFaces().get(0).getFace());
		BiometricData subject2BioInfo = new BiometricData();
		subject2BioInfo.addFacesItem(outputSelfieVideo.getFace());
		VerifyT2TInput verifyInput = new VerifyT2TInput();
		VerificationParameters verifyParams = new VerificationParameters();
		verifyParams.setFar(0.007);// sets to accept valid a 0.7% False Acceptance Rate
		verifyInput.setParams(verifyParams);
		verifyInput.bioInfo1(subject1BioInfo);
		verifyInput.bioInfo2(subject2BioInfo);
		VerifyResult verifyOutput = apiMatching.verifyT2t(verifyInput);
		assertEquals(verifyOutput.getStatus(), VerifyResult.StatusEnum.VERIFY_OK);
		assertTrue(verifyOutput.getFaP() < 0.007d);// Assess that matched probability is below accepted rate
	}

}
