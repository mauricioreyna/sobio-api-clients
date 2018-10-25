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
 * Traits
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-25T13:07:38.915-03:00")
public class Traits {
  @JsonProperty("ambosOjosCerrados")
  private Boolean ambosOjosCerrados = null;

  @JsonProperty("beard")
  private Integer beard = null;

  @JsonProperty("darkGlasses")
  private Integer darkGlasses = null;

  @JsonProperty("glasses")
  private Integer glasses = null;

  @JsonProperty("hat")
  private Integer hat = null;

  @JsonProperty("leftEyeClosed")
  private Boolean leftEyeClosed = null;

  @JsonProperty("lookingDownward")
  private Boolean lookingDownward = null;

  @JsonProperty("lookingFront")
  private Boolean lookingFront = null;

  @JsonProperty("lookingLeft")
  private Boolean lookingLeft = null;

  @JsonProperty("lookingRight")
  private Boolean lookingRight = null;

  @JsonProperty("lookingUpward")
  private Boolean lookingUpward = null;

  @JsonProperty("mustache")
  private Integer mustache = null;

  @JsonProperty("openMouth")
  private Integer openMouth = null;

  @JsonProperty("rightEyeClosed")
  private Boolean rightEyeClosed = null;

  public Traits ambosOjosCerrados(Boolean ambosOjosCerrados) {
    this.ambosOjosCerrados = ambosOjosCerrados;
    return this;
  }

   /**
   * Get ambosOjosCerrados
   * @return ambosOjosCerrados
  **/
  @ApiModelProperty(value = "")
  public Boolean isAmbosOjosCerrados() {
    return ambosOjosCerrados;
  }

  public void setAmbosOjosCerrados(Boolean ambosOjosCerrados) {
    this.ambosOjosCerrados = ambosOjosCerrados;
  }

  public Traits beard(Integer beard) {
    this.beard = beard;
    return this;
  }

   /**
   * Get beard
   * minimum: -128
   * maximum: 127
   * @return beard
  **/
  @ApiModelProperty(value = "")
  public Integer getBeard() {
    return beard;
  }

  public void setBeard(Integer beard) {
    this.beard = beard;
  }

  public Traits darkGlasses(Integer darkGlasses) {
    this.darkGlasses = darkGlasses;
    return this;
  }

   /**
   * Get darkGlasses
   * minimum: -128
   * maximum: 127
   * @return darkGlasses
  **/
  @ApiModelProperty(value = "")
  public Integer getDarkGlasses() {
    return darkGlasses;
  }

  public void setDarkGlasses(Integer darkGlasses) {
    this.darkGlasses = darkGlasses;
  }

  public Traits glasses(Integer glasses) {
    this.glasses = glasses;
    return this;
  }

   /**
   * Get glasses
   * minimum: -128
   * maximum: 127
   * @return glasses
  **/
  @ApiModelProperty(value = "")
  public Integer getGlasses() {
    return glasses;
  }

  public void setGlasses(Integer glasses) {
    this.glasses = glasses;
  }

  public Traits hat(Integer hat) {
    this.hat = hat;
    return this;
  }

   /**
   * Get hat
   * minimum: -128
   * maximum: 127
   * @return hat
  **/
  @ApiModelProperty(value = "")
  public Integer getHat() {
    return hat;
  }

  public void setHat(Integer hat) {
    this.hat = hat;
  }

  public Traits leftEyeClosed(Boolean leftEyeClosed) {
    this.leftEyeClosed = leftEyeClosed;
    return this;
  }

   /**
   * Get leftEyeClosed
   * @return leftEyeClosed
  **/
  @ApiModelProperty(value = "")
  public Boolean isLeftEyeClosed() {
    return leftEyeClosed;
  }

  public void setLeftEyeClosed(Boolean leftEyeClosed) {
    this.leftEyeClosed = leftEyeClosed;
  }

  public Traits lookingDownward(Boolean lookingDownward) {
    this.lookingDownward = lookingDownward;
    return this;
  }

   /**
   * Get lookingDownward
   * @return lookingDownward
  **/
  @ApiModelProperty(value = "")
  public Boolean isLookingDownward() {
    return lookingDownward;
  }

  public void setLookingDownward(Boolean lookingDownward) {
    this.lookingDownward = lookingDownward;
  }

  public Traits lookingFront(Boolean lookingFront) {
    this.lookingFront = lookingFront;
    return this;
  }

   /**
   * Get lookingFront
   * @return lookingFront
  **/
  @ApiModelProperty(value = "")
  public Boolean isLookingFront() {
    return lookingFront;
  }

  public void setLookingFront(Boolean lookingFront) {
    this.lookingFront = lookingFront;
  }

  public Traits lookingLeft(Boolean lookingLeft) {
    this.lookingLeft = lookingLeft;
    return this;
  }

   /**
   * Get lookingLeft
   * @return lookingLeft
  **/
  @ApiModelProperty(value = "")
  public Boolean isLookingLeft() {
    return lookingLeft;
  }

