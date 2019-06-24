// This file was generated by the Pelion SDK foundation code generator.
// This is an autogenerated class. Do not modify its content as modifications will be lost at next code generation.
package com.arm.mbed.cloud.sdk.branding.adapters;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.branding.model.DarkThemeColor;
import com.arm.mbed.cloud.sdk.branding.model.DarkThemeColorReference;
import com.arm.mbed.cloud.sdk.common.GenericAdapter;
import com.arm.mbed.cloud.sdk.common.TranslationUtils;
import com.arm.mbed.cloud.sdk.common.listing.ListResponse;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.BrandingColor;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.BrandingColorList;
import java.util.List;

/**
 * Adapter for dark theme colors.
 */
@Preamble(description = "Adapter for dark theme colors.")
@Internal
@SuppressWarnings("checkstyle:LineLength")
public final class DarkThemeColorAdapter {
    /**
     * Constructor.
     */
    private DarkThemeColorAdapter() {
        super();
        // Nothing to do;
    }

    /**
     * Maps a branding color list into a dark theme color.
     * 
     * @param toBeMapped
     *            a branding color list.
     * @return mapped list response
     */
    @Internal
    public static ListResponse<DarkThemeColor> mapList(BrandingColorList toBeMapped) {
        final BrandingColorList finalList = toBeMapped;
        final GenericAdapter.RespList<BrandingColor> respList = new GenericAdapter.RespList<BrandingColor>() {
            /**
             * Executes getAfter.
             * 
             * @return something
             */
            @Override
            public String getAfter() {
                return (finalList == null) ? null : finalList.getAfter();
            }

            /**
             * Executes getContinuationMarker.
             * 
             * @return something
             */
            @Override
            public String getContinuationMarker() {
                return null;
            }

            /**
             * Executes getData.
             * 
             * @return something
             */
            @Override
            public List<BrandingColor> getData() {
                return (finalList == null) ? null : finalList.getData();
            }

            /**
             * Executes getHasMore.
             * 
             * @return something
             */
            @Override
            public Boolean getHasMore() {
                return (finalList == null) ? null : finalList.isHasMore();
            }

            /**
             * Executes getLimit.
             * 
             * @return something
             */
            @Override
            public Integer getLimit() {
                return (finalList == null) ? null : finalList.getLimit();
            }

            /**
             * Executes getOrder.
             * 
             * @return something
             */
            @Override
            public String getOrder() {
                return (finalList == null) ? null : finalList.getOrder().toString();
            }

            /**
             * Executes getTotalCount.
             * 
             * @return something
             */
            @Override
            public Integer getTotalCount() {
                return (finalList == null) ? null : finalList.getTotalCount();
            }
        };
        return GenericAdapter.mapList(respList, DarkThemeColorAdapter.getMapper());
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static GenericAdapter.Mapper<BrandingColorList, ListResponse<DarkThemeColor>> getListMapper() {
        return new GenericAdapter.Mapper<BrandingColorList, ListResponse<DarkThemeColor>>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public ListResponse<DarkThemeColor> map(BrandingColorList toBeMapped) {
                return DarkThemeColorAdapter.mapList(toBeMapped);
            }
        };
    }

    /**
     * Maps a branding color into a dark theme color.
     * 
     * @param toBeMapped
     *            a branding color.
     * @return mapped a dark theme color
     */
    @Internal
    public static DarkThemeColor map(BrandingColor toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final DarkThemeColor darkThemeColor = new DarkThemeColor(TranslationUtils.toDate(toBeMapped.getUpdatedAt()));
        darkThemeColor.setColor(toBeMapped.getColor());
        darkThemeColor.setReference(translateToDarkThemeColorReference(toBeMapped.getReference()));
        return darkThemeColor;
    }

    /**
     * Gets a mapper.
     * 
     * @return a mapper
     */
    @Internal
    public static GenericAdapter.Mapper<BrandingColor, DarkThemeColor> getMapper() {
        return new GenericAdapter.Mapper<BrandingColor, DarkThemeColor>() {
            /**
             * Maps.
             * 
             * @param toBeMapped
             *            model to be mapped.
             * @return a mapped object
             */
            @Override
            public DarkThemeColor map(BrandingColor toBeMapped) {
                return DarkThemeColorAdapter.map(toBeMapped);
            }
        };
    }

    /**
     * Maps a dark theme color into a branding color.
     * 
     * @param toBeMapped
     *            a dark theme color.
     * @return mapped a branding color
     */
    @Internal
    public static BrandingColor reverseMapUpdateRequest(DarkThemeColor toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        final BrandingColor brandingColor = new BrandingColor();
        brandingColor.setColor(toBeMapped.getColor());
        brandingColor.setReference(translateToComArmMbedCloudSdkLowlevelPelionclouddevicemanagementModelBrandingcolorReferenceenum(toBeMapped.getReference()));
        return brandingColor;
    }

