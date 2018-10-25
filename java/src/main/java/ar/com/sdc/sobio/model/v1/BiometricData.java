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
import ar.com.sdc.sobio.model.v1.CompositeFingerPrint;
import ar.com.sdc.sobio.model.v1.Face;
import ar.com.sdc.sobio.model.v1.FingerPrint;
import ar.com.sdc.sobio.model.v1.Voice;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BiometricData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-25T13:07:38.915-03:00")
public class BiometricData {
  @JsonProperty("compositeFingerPrints")
  private java.util.List<CompositeFingerPrint> compositeFingerPrints = null;

  @JsonProperty("faces")
  private java.util.List<Face> faces = null;

  @JsonProperty("fingerPrints")
  private java.util.List<FingerPrint> fingerPrints = null;

  @JsonProperty("voices")
  private java.util.List<Voice> voices = null;

  public BiometricData compositeFingerPrints(java.util.List<CompositeFingerPrint> compositeFingerPrints) {
    this.compositeFingerPrints = compositeFingerPrints;
    return this;
  }

  public BiometricData addCompositeFingerPrintsItem(CompositeFingerPrint compositeFingerPrintsItem) {
    if (this.compositeFingerPrints == null) {
      this.compositeFingerPrints = new java.util.ArrayList<CompositeFingerPrint>();
    }
    this.compositeFingerPrints.add(compositeFingerPrintsItem);
    return this;
  }

   /**
   * Get compositeFingerPrints
   * @return compositeFingerPrints
  **/
  @ApiModelProperty(value = "")
  public java.util.List<CompositeFingerPrint> getCompositeFingerPrints() {
    return compositeFingerPrints;
  }

  public void setCompositeFingerPrints(java.util.List<CompositeFingerPrint> compositeFingerPrints) {
    this.compositeFingerPrints = compositeFingerPrints;
  }

  public BiometricData faces(java.util.List<Face> faces) {
    this.faces = faces;
    return this;
  }

  public BiometricData addFacesItem(Face facesItem) {
    if (this.faces == null) {
      this.faces = new java.util.ArrayList<Face>();
    }
    this.faces.add(facesItem);
    return this;
  }

   /**
   * Get faces
   * @return faces
  **/
  @ApiModelProperty(value = "")
  public java.util.List<Face> getFaces() {
    return faces;
  }

  public void setFaces(java.util.List<Face> faces) {
    this.faces = faces;
  }

  public BiometricData fingerPrints(java.util.List<FingerPrint> fingerPrints) {
    this.fingerPrints = fingerPrints;
    return this;
  }

  public BiometricData addFingerPrintsItem(FingerPrint fingerPrintsItem) {
    if (this.fingerPrints == null) {
      this.fingerPrints = new java.util.ArrayList<FingerPrint>();
    }
    this.fingerPrints.add(fingerPrintsItem);
    return this;
  }

   /**
   * Get fingerPrints
   * @return fingerPrints
  **/
  @ApiModelProperty(value = "")
  public java.util.List<FingerPrint> getFingerPrints() {
    return fingerPrints;
  }

  public void setFingerPrints(java.util.List<FingerPrint> fingerPrints) {
    this.fingerPrints = fingerPrints;
  }

  public BiometricData voices(java.util.List<Voice> voices) {
    this.voices = voices;
    return this;
  }

  public BiometricData addVoicesItem(Voice voicesItem) {
    if (this.voices == null) {
      this.voices = new java.util.ArrayList<Voice>();
    }
    this.voices.add(voicesItem);
    return this;
  }

   /**
   * Get voices
   * @return voices
  **/
  @ApiModelProperty(value = "")
  public java.util.List<Voice> getVoices() {
    return voices;
  }

  public void setVoices(java.util.List<Voice> voices) {
    this.voices = voices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BiometricData biometricData = (BiometricData) o;
    return Objects.equals(this.compositeFingerPrints, biometricData.compositeFingerPrints) &&
        Objects.equals(this.faces, biometricData.faces) &&
        Objects.equals(this.fingerPrints, biometricData.fingerPrints) &&
        Objects.equals(this.voices, biometricData.voices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compositeFingerPrints, faces, fingerPrints, voices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiometricData {\n");
    
    sb.append("    compositeFingerPrints: ").append(toIndentedString(compositeFingerPrints)).append("\n");
    sb.append("    faces: ").append(toIndentedString(faces)).append("\n");
    sb.append("    fingerPrints: ").append(toIndentedString(fingerPrints)).append("\n");
    sb.append("    voices: ").append(toIndentedString(voices)).append("\n");
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
