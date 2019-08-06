/*
 * OData Service for Business Partner
 * This service enables you to create, read, update, and    delete master data related to Business Partners,    Suppliers, and Customers in an SAP S/4HANA system.
 *
 * OpenAPI spec version: 1 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sap.apibhub.sdk.api_business_partner.model;

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
 * Customer Company Dunning
 */
@ApiModel(description = "Customer Company Dunning")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-01T06:30:25.755Z")
public class APIBUSINESSPARTNERACustomerDunningType {
  @SerializedName("Customer")
  private String customer = null;

  @SerializedName("CompanyCode")
  private String companyCode = null;

  @SerializedName("DunningArea")
  private String dunningArea = null;

  public APIBUSINESSPARTNERACustomerDunningType customer(String customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Customer Number   Gives an alphanumeric key, which clearly identifies the customer or vendor in the SAP system.
   * @return customer
  **/
  @ApiModelProperty(value = "Customer Number   Gives an alphanumeric key, which clearly identifies the customer or vendor in the SAP system.")
  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }

  public APIBUSINESSPARTNERACustomerDunningType companyCode(String companyCode) {
    this.companyCode = companyCode;
    return this;
  }

   /**
   * The company code is an organizational unit within financial accounting.
   * @return companyCode
  **/
  @ApiModelProperty(value = "The company code is an organizational unit within financial accounting.")
  public String getCompanyCode() {
    return companyCode;
  }

  public void setCompanyCode(String companyCode) {
    this.companyCode = companyCode;
  }

  public APIBUSINESSPARTNERACustomerDunningType dunningArea(String dunningArea) {
    this.dunningArea = dunningArea;
    return this;
  }

   /**
   * The dunning area represents an organizational entity that is responsible for dunning. The dunning areas represent a sub-structure of the company codes.   If different responsibilities or different dunning procedures exist within a company code, you can set up corresponding dunning areas.All dunning notices are made separately according to dunning areas, and if necessary with different dunning procedures.The dunning area must be noted in the line items. As long as documents are copied from preliminary work areas (billing documents), the dunning area can be derived from details such as division or sales area, if necessary.
   * @return dunningArea
  **/
  @ApiModelProperty(value = "The dunning area represents an organizational entity that is responsible for dunning. The dunning areas represent a sub-structure of the company codes.   If different responsibilities or different dunning procedures exist within a company code, you can set up corresponding dunning areas.All dunning notices are made separately according to dunning areas, and if necessary with different dunning procedures.The dunning area must be noted in the line items. As long as documents are copied from preliminary work areas (billing documents), the dunning area can be derived from details such as division or sales area, if necessary.")
  public String getDunningArea() {
    return dunningArea;
  }

  public void setDunningArea(String dunningArea) {
    this.dunningArea = dunningArea;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIBUSINESSPARTNERACustomerDunningType apIBUSINESSPARTNERACustomerDunningType = (APIBUSINESSPARTNERACustomerDunningType) o;
    return Objects.equals(this.customer, apIBUSINESSPARTNERACustomerDunningType.customer) &&
        Objects.equals(this.companyCode, apIBUSINESSPARTNERACustomerDunningType.companyCode) &&
        Objects.equals(this.dunningArea, apIBUSINESSPARTNERACustomerDunningType.dunningArea);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, companyCode, dunningArea);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIBUSINESSPARTNERACustomerDunningType {\n");
    
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    companyCode: ").append(toIndentedString(companyCode)).append("\n");
    sb.append("    dunningArea: ").append(toIndentedString(dunningArea)).append("\n");
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
