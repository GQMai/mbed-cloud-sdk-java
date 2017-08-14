package com.arm.mbed.cloud.sdk.accountmanagement.adapters;

import java.util.List;

import com.arm.mbed.cloud.sdk.accountmanagement.model.ApiKey;
import com.arm.mbed.cloud.sdk.accountmanagement.model.ApiKeyStatus;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.GenericAdapter;
import com.arm.mbed.cloud.sdk.common.GenericAdapter.Mapper;
import com.arm.mbed.cloud.sdk.common.GenericAdapter.RespList;
import com.arm.mbed.cloud.sdk.common.ListResponse;
import com.arm.mbed.cloud.sdk.common.TranslationUtils;
import com.arm.mbed.cloud.sdk.internal.model.ApiKeyInfoReq;
import com.arm.mbed.cloud.sdk.internal.model.ApiKeyInfoResp;
import com.arm.mbed.cloud.sdk.internal.model.ApiKeyInfoResp.StatusEnum;
import com.arm.mbed.cloud.sdk.internal.model.ApiKeyInfoRespList;
import com.arm.mbed.cloud.sdk.internal.model.ApiKeyUpdateReq;

@Preamble(description = "Adapter for API key model")
public class ApiKeyAdapter {

    public static ApiKey map(ApiKeyInfoResp apiKeyInfo) {
        if (apiKeyInfo == null) {
            return null;
        }
        ApiKey apiKey = new ApiKey(apiKeyInfo.getId(), apiKeyInfo.getGroups(), toStatus(apiKeyInfo.getStatus()),
                apiKeyInfo.getKey(), TranslationUtils.toDate(apiKeyInfo.getCreatedAt()),
                TranslationUtils.toTimeStamp(apiKeyInfo.getCreationTime()),
                TranslationUtils.toTimeStamp(apiKeyInfo.getLastLoginTime()));
        apiKey.setName(apiKeyInfo.getName());
        apiKey.setOwnerId(apiKeyInfo.getOwner());
        return apiKey;
    }

    public static Mapper<ApiKeyInfoResp, ApiKey> getMapper() {
        return new Mapper<ApiKeyInfoResp, ApiKey>() {
            @Override
            public ApiKey map(ApiKeyInfoResp toBeMapped) {
                return ApiKeyAdapter.map(toBeMapped);
            }
        };
    }

    public static ApiKeyInfoReq addMap(ApiKey apiKey) {
        if (apiKey == null) {
            return null;
        }
        ApiKeyInfoReq apiKeyInfo = new ApiKeyInfoReq();
        apiKeyInfo.setName(apiKey.getName());
        apiKeyInfo.setOwner(apiKey.getOwnerId());
        return apiKeyInfo;
    }

    public static ApiKeyUpdateReq updateMap(ApiKey apiKey) {
        if (apiKey == null) {
            return null;
        }
        ApiKeyUpdateReq apiKeyUpdate = new ApiKeyUpdateReq();
        apiKeyUpdate.setName(apiKey.getName());
        apiKeyUpdate.setOwner(apiKey.getOwnerId());
        return apiKeyUpdate;
    }

    private static ApiKeyStatus toStatus(StatusEnum userStatus) {
        ApiKeyStatus status = null;
        switch (userStatus) {
            case ACTIVE:
                status = ApiKeyStatus.ACTIVE;
                break;
            case INACTIVE:
                status = ApiKeyStatus.INACTIVE;
                break;
            default:
                status = ApiKeyStatus.INACTIVE;
                break;
        }
        return status;
    }

    public static ListResponse<ApiKey> mapList(ApiKeyInfoRespList list) {

        final ApiKeyInfoRespList apiKeyList = list;
        RespList<ApiKeyInfoResp> respList = new RespList<ApiKeyInfoResp>() {

            @Override
            public Boolean getHasMore() {
                return (apiKeyList == null) ? null : apiKeyList.getHasMore();
            }

            @Override
            public Integer getTotalCount() {
                return (apiKeyList == null) ? null : apiKeyList.getTotalCount();
            }

            @Override
            public String getAfter() {
                return (apiKeyList == null) ? null : apiKeyList.getAfter();
            }

            @Override
            public Integer getLimit() {
                return (apiKeyList == null) ? null : apiKeyList.getLimit();
            }

            @Override
            public String getOrder() {
                return (apiKeyList == null) ? null : apiKeyList.getOrder().toString();
            }

            @Override
            public List<ApiKeyInfoResp> getData() {
                return (apiKeyList == null) ? null : apiKeyList.getData();
            }
        };
        return GenericAdapter.mapList(respList, getMapper());
    }

    public static Mapper<ApiKeyInfoRespList, ListResponse<ApiKey>> getListMapper() {
        return new Mapper<ApiKeyInfoRespList, ListResponse<ApiKey>>() {

            @Override
            public ListResponse<ApiKey> map(ApiKeyInfoRespList toBeMapped) {
                return ApiKeyAdapter.mapList(toBeMapped);
            }

        };
    }
}