    /**
     * Maps the enum value.
     * 
     * @param toBeMapped
     *            a reference enum.
     * @return mapped enum value
     */
    @Internal
    @SuppressWarnings("PMD.CyclomaticComplexity")
    protected static DarkThemeColorReference
              translateToDarkThemeColorReference(BrandingColor.ReferenceEnum toBeMapped) {
        if (toBeMapped == null) {
            return DarkThemeColorReference.getUnknownEnum();
        }
        switch (toBeMapped) {
            case ERROR_COLOR:
                return DarkThemeColorReference.ERROR_COLOR;
            case PRIMARY:
                return DarkThemeColorReference.PRIMARY;
            case SECONDARY:
                return DarkThemeColorReference.SECONDARY;
            case SUCCESS_COLOR:
                return DarkThemeColorReference.SUCCESS_COLOR;
            case WARNING_COLOR:
                return DarkThemeColorReference.WARNING_COLOR;
            case CANVAS_BACKGROUND:
                return DarkThemeColorReference.CANVAS_BACKGROUND;
            case CANVAS_BACKGROUND_FONT_COLOR:
                return DarkThemeColorReference.CANVAS_BACKGROUND_FONT_COLOR;
            case WORKSPACE_BACKGROUND:
                return DarkThemeColorReference.WORKSPACE_BACKGROUND;
            case WORKSPACE_BACKGROUND_FONT_COLOR:
                return DarkThemeColorReference.WORKSPACE_BACKGROUND_FONT_COLOR;
            case INFO_COLOR:
                return DarkThemeColorReference.INFO_COLOR;
            case INFO_FONT_COLOR:
                return DarkThemeColorReference.INFO_FONT_COLOR;
            case PRIMARY_FONT_COLOR:
                return DarkThemeColorReference.PRIMARY_FONT_COLOR;
            case SECONDARY_FONT_COLOR:
                return DarkThemeColorReference.SECONDARY_FONT_COLOR;
            case ERROR_FONT_COLOR:
                return DarkThemeColorReference.ERROR_FONT_COLOR;
            case SUCCESS_FONT_COLOR:
                return DarkThemeColorReference.SUCCESS_FONT_COLOR;
            case WARNING_FONT_COLOR:
                return DarkThemeColorReference.WARNING_FONT_COLOR;
            default:
                return DarkThemeColorReference.getUnknownEnum();
        }
    }

    /**
     * Maps the enum value.
     * 
     * @param toBeMapped
     *            a dark theme color reference.
     * @return mapped enum value
     */
    @Internal
    @SuppressWarnings("PMD.CyclomaticComplexity")
    protected static BrandingColor.ReferenceEnum
              translateToComArmMbedCloudSdkLowlevelPelionclouddevicemanagementModelBrandingcolorReferenceenum(DarkThemeColorReference toBeMapped) {
        if (toBeMapped == null) {
            return null;
        }
        switch (toBeMapped) {
            case ERROR_COLOR:
                return BrandingColor.ReferenceEnum.ERROR_COLOR;
            case PRIMARY:
                return BrandingColor.ReferenceEnum.PRIMARY;
            case SECONDARY:
                return BrandingColor.ReferenceEnum.SECONDARY;
            case SUCCESS_COLOR:
                return BrandingColor.ReferenceEnum.SUCCESS_COLOR;
            case WARNING_COLOR:
                return BrandingColor.ReferenceEnum.WARNING_COLOR;
            case CANVAS_BACKGROUND:
                return BrandingColor.ReferenceEnum.CANVAS_BACKGROUND;
            case CANVAS_BACKGROUND_FONT_COLOR:
                return BrandingColor.ReferenceEnum.CANVAS_BACKGROUND_FONT_COLOR;
            case WORKSPACE_BACKGROUND:
                return BrandingColor.ReferenceEnum.WORKSPACE_BACKGROUND;
            case WORKSPACE_BACKGROUND_FONT_COLOR:
                return BrandingColor.ReferenceEnum.WORKSPACE_BACKGROUND_FONT_COLOR;
            case INFO_COLOR:
                return BrandingColor.ReferenceEnum.INFO_COLOR;
            case INFO_FONT_COLOR:
                return BrandingColor.ReferenceEnum.INFO_FONT_COLOR;
            case PRIMARY_FONT_COLOR:
                return BrandingColor.ReferenceEnum.PRIMARY_FONT_COLOR;
            case SECONDARY_FONT_COLOR:
                return BrandingColor.ReferenceEnum.SECONDARY_FONT_COLOR;
            case ERROR_FONT_COLOR:
                return BrandingColor.ReferenceEnum.ERROR_FONT_COLOR;
            case SUCCESS_FONT_COLOR:
                return BrandingColor.ReferenceEnum.SUCCESS_FONT_COLOR;
            case WARNING_FONT_COLOR:
                return BrandingColor.ReferenceEnum.WARNING_FONT_COLOR;
            default:
                return null;
        }
    }
}