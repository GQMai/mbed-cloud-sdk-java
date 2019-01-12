/*
 * Mbed Cloud API
 * The full Mbed Cloud API
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
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * Block
 */

public class Block implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("category")
    private String category = null;

    @SerializedName("description")
    private String description = null;

    public Block category(String category) {
        this.category = category;
        return this;
    }

    /**
     * The reference of the block category.
     * 
     * @return category
     **/
    @ApiModelProperty(example = "maintenance", value = "The reference of the block category.")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Block description(String description) {
        this.description = description;
        return this;
    }

    /**
     * The most recent description why the device was suspended or returned to service.
     * 
     * @return description
     **/
    @ApiModelProperty(example = "Suspended for maintenance.",
                      value = "The most recent description why the device was suspended or returned to service.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Block block = (Block) o;
        return Objects.equals(this.category, block.category) && Objects.equals(this.description, block.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Block {\n");

        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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