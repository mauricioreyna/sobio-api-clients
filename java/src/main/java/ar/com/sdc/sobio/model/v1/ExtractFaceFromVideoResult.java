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
import ar.com.sdc.sobio.model.v1.DetectedAction;
import ar.com.sdc.sobio.model.v1.Face;
import ar.com.sdc.sobio.model.v1.FaceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ExtractFaceFromVideoResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-25T13:07:38.915-03:00")
public class ExtractFaceFromVideoResult {
  @JsonProperty("auditId")
  private Long auditId = null;

  @JsonProperty("detectedActions")
  private java.util.List<DetectedAction> detectedActions = null;

  @JsonProperty("exception")
  private Boolean exception = null;

  @JsonProperty("face")
  private Face face = null;

  @JsonProperty("properties")
  private FaceProperties properties = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    OK("OK"),
    
    UNKNOWN_VIDEO_FORMAT("UNKNOWN_VIDEO_FORMAT"),
    
    MORE_THAN_ONE_FACE("MORE_THAN_ONE_FACE"),
    
    BAD_ILLUMINATION("BAD_ILLUMINATION"),
    
    FACE_NOT_DETECTED("FACE_NOT_DETECTED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  public ExtractFaceFromVideoResult auditId(Long auditId) {
    this.auditId = auditId;
    return this;
  }

   /**
   * Get auditId
   * @return auditId
  **/
  @ApiModelProperty(value = "")
  public Long getAuditId() {
    return auditId;
  }

  public void setAuditId(Long auditId) {
    this.auditId = auditId;
  }

  public ExtractFaceFromVideoResult detectedActions(java.util.List<DetectedAction> detectedActions) {
    this.detectedActions = detectedActions;
    return this;
  }

  public ExtractFaceFromVideoResult addDetectedActionsItem(DetectedAction detectedActionsItem) {
    if (this.detectedActions == null) {
      this.detectedActions = new java.util.ArrayList<DetectedAction>();
    }
    this.detectedActions.add(detectedActionsItem);
    return this;
  }

   /**
   * Get detectedActions
   * @return detectedActions
  **/
  @ApiModelProperty(value = "")
  public java.util.List<DetectedAction> getDetectedActions() {
    return detectedActions;
  }

  public void setDetectedActions(java.util.List<DetectedAction> detectedActions) {
    this.detectedActions = detectedActions;
  }

  public ExtractFaceFromVideoResult exception(Boolean exception) {
    this.exception = exception;
    return this;
  }

   /**
   * Get exception
   * @return exception
  **/
  @ApiModelProperty(value = "")
  public Boolean isException() {
    return exception;
  }

  public void setException(Boolean exception) {
    this.exception = exception;
  }

  public ExtractFaceFromVideoResult face(Face face) {
    this.face = face;
    return this;
  }

   /**
   * Get face
   * @return face
  **/
  @ApiModelProperty(value = "")
  public Face getFace() {
    return face;
  }

  public void setFace(Face face) {
    this.face = face;
  }

  public ExtractFaceFromVideoResult properties(FaceProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")
  public FaceProperties getProperties() {
    return properties;
  }

  public void setProperties(FaceProperties properties) {
    this.properties = properties;
  }

  public ExtractFaceFromVideoResult status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtractFaceFromVideoResult extractFaceFromVideoResult = (ExtractFaceFromVideoResult) o;
    return Objects.equals(this.auditId, extractFaceFromVideoResult.auditId) &&
        Objects.equals(this.detectedActions, extractFaceFromVideoResult.detectedActions) &&
        Objects.equals(this.exception, extractFaceFromVideoResult.exception) &&
        Objects.equals(this.face, extractFaceFromVideoResult.face) &&
        Objects.equals(this.properties, extractFaceFromVideoResult.properties) &&
        Objects.equals(this.status, extractFaceFromVideoResult.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditId, detectedActions, exception, face, properties, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtractFaceFromVideoResult {\n");
    
    sb.append("    auditId: ").append(toIndentedString(auditId)).append("\n");
    sb.append("    detectedActions: ").append(toIndentedString(detectedActions)).append("\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    face: ").append(toIndentedString(face)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

