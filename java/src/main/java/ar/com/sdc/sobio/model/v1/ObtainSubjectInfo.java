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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ObtainSubjectInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T14:38:20.209-03:00")
public class ObtainSubjectInfo {
  @JsonProperty("auditToken")
  private String auditToken = null;

  @JsonProperty("subjectId")
  private String subjectId = null;

  public ObtainSubjectInfo auditToken(String auditToken) {
    this.auditToken = auditToken;
    return this;
  }

   /**
   * Get auditToken
   * @return auditToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAuditToken() {
    return auditToken;
  }

  public void setAuditToken(String auditToken) {
    this.auditToken = auditToken;
  }

  public ObtainSubjectInfo subjectId(String subjectId) {
    this.subjectId = subjectId;
    return this;
  }

   /**
   * Get subjectId
   * @return subjectId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(String subjectId) {
    this.subjectId = subjectId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObtainSubjectInfo obtainSubjectInfo = (ObtainSubjectInfo) o;
    return Objects.equals(this.auditToken, obtainSubjectInfo.auditToken) &&
        Objects.equals(this.subjectId, obtainSubjectInfo.subjectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditToken, subjectId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObtainSubjectInfo {\n");
    
    sb.append("    auditToken: ").append(toIndentedString(auditToken)).append("\n");
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
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

