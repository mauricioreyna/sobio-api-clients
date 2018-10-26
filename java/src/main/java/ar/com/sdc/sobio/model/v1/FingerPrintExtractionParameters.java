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
 * FingerPrintExtractionParameters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-26T11:28:18.014-03:00")
public class FingerPrintExtractionParameters {
  @JsonProperty("determinePatternClass")
  private Boolean determinePatternClass = null;

  @JsonProperty("evaluateNFIQ")
  private Boolean evaluateNFIQ = null;

  @JsonProperty("maxRotation")
  private Float maxRotation = null;

  @JsonProperty("minQuality")
  private Integer minQuality = null;

  @JsonProperty("useOnlyAnsi378")
  private Boolean useOnlyAnsi378 = null;

  public FingerPrintExtractionParameters determinePatternClass(Boolean determinePatternClass) {
    this.determinePatternClass = determinePatternClass;
    return this;
  }

   /**
   * Get determinePatternClass
   * @return determinePatternClass
  **/
  @ApiModelProperty(value = "")
  public Boolean isDeterminePatternClass() {
    return determinePatternClass;
  }

  public void setDeterminePatternClass(Boolean determinePatternClass) {
    this.determinePatternClass = determinePatternClass;
  }

  public FingerPrintExtractionParameters evaluateNFIQ(Boolean evaluateNFIQ) {
    this.evaluateNFIQ = evaluateNFIQ;
    return this;
  }

   /**
   * Get evaluateNFIQ
   * @return evaluateNFIQ
  **/
  @ApiModelProperty(value = "")
  public Boolean isEvaluateNFIQ() {
    return evaluateNFIQ;
  }

  public void setEvaluateNFIQ(Boolean evaluateNFIQ) {
    this.evaluateNFIQ = evaluateNFIQ;
  }

  public FingerPrintExtractionParameters maxRotation(Float maxRotation) {
    this.maxRotation = maxRotation;
    return this;
  }

   /**
   * Get maxRotation
   * @return maxRotation
  **/
  @ApiModelProperty(value = "")
  public Float getMaxRotation() {
    return maxRotation;
  }

  public void setMaxRotation(Float maxRotation) {
    this.maxRotation = maxRotation;
  }

  public FingerPrintExtractionParameters minQuality(Integer minQuality) {
    this.minQuality = minQuality;
    return this;
  }

   /**
   * Get minQuality
   * minimum: -128
   * maximum: 127
   * @return minQuality
  **/
  @ApiModelProperty(value = "")
  public Integer getMinQuality() {
    return minQuality;
  }

  public void setMinQuality(Integer minQuality) {
    this.minQuality = minQuality;
  }

  public FingerPrintExtractionParameters useOnlyAnsi378(Boolean useOnlyAnsi378) {
    this.useOnlyAnsi378 = useOnlyAnsi378;
    return this;
  }

   /**
   * Get useOnlyAnsi378
   * @return useOnlyAnsi378
  **/
  @ApiModelProperty(value = "")
  public Boolean isUseOnlyAnsi378() {
    return useOnlyAnsi378;
  }

  public void setUseOnlyAnsi378(Boolean useOnlyAnsi378) {
    this.useOnlyAnsi378 = useOnlyAnsi378;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FingerPrintExtractionParameters fingerPrintExtractionParameters = (FingerPrintExtractionParameters) o;
    return Objects.equals(this.determinePatternClass, fingerPrintExtractionParameters.determinePatternClass) &&
        Objects.equals(this.evaluateNFIQ, fingerPrintExtractionParameters.evaluateNFIQ) &&
        Objects.equals(this.maxRotation, fingerPrintExtractionParameters.maxRotation) &&
        Objects.equals(this.minQuality, fingerPrintExtractionParameters.minQuality) &&
        Objects.equals(this.useOnlyAnsi378, fingerPrintExtractionParameters.useOnlyAnsi378);
  }

  @Override
  public int hashCode() {
    return Objects.hash(determinePatternClass, evaluateNFIQ, maxRotation, minQuality, useOnlyAnsi378);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FingerPrintExtractionParameters {\n");
    
    sb.append("    determinePatternClass: ").append(toIndentedString(determinePatternClass)).append("\n");
    sb.append("    evaluateNFIQ: ").append(toIndentedString(evaluateNFIQ)).append("\n");
    sb.append("    maxRotation: ").append(toIndentedString(maxRotation)).append("\n");
    sb.append("    minQuality: ").append(toIndentedString(minQuality)).append("\n");
    sb.append("    useOnlyAnsi378: ").append(toIndentedString(useOnlyAnsi378)).append("\n");
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
