/*
 * (C) Copyright IBM Corp. 2020.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.platform_services.iam_identity.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Input body parameters for the Create API key V1 REST request.
 */
public class CreateApiKeyRequest extends GenericModel {

  protected String name;
  protected String description;
  @SerializedName("iam_id")
  protected String iamId;
  @SerializedName("account_id")
  protected String accountId;
  protected String apikey;
  @SerializedName("store_value")
  protected Boolean storeValue;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String description;
    private String iamId;
    private String accountId;
    private String apikey;
    private Boolean storeValue;

    private Builder(CreateApiKeyRequest createApiKeyRequest) {
      this.name = createApiKeyRequest.name;
      this.description = createApiKeyRequest.description;
      this.iamId = createApiKeyRequest.iamId;
      this.accountId = createApiKeyRequest.accountId;
      this.apikey = createApiKeyRequest.apikey;
      this.storeValue = createApiKeyRequest.storeValue;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param name the name
     * @param iamId the iamId
     */
    public Builder(String name, String iamId) {
      this.name = name;
      this.iamId = iamId;
    }

    /**
     * Builds a CreateApiKeyRequest.
     *
     * @return the new CreateApiKeyRequest instance
     */
    public CreateApiKeyRequest build() {
      return new CreateApiKeyRequest(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateApiKeyRequest builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateApiKeyRequest builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the iamId.
     *
     * @param iamId the iamId
     * @return the CreateApiKeyRequest builder
     */
    public Builder iamId(String iamId) {
      this.iamId = iamId;
      return this;
    }

    /**
     * Set the accountId.
     *
     * @param accountId the accountId
     * @return the CreateApiKeyRequest builder
     */
    public Builder accountId(String accountId) {
      this.accountId = accountId;
      return this;
    }

    /**
     * Set the apikey.
     *
     * @param apikey the apikey
     * @return the CreateApiKeyRequest builder
     */
    public Builder apikey(String apikey) {
      this.apikey = apikey;
      return this;
    }

    /**
     * Set the storeValue.
     *
     * @param storeValue the storeValue
     * @return the CreateApiKeyRequest builder
     */
    public Builder storeValue(Boolean storeValue) {
      this.storeValue = storeValue;
      return this;
    }
  }

  protected CreateApiKeyRequest(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.iamId,
      "iamId cannot be null");
    name = builder.name;
    description = builder.description;
    iamId = builder.iamId;
    accountId = builder.accountId;
    apikey = builder.apikey;
    storeValue = builder.storeValue;
  }

  /**
   * New builder.
   *
   * @return a CreateApiKeyRequest builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Name of the API key. The name is not checked for uniqueness. Therefore multiple names with the same value can
   * exist. Access is done via the UUID of the API key.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * The optional description of the API key. The 'description' property is only available if a description was provided
   * during a create of an API key.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the iamId.
   *
   * The iam_id that this API key authenticates.
   *
   * @return the iamId
   */
  public String iamId() {
    return iamId;
  }

  /**
   * Gets the accountId.
   *
   * The account ID of the API key.
   *
   * @return the accountId
   */
  public String accountId() {
    return accountId;
  }

  /**
   * Gets the apikey.
   *
   * You can optionally passthrough the API key value for this API key. If passed, NO validation of that apiKey value is
   * done, i.e. the value can be non-URL safe. If omitted, the API key management will create an URL safe opaque API key
   * value. The value of the API key is checked for uniqueness. Please ensure enough variations when passing in this
   * value.
   *
   * @return the apikey
   */
  public String apikey() {
    return apikey;
  }

  /**
   * Gets the storeValue.
   *
   * Send true or false to set whether the API key value is retrievable in the future by using the Get details of an API
   * key request. If you create an API key for a user, you must specify `false` or omit the value. We don't allow
   * storing of API keys for users.
   *
   * @return the storeValue
   */
  public Boolean storeValue() {
    return storeValue;
  }
}

