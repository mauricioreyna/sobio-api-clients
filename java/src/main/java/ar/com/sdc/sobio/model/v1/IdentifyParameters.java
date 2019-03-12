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


package ar.com.sdc.sobio.model.v1;

import java.util.Objects;
import ar.com.sdc.sobio.model.v1.Conditions;
import ar.com.sdc.sobio.model.v1.FaceMatchingParameters;
import ar.com.sdc.sobio.model.v1.FingerPrintMatchingParameters;
import ar.com.sdc.sobio.model.v1.VoiceMatchingParameters;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * IdentifyParameters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T14:38:20.209-03:00")
public class IdentifyParameters {
  @JsonProperty("conditions")
  private Conditions conditions = null;

  @JsonProperty("faceMatchingParams")
  private FaceMatchingParameters faceMatchingParams = null;

  @JsonProperty("far")
  private Double far = null;

  @JsonProperty("fingerPrintMatchingParams")
  private FingerPrintMatchingParameters fingerPrintMatchingParams = null;

  @JsonProperty("globalSearchWithConditions")
  private Boolean globalSearchWithConditions = null;

  @JsonProperty("voiceMatchingParams")
  private VoiceMatchingParameters voiceMatchingParams = null;

  public IdentifyParameters conditions(Conditions conditions) {
    this.conditions = conditions;
    return this;
  }

   /**
   * Get conditions
   * @return conditions
  **/
  @ApiModelProperty(value = "")
  public Conditions getConditions() {
    return conditions;
  }

  public void setConditions(Conditions conditions) {
    this.conditions = conditions;
  }

  public IdentifyParameters faceMatchingParams(FaceMatchingParameters faceMatchingParams) {
    this.faceMatchingParams = faceMatchingParams;
    return this;
  }

   /**
   * Get faceMatchingParams
   * @return faceMatchingParams
  **/
  @ApiModelProperty(value = "")
  public FaceMatchingParameters getFaceMatchingParams() {
    return faceMatchingParams;
  }

  public void setFaceMatchingParams(FaceMatchingParameters faceMatchingParams) {
    this.faceMatchingParams = faceMatchingParams;
  }

  public IdentifyParameters far(Double far) {
    this.far = far;
    return this;
  }

   /**
   * Get far
   * @return far
  **/
  @ApiModelProperty(value = "")
  public Double getFar() {
    return far;
  }

  public void setFar(Double far) {
    this.far = far;
  }

  public IdentifyParameters fingerPrintMatchingParams(FingerPrintMatchingParameters fingerPrintMatchingParams) {
    this.fingerPrintMatchingParams = fingerPrintMatchingParams;
    return this;
  }

   /**
   * Get fingerPrintMatchingParams
   * @return fingerPrintMatchingParams
  **/
  @ApiModelProperty(value = "")
  public FingerPrintMatchingParameters getFingerPrintMatchingParams() {
    return fingerPrintMatchingParams;
  }

  public void setFingerPrintMatchingParams(FingerPrintMatchingParameters fingerPrintMatchingParams) {
    this.fingerPrintMatchingParams = fingerPrintMatchingParams;
  }

  public IdentifyParameters globalSearchWithConditions(Boolean globalSearchWithConditions) {
    this.globalSearchWithConditions = globalSearchWithConditions;
    return this;
  }

   /**
   * Get globalSearchWithConditions
   * @return globalSearchWithConditions
  **/
  @ApiModelProperty(value = "")
  public Boolean isGlobalSearchWithConditions() {
    return globalSearchWithConditions;
  }

  public void setGlobalSearchWithConditions(Boolean globalSearchWithConditions) {
    this.globalSearchWithConditions = globalSearchWithConditions;
  }

  public IdentifyParameters voiceMatchingParams(VoiceMatchingParameters voiceMatchingParams) {
    this.voiceMatchingParams = voiceMatchingParams;
    return this;
  }

   /**
   * Get voiceMatchingParams
   * @return voiceMatchingParams
  **/
  @ApiModelProperty(value = "")
  public VoiceMatchingParameters getVoiceMatchingParams() {
    return voiceMatchingParams;
  }

  public void setVoiceMatchingParams(VoiceMatchingParameters voiceMatchingParams) {
    this.voiceMatchingParams = voiceMatchingParams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentifyParameters identifyParameters = (IdentifyParameters) o;
    return Objects.equals(this.conditions, identifyParameters.conditions) &&
        Objects.equals(this.faceMatchingParams, identifyParameters.faceMatchingParams) &&
        Objects.equals(this.far, identifyParameters.far) &&
        Objects.equals(this.fingerPrintMatchingParams, identifyParameters.fingerPrintMatchingParams) &&
        Objects.equals(this.globalSearchWithConditions, identifyParameters.globalSearchWithConditions) &&
        Objects.equals(this.voiceMatchingParams, identifyParameters.voiceMatchingParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, faceMatchingParams, far, fingerPrintMatchingParams, globalSearchWithConditions, voiceMatchingParams);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentifyParameters {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    faceMatchingParams: ").append(toIndentedString(faceMatchingParams)).append("\n");
    sb.append("    far: ").append(toIndentedString(far)).append("\n");
    sb.append("    fingerPrintMatchingParams: ").append(toIndentedString(fingerPrintMatchingParams)).append("\n");
    sb.append("    globalSearchWithConditions: ").append(toIndentedString(globalSearchWithConditions)).append("\n");
    sb.append("    voiceMatchingParams: ").append(toIndentedString(voiceMatchingParams)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

