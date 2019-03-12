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
 * TextIndependentVoiceExtractionParameters
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T14:38:20.209-03:00")
public class TextIndependentVoiceExtractionParameters {
  @JsonProperty("minDuration")
  private Long minDuration = null;

  @JsonProperty("minLevel")
  private Double minLevel = null;

  @JsonProperty("useCache")
  private Boolean useCache = null;

  public TextIndependentVoiceExtractionParameters minDuration(Long minDuration) {
    this.minDuration = minDuration;
    return this;
  }

   /**
   * Get minDuration
   * @return minDuration
  **/
  @ApiModelProperty(value = "")
  public Long getMinDuration() {
    return minDuration;
  }

  public void setMinDuration(Long minDuration) {
    this.minDuration = minDuration;
  }

  public TextIndependentVoiceExtractionParameters minLevel(Double minLevel) {
    this.minLevel = minLevel;
    return this;
  }

   /**
   * Get minLevel
   * @return minLevel
  **/
  @ApiModelProperty(value = "")
  public Double getMinLevel() {
    return minLevel;
  }

  public void setMinLevel(Double minLevel) {
    this.minLevel = minLevel;
  }

  public TextIndependentVoiceExtractionParameters useCache(Boolean useCache) {
    this.useCache = useCache;
    return this;
  }

   /**
   * Get useCache
   * @return useCache
  **/
  @ApiModelProperty(value = "")
  public Boolean isUseCache() {
    return useCache;
  }

  public void setUseCache(Boolean useCache) {
    this.useCache = useCache;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextIndependentVoiceExtractionParameters textIndependentVoiceExtractionParameters = (TextIndependentVoiceExtractionParameters) o;
    return Objects.equals(this.minDuration, textIndependentVoiceExtractionParameters.minDuration) &&
        Objects.equals(this.minLevel, textIndependentVoiceExtractionParameters.minLevel) &&
        Objects.equals(this.useCache, textIndependentVoiceExtractionParameters.useCache);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minDuration, minLevel, useCache);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextIndependentVoiceExtractionParameters {\n");
    
    sb.append("    minDuration: ").append(toIndentedString(minDuration)).append("\n");
    sb.append("    minLevel: ").append(toIndentedString(minLevel)).append("\n");
    sb.append("    useCache: ").append(toIndentedString(useCache)).append("\n");
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