  public void setLookingLeft(Boolean lookingLeft) {
    this.lookingLeft = lookingLeft;
  }

  public Traits lookingRight(Boolean lookingRight) {
    this.lookingRight = lookingRight;
    return this;
  }

   /**
   * Get lookingRight
   * @return lookingRight
  **/
  @ApiModelProperty(value = "")
  public Boolean isLookingRight() {
    return lookingRight;
  }

  public void setLookingRight(Boolean lookingRight) {
    this.lookingRight = lookingRight;
  }

  public Traits lookingUpward(Boolean lookingUpward) {
    this.lookingUpward = lookingUpward;
    return this;
  }

   /**
   * Get lookingUpward
   * @return lookingUpward
  **/
  @ApiModelProperty(value = "")
  public Boolean isLookingUpward() {
    return lookingUpward;
  }

  public void setLookingUpward(Boolean lookingUpward) {
    this.lookingUpward = lookingUpward;
  }

  public Traits mustache(Integer mustache) {
    this.mustache = mustache;
    return this;
  }

   /**
   * Get mustache
   * minimum: -128
   * maximum: 127
   * @return mustache
  **/
  @ApiModelProperty(value = "")
  public Integer getMustache() {
    return mustache;
  }

  public void setMustache(Integer mustache) {
    this.mustache = mustache;
  }

  public Traits openMouth(Integer openMouth) {
    this.openMouth = openMouth;
    return this;
  }

   /**
   * Get openMouth
   * minimum: -128
   * maximum: 127
   * @return openMouth
  **/
  @ApiModelProperty(value = "")
  public Integer getOpenMouth() {
    return openMouth;
  }

  public void setOpenMouth(Integer openMouth) {
    this.openMouth = openMouth;
  }

  public Traits rightEyeClosed(Boolean rightEyeClosed) {
    this.rightEyeClosed = rightEyeClosed;
    return this;
  }

   /**
   * Get rightEyeClosed
   * @return rightEyeClosed
  **/
  @ApiModelProperty(value = "")
  public Boolean isRightEyeClosed() {
    return rightEyeClosed;
  }

  public void setRightEyeClosed(Boolean rightEyeClosed) {
    this.rightEyeClosed = rightEyeClosed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Traits traits = (Traits) o;
    return Objects.equals(this.ambosOjosCerrados, traits.ambosOjosCerrados) &&
        Objects.equals(this.beard, traits.beard) &&
        Objects.equals(this.darkGlasses, traits.darkGlasses) &&
        Objects.equals(this.glasses, traits.glasses) &&
        Objects.equals(this.hat, traits.hat) &&
        Objects.equals(this.leftEyeClosed, traits.leftEyeClosed) &&
        Objects.equals(this.lookingDownward, traits.lookingDownward) &&
        Objects.equals(this.lookingFront, traits.lookingFront) &&
        Objects.equals(this.lookingLeft, traits.lookingLeft) &&
        Objects.equals(this.lookingRight, traits.lookingRight) &&
        Objects.equals(this.lookingUpward, traits.lookingUpward) &&
        Objects.equals(this.mustache, traits.mustache) &&
        Objects.equals(this.openMouth, traits.openMouth) &&
        Objects.equals(this.rightEyeClosed, traits.rightEyeClosed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ambosOjosCerrados, beard, darkGlasses, glasses, hat, leftEyeClosed, lookingDownward, lookingFront, lookingLeft, lookingRight, lookingUpward, mustache, openMouth, rightEyeClosed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Traits {\n");
    
    sb.append("    ambosOjosCerrados: ").append(toIndentedString(ambosOjosCerrados)).append("\n");
    sb.append("    beard: ").append(toIndentedString(beard)).append("\n");
    sb.append("    darkGlasses: ").append(toIndentedString(darkGlasses)).append("\n");
    sb.append("    glasses: ").append(toIndentedString(glasses)).append("\n");
    sb.append("    hat: ").append(toIndentedString(hat)).append("\n");
    sb.append("    leftEyeClosed: ").append(toIndentedString(leftEyeClosed)).append("\n");
    sb.append("    lookingDownward: ").append(toIndentedString(lookingDownward)).append("\n");
    sb.append("    lookingFront: ").append(toIndentedString(lookingFront)).append("\n");
    sb.append("    lookingLeft: ").append(toIndentedString(lookingLeft)).append("\n");
    sb.append("    lookingRight: ").append(toIndentedString(lookingRight)).append("\n");
    sb.append("    lookingUpward: ").append(toIndentedString(lookingUpward)).append("\n");
    sb.append("    mustache: ").append(toIndentedString(mustache)).append("\n");
    sb.append("    openMouth: ").append(toIndentedString(openMouth)).append("\n");
    sb.append("    rightEyeClosed: ").append(toIndentedString(rightEyeClosed)).append("\n");
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

