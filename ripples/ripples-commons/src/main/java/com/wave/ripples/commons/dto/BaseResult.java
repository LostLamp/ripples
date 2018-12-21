package com.wave.ripples.commons.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 自定义返回的结果集
 * <p>@Title BaseResult </p>
 * <p>@Description TODO </p>
 *
 * @Author dz
 * @Version 1.0.0
 * @Date 2018/12/20 11:35
 */
@Data
public class BaseResult implements Serializable {
    // 成功
    public static final int STATUS_SUCCESS = 200;
    // 失败
    public static final int STATUS_FAIL = 500;

    private int status;
    private String message;
    private Object data;


    public static BaseResult success() {
        return BaseResult.createResult(STATUS_SUCCESS, "成功", null);
    }

    public static BaseResult success(String message) {
        return BaseResult.createResult(STATUS_SUCCESS, message, null);
    }

    public static BaseResult success(String message, Object data) {
        return BaseResult.createResult(STATUS_SUCCESS, message, data);
    }

    public static BaseResult fail() {
        return BaseResult.createResult(STATUS_FAIL, "失败", null);
    }

    public static BaseResult fail(String message) {
        return BaseResult.createResult(STATUS_FAIL, message, null);
    }

    public static BaseResult fail(int status, String message) {
        return BaseResult.createResult(status, message, null);
    }

    /**
     * 创建结果集
     *
     * @param status
     * @param message
     * @param data
     * @return
     */
    private static BaseResult createResult(int status, String message, Object data) {
        BaseResult baseResult = new BaseResult();
        baseResult.setStatus(status);
        baseResult.setMessage(message);
        baseResult.setData(data);
        return baseResult;
    }
}
