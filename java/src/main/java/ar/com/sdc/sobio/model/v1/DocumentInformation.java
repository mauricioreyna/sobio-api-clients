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
import ar.com.sdc.sobio.model.v1.DocumentDate;
import ar.com.sdc.sobio.model.v1.Face;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DocumentInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T14:38:20.209-03:00")
public class DocumentInformation {
  @JsonProperty("address")
  private String address = null;

  @JsonProperty("addressConfidence")
  private Integer addressConfidence = null;

  @JsonProperty("code1")
  private String code1 = null;

  @JsonProperty("code2")
  private String code2 = null;

  @JsonProperty("dateOfBirth")
  private DocumentDate dateOfBirth = null;

  @JsonProperty("documentNumber")
  private String documentNumber = null;

  /**
   * Gets or Sets documentType
   */
  public enum DocumentTypeEnum {
    PASSPORT("PASSPORT"),
    
    TYPE_I("TYPE_I"),
    
    TYPE_A("TYPE_A"),
    
    CREWMEMBER("CREWMEMBER"),
    
    TYPE_C("TYPE_C"),
    
    VISA("VISA"),
    
    MIGRANT("MIGRANT"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    DocumentTypeEnum(String value) {
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
    public static DocumentTypeEnum fromValue(String text) {
      for (DocumentTypeEnum b : DocumentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("documentType")
  private DocumentTypeEnum documentType = null;

  /**
   * Gets or Sets documentVersion
   */
  public enum DocumentVersionEnum {
    UNKNOWN("UNKNOWN"),
    
    ARGENTINA_ID_V1("ARGENTINA_ID_V1"),
    
    ARGENTINA_ID_V2("ARGENTINA_ID_V2");

    private String value;

    DocumentVersionEnum(String value) {
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
    public static DocumentVersionEnum fromValue(String text) {
      for (DocumentVersionEnum b : DocumentVersionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("documentVersion")
  private DocumentVersionEnum documentVersion = null;

  @JsonProperty("expirationDate")
  private DocumentDate expirationDate = null;

  @JsonProperty("face")
  private Face face = null;

  @JsonProperty("givenNames")
  private String givenNames = null;

  @JsonProperty("issuingCountry")
  private String issuingCountry = null;

  @JsonProperty("nationality")
  private String nationality = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("sequence")
  private String sequence = null;

  /**
   * Gets or Sets sex
   */
  public enum SexEnum {
    MALE("MALE"),
    
    FEMALE("FEMALE"),
    
    UNSPECIFIED("UNSPECIFIED");

    private String value;

    SexEnum(String value) {
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
    public static SexEnum fromValue(String text) {
      for (SexEnum b : SexEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("sex")
  private SexEnum sex = null;

  @JsonProperty("surname")
  private String surname = null;

  @JsonProperty("validComposite")
  private Boolean validComposite = null;

  @JsonProperty("validDateOfBirth")
  private Boolean validDateOfBirth = null;

  @JsonProperty("validDocumentNumber")
  private Boolean validDocumentNumber = null;

  @JsonProperty("validExpirationDate")
  private Boolean validExpirationDate = null;

  public DocumentInformation address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public DocumentInformation addressConfidence(Integer addressConfidence) {
    this.addressConfidence = addressConfidence;
    return this;
  }

   /**
   * Get addressConfidence
   * @return addressConfidence
  **/
  @ApiModelProperty(value = "")
  public Integer getAddressConfidence() {
    return addressConfidence;
  }

  public void setAddressConfidence(Integer addressConfidence) {
    this.addressConfidence = addressConfidence;
  }

  public DocumentInformation code1(String code1) {
    this.code1 = code1;
    return this;
  }

   /**
   * Get code1
   * @return code1
  **/
  @ApiModelProperty(value = "")
  public String getCode1() {
    return code1;
  }

  public void setCode1(String code1) {
    this.code1 = code1;
  }

  public DocumentInformation code2(String code2) {
    this.code2 = code2;
    return this;
  }

   /**
   * Get code2
   * @return code2
  **/
  @ApiModelProperty(value = "")
  public String getCode2() {
    return code2;
  }

  public void setCode2(String code2) {
    this.code2 = code2;
  }

  public DocumentInformation dateOfBirth(DocumentDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "")
  public DocumentDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(DocumentDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public DocumentInformation documentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
    return this;
  }

   /**
   * Get documentNumber
   * @return documentNumber
  **/
  @ApiModelProperty(value = "")
  public String getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  public DocumentInformation documentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
    return this;
  }

   /**
   * Get documentType
   * @return documentType
  **/
  @ApiModelProperty(value = "")
  public DocumentTypeEnum getDocumentType() {
    return documentType;
  }

  public void setDocumentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
  }

  public DocumentInformation documentVersion(DocumentVersionEnum documentVersion) {
    this.documentVersion = documentVersion;
    return this;
  }

   /**
   * Get documentVersion
   * @return documentVersion
  **/
  @ApiModelProperty(value = "")
  public DocumentVersionEnum getDocumentVersion() {
    return documentVersion;
  }

  public void setDocumentVersion(DocumentVersionEnum documentVersion) {
    this.documentVersion = documentVersion;
  }

  public DocumentInformation expirationDate(DocumentDate expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @ApiModelProperty(value = "")
  public DocumentDate getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(DocumentDate expirationDate) {
    this.expirationDate = expirationDate;
  }

  public DocumentInformation face(Face face) {
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

  public DocumentInformation givenNames(String givenNames) {
    this.givenNames = givenNames;
    return this;
  }

   /**
   * Get givenNames
   * @return givenNames
  **/
  @ApiModelProperty(value = "")
  public String getGivenNames() {
    return givenNames;
  }

  public void setGivenNames(String givenNames) {
    this.givenNames = givenNames;
  }

  public DocumentInformation issuingCountry(String issuingCountry) {
    this.issuingCountry = issuingCountry;
    return this;
  }

   /**
   * Get issuingCountry
   * @return issuingCountry
  **/
  @ApiModelProperty(value = "")
  public String getIssuingCountry() {
    return issuingCountry;
  }

  public void setIssuingCountry(String issuingCountry) {
    this.issuingCountry = issuingCountry;
  }

  public DocumentInformation nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

   /**
   * Get nationality
   * @return nationality
  **/
  @ApiModelProperty(value = "")
  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public DocumentInformation order(String order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(value = "")
  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public DocumentInformation sequence(String sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * Get sequence
   * @return sequence
  **/
  @ApiModelProperty(value = "")
  public String getSequence() {
    return sequence;
  }

  public void setSequence(String sequence) {
    this.sequence = sequence;
  }

  public DocumentInformation sex(SexEnum sex) {
    this.sex = sex;
    return this;
  }

   /**
   * Get sex
   * @return sex
  **/
  @ApiModelProperty(value = "")
  public SexEnum getSex() {
    return sex;
  }

  public void setSex(SexEnum sex) {
    this.sex = sex;
  }

  public DocumentInformation surname(String surname) {
    this.surname = surname;
    return this;
  }

   /**
   * Get surname
   * @return surname
  **/
  @ApiModelProperty(value = "")
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public DocumentInformation validComposite(Boolean validComposite) {
    this.validComposite = validComposite;
    return this;
  }

   /**
   * Get validComposite
   * @return validComposite
  **/
  @ApiModelProperty(value = "")
  public Boolean isValidComposite() {
    return validComposite;
  }

  public void setValidComposite(Boolean validComposite) {
    this.validComposite = validComposite;
  }

  public DocumentInformation validDateOfBirth(Boolean validDateOfBirth) {
    this.validDateOfBirth = validDateOfBirth;
    return this;
  }

   /**
   * Get validDateOfBirth
   * @return validDateOfBirth
  **/
  @ApiModelProperty(value = "")
  public Boolean isValidDateOfBirth() {
    return validDateOfBirth;
  }

  public void setValidDateOfBirth(Boolean validDateOfBirth) {
    this.validDateOfBirth = validDateOfBirth;
  }

  public DocumentInformation validDocumentNumber(Boolean validDocumentNumber) {
    this.validDocumentNumber = validDocumentNumber;
    return this;
  }

   /**
   * Get validDocumentNumber
   * @return validDocumentNumber
  **/
  @ApiModelProperty(value = "")
  public Boolean isValidDocumentNumber() {
    return validDocumentNumber;
  }

  public void setValidDocumentNumber(Boolean validDocumentNumber) {
    this.validDocumentNumber = validDocumentNumber;
  }

  public DocumentInformation validExpirationDate(Boolean validExpirationDate) {
    this.validExpirationDate = validExpirationDate;
    return this;
  }

   /**
   * Get validExpirationDate
   * @return validExpirationDate
  **/
  @ApiModelProperty(value = "")
  public Boolean isValidExpirationDate() {
    return validExpirationDate;
  }

  public void setValidExpirationDate(Boolean validExpirationDate) {
    this.validExpirationDate = validExpirationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentInformation documentInformation = (DocumentInformation) o;
    return Objects.equals(this.address, documentInformation.address) &&
        Objects.equals(this.addressConfidence, documentInformation.addressConfidence) &&
        Objects.equals(this.code1, documentInformation.code1) &&
        Objects.equals(this.code2, documentInformation.code2) &&
        Objects.equals(this.dateOfBirth, documentInformation.dateOfBirth) &&
        Objects.equals(this.documentNumber, documentInformation.documentNumber) &&
        Objects.equals(this.documentType, documentInformation.documentType) &&
        Objects.equals(this.documentVersion, documentInformation.documentVersion) &&
        Objects.equals(this.expirationDate, documentInformation.expirationDate) &&
        Objects.equals(this.face, documentInformation.face) &&
        Objects.equals(this.givenNames, documentInformation.givenNames) &&
        Objects.equals(this.issuingCountry, documentInformation.issuingCountry) &&
        Objects.equals(this.nationality, documentInformation.nationality) &&
        Objects.equals(this.order, documentInformation.order) &&
        Objects.equals(this.sequence, documentInformation.sequence) &&
        Objects.equals(this.sex, documentInformation.sex) &&
        Objects.equals(this.surname, documentInformation.surname) &&
        Objects.equals(this.validComposite, documentInformation.validComposite) &&
        Objects.equals(this.validDateOfBirth, documentInformation.validDateOfBirth) &&
        Objects.equals(this.validDocumentNumber, documentInformation.validDocumentNumber) &&
        Objects.equals(this.validExpirationDate, documentInformation.validExpirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, addressConfidence, code1, code2, dateOfBirth, documentNumber, documentType, documentVersion, expirationDate, face, givenNames, issuingCountry, nationality, order, sequence, sex, surname, validComposite, validDateOfBirth, validDocumentNumber, validExpirationDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentInformation {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressConfidence: ").append(toIndentedString(addressConfidence)).append("\n");
    sb.append("    code1: ").append(toIndentedString(code1)).append("\n");
    sb.append("    code2: ").append(toIndentedString(code2)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    documentVersion: ").append(toIndentedString(documentVersion)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    face: ").append(toIndentedString(face)).append("\n");
    sb.append("    givenNames: ").append(toIndentedString(givenNames)).append("\n");
    sb.append("    issuingCountry: ").append(toIndentedString(issuingCountry)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    validComposite: ").append(toIndentedString(validComposite)).append("\n");
    sb.append("    validDateOfBirth: ").append(toIndentedString(validDateOfBirth)).append("\n");
    sb.append("    validDocumentNumber: ").append(toIndentedString(validDocumentNumber)).append("\n");
    sb.append("    validExpirationDate: ").append(toIndentedString(validExpirationDate)).append("\n");
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

