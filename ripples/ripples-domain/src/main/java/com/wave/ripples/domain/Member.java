package com.wave.ripples.domain;



import com.wave.ripples.commons.persistence.AbstractBaseEntity;
import com.wave.ripples.commons.utils.RegexpUtils;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Transient;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 * */

@Data
@EqualsAndHashCode(callSuper = false)
public class Member extends AbstractBaseEntity {
    /**
     * 校验成功
     */
    public static final int CHACK_OK = 0;

    /**
     * 旧密码校验失败
     */
    public static final int CHACK_OLD_PWD_FALSE = 1;

    /**
     * 新密码校验失败
     */
    public static final int CHACK_NEW_PWD_FALSE = 2;
    private Long memberId;
    private String memberName;
    private String password;
    @Pattern(regexp = RegexpUtils.PHONE, message = "手机号格式不正确")
    private String phone;
    @Pattern(regexp = RegexpUtils.EMAIL, message = "邮箱格式不正确")
    private String email;
    private Long fans;
    private Date updated;


    //------------拓展属性---------------
    /**
     * 用于修改时判断密码
     */
    @Transient
    private String oldPwd;
    @Transient
    private String newPwd;
}
