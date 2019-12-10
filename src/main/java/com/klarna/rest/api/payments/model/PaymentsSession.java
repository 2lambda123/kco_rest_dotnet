/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.api.payments.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.klarna.rest.api.payments.model.PaymentsAddress;
import com.klarna.rest.api.payments.model.PaymentsAttachment;
import com.klarna.rest.api.payments.model.PaymentsCustomer;
import com.klarna.rest.api.payments.model.PaymentsMerchantUrls;
import com.klarna.rest.api.payments.model.PaymentsOptions;
import com.klarna.rest.api.payments.model.PaymentsOrderLine;
import com.klarna.rest.api.payments.model.PaymentsPaymentMethodCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;

/**
 * PaymentsSession
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-05T12:55:42.744Z")
public class PaymentsSession {
  @JsonProperty("acquiring_channel")
  private String acquiringChannel = null;

  @JsonProperty("attachment")
  private PaymentsAttachment attachment = null;

  @JsonProperty("authorization_token")
  private String authorizationToken = null;

  @JsonProperty("billing_address")
  private PaymentsAddress billingAddress = null;

  @JsonProperty("client_token")
  private String clientToken = null;

  @JsonProperty("custom_payment_method_ids")
  private List<String> customPaymentMethodIds = null;

  @JsonProperty("customer")
  private PaymentsCustomer customer = null;

  @JsonProperty("design")
  private String design = null;

  @JsonProperty("expires_at")
  private OffsetDateTime expiresAt = null;

  @JsonProperty("locale")
  private String locale = null;

  @JsonProperty("merchant_data")
  private String merchantData = null;

  @JsonProperty("merchant_reference1")
  private String merchantReference1 = null;

  @JsonProperty("merchant_reference2")
  private String merchantReference2 = null;

  @JsonProperty("merchant_urls")
  private PaymentsMerchantUrls merchantUrls = null;

  @JsonProperty("options")
  private PaymentsOptions options = null;

  @JsonProperty("order_amount")
  private Long orderAmount = null;

  @JsonProperty("order_lines")
  private List<PaymentsOrderLine> orderLines = new ArrayList<PaymentsOrderLine>();

  @JsonProperty("order_tax_amount")
  private Long orderTaxAmount = null;

  @JsonProperty("payment_method_categories")
  private List<PaymentsPaymentMethodCategory> paymentMethodCategories = null;

  @JsonProperty("purchase_country")
  private String purchaseCountry = null;

  @JsonProperty("purchase_currency")
  private String purchaseCurrency = null;

  @JsonProperty("shipping_address")
  private PaymentsAddress shippingAddress = null;

  /**
   * The current status of the session. Possible values: &#39;complete&#39;, &#39;incomplete&#39; where &#39;complete&#39; is set when the order has been placed.
   */
  public enum StatusEnum {
    COMPLETE("complete"),
    
    INCOMPLETE("incomplete");

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

  public PaymentsSession acquiringChannel(String acquiringChannel) {
    this.acquiringChannel = acquiringChannel;
    return this;
  }

   /**
   * Type of acquiring channel
   * @return acquiringChannel
  **/
  @ApiModelProperty(example = "in_store", value = "Type of acquiring channel")
  public String getAcquiringChannel() {
    return acquiringChannel;
  }

  public void setAcquiringChannel(String acquiringChannel) {
    this.acquiringChannel = acquiringChannel;
  }

  public PaymentsSession attachment(PaymentsAttachment attachment) {
    this.attachment = attachment;
    return this;
  }

   /**
   * Additional purchase information required for some industries.
   * @return attachment
  **/
  @ApiModelProperty(value = "Additional purchase information required for some industries.")
  public PaymentsAttachment getAttachment() {
    return attachment;
  }

  public void setAttachment(PaymentsAttachment attachment) {
    this.attachment = attachment;
  }

   /**
   * Authorization token.
   * @return authorizationToken
  **/
  @ApiModelProperty(value = "Authorization token.")
  public String getAuthorizationToken() {
    return authorizationToken;
  }

  public PaymentsSession billingAddress(PaymentsAddress billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Once the customer has provided any data in the checkout iframe, updates to this object will be ignored (without generating an error).
   * @return billingAddress
  **/
  @ApiModelProperty(value = "Once the customer has provided any data in the checkout iframe, updates to this object will be ignored (without generating an error).")
  public PaymentsAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(PaymentsAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

   /**
   * Token to be passed to the JS client
   * @return clientToken
  **/
  @ApiModelProperty(example = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.ewogICJzZXNzaW9uX2lkIiA6ICIw", value = "Token to be passed to the JS client")
  public String getClientToken() {
    return clientToken;
  }

  public PaymentsSession customPaymentMethodIds(List<String> customPaymentMethodIds) {
    this.customPaymentMethodIds = customPaymentMethodIds;
    return this;
  }

  public PaymentsSession addCustomPaymentMethodIdsItem(String customPaymentMethodIdsItem) {
    if (this.customPaymentMethodIds == null) {
      this.customPaymentMethodIds = new ArrayList<String>();
    }
    this.customPaymentMethodIds.add(customPaymentMethodIdsItem);
    return this;
  }

   /**
   * Ids for custom payment methods available in a given order. Only applicable in GB/US sessions.
   * @return customPaymentMethodIds
  **/
  @ApiModelProperty(value = "Ids for custom payment methods available in a given order. Only applicable in GB/US sessions.")
  public List<String> getCustomPaymentMethodIds() {
    return customPaymentMethodIds;
  }

  public void setCustomPaymentMethodIds(List<String> customPaymentMethodIds) {
    this.customPaymentMethodIds = customPaymentMethodIds;
  }

  public PaymentsSession customer(PaymentsCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Information about the liable customer of the order.
   * @return customer
  **/
  @ApiModelProperty(value = "Information about the liable customer of the order.")
  public PaymentsCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(PaymentsCustomer customer) {
    this.customer = customer;
  }

  public PaymentsSession design(String design) {
    this.design = design;
    return this;
  }

   /**
   * Get design
   * @return design
  **/
  @ApiModelProperty(value = "")
  public String getDesign() {
    return design;
  }

  public void setDesign(String design) {
    this.design = design;
  }

   /**
   * Session expiration date
   * @return expiresAt
  **/
  @ApiModelProperty(value = "Session expiration date")
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public PaymentsSession locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * RFC 1766 customer&#39;s locale.
   * @return locale
  **/
  @ApiModelProperty(example = "en-US", required = true, value = "RFC 1766 customer's locale.")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public PaymentsSession merchantData(String merchantData) {
    this.merchantData = merchantData;
    return this;
  }

   /**
   * Pass through field (max 1024 characters).
   * @return merchantData
  **/
  @ApiModelProperty(example = "{\"order_speicif\":[{\"substore\":\"Women's Fashion\",\"product_name\":\"Women Sweatshirt\"}]}", value = "Pass through field (max 1024 characters).")
  public String getMerchantData() {
    return merchantData;
  }

  public void setMerchantData(String merchantData) {
    this.merchantData = merchantData;
  }

  public PaymentsSession merchantReference1(String merchantReference1) {
    this.merchantReference1 = merchantReference1;
    return this;
  }

   /**
   * Used for storing merchant&#39;s internal order number or other reference. If set, will be shown on the confirmation page as \&quot;order number\&quot; and send to the customer in the confirmation mail after a successful direct bank transfer payment. It will also be included in the payments description in the customer&#39;s bank account (max 255 characters).
   * @return merchantReference1
  **/
  @ApiModelProperty(example = "45aa52f387871e3a210645d4", value = "Used for storing merchant's internal order number or other reference. If set, will be shown on the confirmation page as \"order number\" and send to the customer in the confirmation mail after a successful direct bank transfer payment. It will also be included in the payments description in the customer's bank account (max 255 characters).")
  public String getMerchantReference1() {
    return merchantReference1;
  }

  public void setMerchantReference1(String merchantReference1) {
    this.merchantReference1 = merchantReference1;
  }

  public PaymentsSession merchantReference2(String merchantReference2) {
    this.merchantReference2 = merchantReference2;
    return this;
  }

   /**
   * Used for storing merchant&#39;s internal order number or other reference (max 255 characters).
   * @return merchantReference2
  **/
  @ApiModelProperty(example = "45aa52f387871e3a210645d4", value = "Used for storing merchant's internal order number or other reference (max 255 characters).")
  public String getMerchantReference2() {
    return merchantReference2;
  }

  public void setMerchantReference2(String merchantReference2) {
    this.merchantReference2 = merchantReference2;
  }

  public PaymentsSession merchantUrls(PaymentsMerchantUrls merchantUrls) {
    this.merchantUrls = merchantUrls;
    return this;
  }

   /**
   * The merchant_urls object.
   * @return merchantUrls
  **/
  @ApiModelProperty(value = "The merchant_urls object.")
  public PaymentsMerchantUrls getMerchantUrls() {
    return merchantUrls;
  }

  public void setMerchantUrls(PaymentsMerchantUrls merchantUrls) {
    this.merchantUrls = merchantUrls;
  }

  public PaymentsSession options(PaymentsOptions options) {
    this.options = options;
    return this;
  }

   /**
   * Options for this purchase.
   * @return options
  **/
  @ApiModelProperty(value = "Options for this purchase.")
  public PaymentsOptions getOptions() {
    return options;
  }

  public void setOptions(PaymentsOptions options) {
    this.options = options;
  }

  public PaymentsSession orderAmount(Long orderAmount) {
    this.orderAmount = orderAmount;
    return this;
  }

   /**
   * Non-negative, minor units. Total amount of the order, including tax and any discounts.
   * minimum: 0
   * @return orderAmount
  **/
  @ApiModelProperty(required = true, value = "Non-negative, minor units. Total amount of the order, including tax and any discounts.")
  public Long getOrderAmount() {
    return orderAmount;
  }

  public void setOrderAmount(Long orderAmount) {
    this.orderAmount = orderAmount;
  }

  public PaymentsSession orderLines(List<PaymentsOrderLine> orderLines) {
    this.orderLines = orderLines;
    return this;
  }

  public PaymentsSession addOrderLinesItem(PaymentsOrderLine orderLinesItem) {
    this.orderLines.add(orderLinesItem);
    return this;
  }

   /**
   * The applicable order lines (max 1000)
   * @return orderLines
  **/
  @ApiModelProperty(required = true, value = "The applicable order lines (max 1000)")
  public List<PaymentsOrderLine> getOrderLines() {
    return orderLines;
  }

  public void setOrderLines(List<PaymentsOrderLine> orderLines) {
    this.orderLines = orderLines;
  }

  public PaymentsSession orderTaxAmount(Long orderTaxAmount) {
    this.orderTaxAmount = orderTaxAmount;
    return this;
  }

   /**
   * Non-negative, minor units. The total tax amount of the order.
   * minimum: 0
   * @return orderTaxAmount
  **/
  @ApiModelProperty(required = true, value = "Non-negative, minor units. The total tax amount of the order.")
  public Long getOrderTaxAmount() {
    return orderTaxAmount;
  }

  public void setOrderTaxAmount(Long orderTaxAmount) {
    this.orderTaxAmount = orderTaxAmount;
  }

   /**
   * Available payment method categories
   * @return paymentMethodCategories
  **/
  @ApiModelProperty(value = "Available payment method categories")
  public List<PaymentsPaymentMethodCategory> getPaymentMethodCategories() {
    return paymentMethodCategories;
  }

  public PaymentsSession purchaseCountry(String purchaseCountry) {
    this.purchaseCountry = purchaseCountry;
    return this;
  }

   /**
   * ISO 3166 alpha-2 purchase country.
   * @return purchaseCountry
  **/
  @ApiModelProperty(example = "US", required = true, value = "ISO 3166 alpha-2 purchase country.")
  public String getPurchaseCountry() {
    return purchaseCountry;
  }

  public void setPurchaseCountry(String purchaseCountry) {
    this.purchaseCountry = purchaseCountry;
  }

  public PaymentsSession purchaseCurrency(String purchaseCurrency) {
    this.purchaseCurrency = purchaseCurrency;
    return this;
  }

   /**
   * ISO 4217 purchase currency.
   * @return purchaseCurrency
  **/
  @ApiModelProperty(example = "USD", required = true, value = "ISO 4217 purchase currency.")
  public String getPurchaseCurrency() {
    return purchaseCurrency;
  }

  public void setPurchaseCurrency(String purchaseCurrency) {
    this.purchaseCurrency = purchaseCurrency;
  }

  public PaymentsSession shippingAddress(PaymentsAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Unless the customer has explicitly chosen to enter a separate shipping address, this is a clone of billing_address.
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "Unless the customer has explicitly chosen to enter a separate shipping address, this is a clone of billing_address.")
  public PaymentsAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(PaymentsAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

   /**
   * The current status of the session. Possible values: &#39;complete&#39;, &#39;incomplete&#39; where &#39;complete&#39; is set when the order has been placed.
   * @return status
  **/
  @ApiModelProperty(example = "complete", value = "The current status of the session. Possible values: 'complete', 'incomplete' where 'complete' is set when the order has been placed.")
  public StatusEnum getStatus() {
    return status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsSession session = (PaymentsSession) o;
    return Objects.equals(this.acquiringChannel, session.acquiringChannel) &&
        Objects.equals(this.attachment, session.attachment) &&
        Objects.equals(this.authorizationToken, session.authorizationToken) &&
        Objects.equals(this.billingAddress, session.billingAddress) &&
        Objects.equals(this.clientToken, session.clientToken) &&
        Objects.equals(this.customPaymentMethodIds, session.customPaymentMethodIds) &&
        Objects.equals(this.customer, session.customer) &&
        Objects.equals(this.design, session.design) &&
        Objects.equals(this.expiresAt, session.expiresAt) &&
        Objects.equals(this.locale, session.locale) &&
        Objects.equals(this.merchantData, session.merchantData) &&
        Objects.equals(this.merchantReference1, session.merchantReference1) &&
        Objects.equals(this.merchantReference2, session.merchantReference2) &&
        Objects.equals(this.merchantUrls, session.merchantUrls) &&
        Objects.equals(this.options, session.options) &&
        Objects.equals(this.orderAmount, session.orderAmount) &&
        Objects.equals(this.orderLines, session.orderLines) &&
        Objects.equals(this.orderTaxAmount, session.orderTaxAmount) &&
        Objects.equals(this.paymentMethodCategories, session.paymentMethodCategories) &&
        Objects.equals(this.purchaseCountry, session.purchaseCountry) &&
        Objects.equals(this.purchaseCurrency, session.purchaseCurrency) &&
        Objects.equals(this.shippingAddress, session.shippingAddress) &&
        Objects.equals(this.status, session.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acquiringChannel, attachment, authorizationToken, billingAddress, clientToken, customPaymentMethodIds, customer, design, expiresAt, locale, merchantData, merchantReference1, merchantReference2, merchantUrls, options, orderAmount, orderLines, orderTaxAmount, paymentMethodCategories, purchaseCountry, purchaseCurrency, shippingAddress, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsSession {\n");
    
    sb.append("    acquiringChannel: ").append(toIndentedString(acquiringChannel)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    authorizationToken: ").append(toIndentedString(authorizationToken)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
    sb.append("    customPaymentMethodIds: ").append(toIndentedString(customPaymentMethodIds)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    design: ").append(toIndentedString(design)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    merchantData: ").append(toIndentedString(merchantData)).append("\n");
    sb.append("    merchantReference1: ").append(toIndentedString(merchantReference1)).append("\n");
    sb.append("    merchantReference2: ").append(toIndentedString(merchantReference2)).append("\n");
    sb.append("    merchantUrls: ").append(toIndentedString(merchantUrls)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    orderAmount: ").append(toIndentedString(orderAmount)).append("\n");
    sb.append("    orderLines: ").append(toIndentedString(orderLines)).append("\n");
    sb.append("    orderTaxAmount: ").append(toIndentedString(orderTaxAmount)).append("\n");
    sb.append("    paymentMethodCategories: ").append(toIndentedString(paymentMethodCategories)).append("\n");
    sb.append("    purchaseCountry: ").append(toIndentedString(purchaseCountry)).append("\n");
    sb.append("    purchaseCurrency: ").append(toIndentedString(purchaseCurrency)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
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
