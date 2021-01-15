/*
 * Pelion Device Management API
 * Pelion Device Management API build from the publicly defined API definitions.
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model;

import java.util.Objects;
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
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * Represents an application in Device Management.
 */
@ApiModel(description = "Represents an application in Device Management.")

public class Application implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("account_id")
    private String accountId = null;

    @SerializedName("created_at")
    private DateTime createdAt = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("etag")
    private String etag = null;

    @SerializedName("groups")
    private List<String> groups = null;

    @SerializedName("id")
    private String id = null;

    @SerializedName("last_used_at")
    private DateTime lastUsedAt = null;

    @SerializedName("name")
    private String name = null;

    /**
     * Entity name: always &#39;application&#39;
     */
    @JsonAdapter(ObjectEnum.Adapter.class)
    public enum ObjectEnum {
        APPLICATION("application");

        private String value;

        ObjectEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ObjectEnum fromValue(String text) {
            for (ObjectEnum b : ObjectEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ObjectEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ObjectEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ObjectEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ObjectEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("object")
    private ObjectEnum object = null;

    /**
     * The status of the application. When admin sets the application as inactive all related data and configurations
     * are cleared from the system. If application is activated again, client must open new channels and set new
     * subscriptions to start receiving events again.
     */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        ACTIVE("ACTIVE"),

        INACTIVE("INACTIVE");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<StatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StatusEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("status")
    private StatusEnum status = null;

    @SerializedName("updated_at")
    private DateTime updatedAt = null;

    /**
     * The ID of the account.
     * 
     * @return accountId
     **/
    @ApiModelProperty(example = "01619571e2e90242ac12000600000000", value = "The ID of the account.")
    public String getAccountId() {
        return accountId;
    }

    /**
     * Creation UTC time RFC3339.
     * 
     * @return createdAt
     **/
    @ApiModelProperty(example = "2020-02-18T09:16:40Z", value = "Creation UTC time RFC3339.")
    public DateTime getCreatedAt() {
        return createdAt;
    }

    public Application description(String description) {
        this.description = description;
        return this;
    }

    /**
     * The description of the application.
     * 
     * @return description
     **/
    @ApiModelProperty(example = "Application to control the warp drive", value = "The description of the application.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * API resource entity version.
     * 
     * @return etag
     **/
    @ApiModelProperty(example = "1", value = "API resource entity version.")
    public String getEtag() {
        return etag;
    }

    public Application groups(List<String> groups) {
        this.groups = groups;
        return this;
    }

    public Application addGroupsItem(String groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<String>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    /**
     * A list of group IDs this application belongs to.
     * 
     * @return groups
     **/
    @ApiModelProperty(value = "A list of group IDs this application belongs to.")
    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    /**
     * The ID of the application.
     * 
     * @return id
     **/
    @ApiModelProperty(example = "01619571f7020242ac12000600000000", value = "The ID of the application.")
    public String getId() {
        return id;
    }

    /**
     * The time of the latest application usage.
     * 
     * @return lastUsedAt
     **/
    @ApiModelProperty(example = "2020-02-14T15:24:14Z", value = "The time of the latest application usage.")
    public DateTime getLastUsedAt() {
        return lastUsedAt;
    }

    public Application name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The display name for the application.
     * 
     * @return name
     **/
    @ApiModelProperty(example = "Application warp", required = true, value = "The display name for the application.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Entity name: always &#39;application&#39;
     * 
     * @return object
     **/
    @ApiModelProperty(value = "Entity name: always 'application'")
    public ObjectEnum getObject() {
        return object;
    }

    public Application status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * The status of the application. When admin sets the application as inactive all related data and configurations
     * are cleared from the system. If application is activated again, client must open new channels and set new
     * subscriptions to start receiving events again.
     * 
     * @return status
     **/
    @ApiModelProperty(example = "ACTIVE",
                      value = "The status of the application. When admin sets the application as inactive all related data and configurations are cleared from the system. If application is activated again, client must open new channels and set new subscriptions to start receiving events again.")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
     * Last update UTC time RFC3339.
     * 
     * @return updatedAt
     **/
    @ApiModelProperty(example = "2020-02-19T11:54:32Z", value = "Last update UTC time RFC3339.")
    public DateTime getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Application application = (Application) o;
        return Objects.equals(this.accountId, application.accountId)
               && Objects.equals(this.createdAt, application.createdAt)
               && Objects.equals(this.description, application.description)
               && Objects.equals(this.etag, application.etag) && Objects.equals(this.groups, application.groups)
               && Objects.equals(this.id, application.id) && Objects.equals(this.lastUsedAt, application.lastUsedAt)
               && Objects.equals(this.name, application.name) && Objects.equals(this.object, application.object)
               && Objects.equals(this.status, application.status)
               && Objects.equals(this.updatedAt, application.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, createdAt, description, etag, groups, id, lastUsedAt, name, object, status,
                            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Application {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    lastUsedAt: ").append(toIndentedString(lastUsedAt)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    object: ").append(toIndentedString(object)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}