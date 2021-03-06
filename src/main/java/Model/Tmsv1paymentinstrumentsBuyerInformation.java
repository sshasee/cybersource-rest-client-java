/*
 * CyberSource Flex API
 * Simple PAN tokenization service
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Model;

import java.util.Objects;
import Model.Tmsv1paymentinstrumentsBuyerInformationPersonalIdentification;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Tmsv1paymentinstrumentsBuyerInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-08T03:47:28.632+05:30")
public class Tmsv1paymentinstrumentsBuyerInformation {
  @SerializedName("companyTaxID")
  private String companyTaxID = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("dateOBirth")
  private String dateOBirth = null;

  @SerializedName("personalIdentification")
  private List<Tmsv1paymentinstrumentsBuyerInformationPersonalIdentification> personalIdentification = null;

  public Tmsv1paymentinstrumentsBuyerInformation companyTaxID(String companyTaxID) {
    this.companyTaxID = companyTaxID;
    return this;
  }

   /**
   * Company Tax ID.
   * @return companyTaxID
  **/
  @ApiModelProperty(example = "1234567890123456800", value = "Company Tax ID.")
  public String getCompanyTaxID() {
    return companyTaxID;
  }

  public void setCompanyTaxID(String companyTaxID) {
    this.companyTaxID = companyTaxID;
  }

  public Tmsv1paymentinstrumentsBuyerInformation currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency. Accepts input in the ISO 4217 standard, stores as ISO 4217 Alpha
   * @return currency
  **/
  @ApiModelProperty(example = "USD", value = "Currency. Accepts input in the ISO 4217 standard, stores as ISO 4217 Alpha")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Tmsv1paymentinstrumentsBuyerInformation dateOBirth(String dateOBirth) {
    this.dateOBirth = dateOBirth;
    return this;
  }

   /**
   * Date of birth YYYY-MM-DD.
   * @return dateOBirth
  **/
  @ApiModelProperty(example = "1960-12-30", value = "Date of birth YYYY-MM-DD.")
  public String getDateOBirth() {
    return dateOBirth;
  }

  public void setDateOBirth(String dateOBirth) {
    this.dateOBirth = dateOBirth;
  }

  public Tmsv1paymentinstrumentsBuyerInformation personalIdentification(List<Tmsv1paymentinstrumentsBuyerInformationPersonalIdentification> personalIdentification) {
    this.personalIdentification = personalIdentification;
    return this;
  }

  public Tmsv1paymentinstrumentsBuyerInformation addPersonalIdentificationItem(Tmsv1paymentinstrumentsBuyerInformationPersonalIdentification personalIdentificationItem) {
    if (this.personalIdentification == null) {
      this.personalIdentification = new ArrayList<Tmsv1paymentinstrumentsBuyerInformationPersonalIdentification>();
    }
    this.personalIdentification.add(personalIdentificationItem);
    return this;
  }

   /**
   * Get personalIdentification
   * @return personalIdentification
  **/
  @ApiModelProperty(value = "")
  public List<Tmsv1paymentinstrumentsBuyerInformationPersonalIdentification> getPersonalIdentification() {
    return personalIdentification;
  }

  public void setPersonalIdentification(List<Tmsv1paymentinstrumentsBuyerInformationPersonalIdentification> personalIdentification) {
    this.personalIdentification = personalIdentification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv1paymentinstrumentsBuyerInformation tmsv1paymentinstrumentsBuyerInformation = (Tmsv1paymentinstrumentsBuyerInformation) o;
    return Objects.equals(this.companyTaxID, tmsv1paymentinstrumentsBuyerInformation.companyTaxID) &&
        Objects.equals(this.currency, tmsv1paymentinstrumentsBuyerInformation.currency) &&
        Objects.equals(this.dateOBirth, tmsv1paymentinstrumentsBuyerInformation.dateOBirth) &&
        Objects.equals(this.personalIdentification, tmsv1paymentinstrumentsBuyerInformation.personalIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyTaxID, currency, dateOBirth, personalIdentification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv1paymentinstrumentsBuyerInformation {\n");
    
    sb.append("    companyTaxID: ").append(toIndentedString(companyTaxID)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dateOBirth: ").append(toIndentedString(dateOBirth)).append("\n");
    sb.append("    personalIdentification: ").append(toIndentedString(personalIdentification)).append("\n");
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

