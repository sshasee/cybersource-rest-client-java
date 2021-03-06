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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Tmsv1paymentinstrumentsProcessingInformationBankTransferOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-08T03:47:28.632+05:30")
public class Tmsv1paymentinstrumentsProcessingInformationBankTransferOptions {
  @SerializedName("SECCode")
  private String seCCode = null;

  public Tmsv1paymentinstrumentsProcessingInformationBankTransferOptions seCCode(String seCCode) {
    this.seCCode = seCCode;
    return this;
  }

   /**
   * Authorization method used for the transaction.(acceptable values are CCD, PPD, TEL, WEB).
   * @return seCCode
  **/
  @ApiModelProperty(example = "WEB", value = "Authorization method used for the transaction.(acceptable values are CCD, PPD, TEL, WEB).")
  public String getSeCCode() {
    return seCCode;
  }

  public void setSeCCode(String seCCode) {
    this.seCCode = seCCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tmsv1paymentinstrumentsProcessingInformationBankTransferOptions tmsv1paymentinstrumentsProcessingInformationBankTransferOptions = (Tmsv1paymentinstrumentsProcessingInformationBankTransferOptions) o;
    return Objects.equals(this.seCCode, tmsv1paymentinstrumentsProcessingInformationBankTransferOptions.seCCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seCCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tmsv1paymentinstrumentsProcessingInformationBankTransferOptions {\n");
    
    sb.append("    seCCode: ").append(toIndentedString(seCCode)).append("\n");
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

