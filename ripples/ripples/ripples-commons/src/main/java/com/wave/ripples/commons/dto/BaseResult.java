package com.wave.ripples.commons.dto;

import com.wave.ripples.commons.constants.Constants;
import lombok.Data;

import java.io.Serializable;

/**
 * 自定义返回结果
 */
@Data
public class BaseResult implements Serializable {

    private int status;
    private String message;

    public static BaseResult success(){
        return createResult(Constants.STATUS_OK,"成功！");
    }

    public static BaseResult success(String message){
        return createResult(Constants.STATUS_OK,message);
    }

    public static BaseResult faile(){
        return createResult(Constants.STATUS_FAILE,"失败");
    }

    public static BaseResult faile(String message){
        return createResult(Constants.STATUS_FAILE,message);
    }

    public static BaseResult faile(int status, String message){
        return createResult(status,message);
    }


    private static BaseResult createResult(int status, String message){
        BaseResult baseResult = new BaseResult();
        baseResult.setMessage(message);
        baseResult.setStatus(status);
        return baseResult;
    }
}
