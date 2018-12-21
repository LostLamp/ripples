package com.wave.ripples.domain;

import lombok.Data;

import javax.persistence.Transient;
import java.util.Date;

/**
 * 用户表
 * @Author wodef
 * @version 1.0.0
 * @Date 2018/12/19
 *
 * */
@Data
public class Member  {
    private Long id;
    private String membername;
    private String password;
    private String phone;
    private String email;
    private String sex;
    private String avatar;
    private String introduce;
    private Long isAdmin;
    private Long fans;
    private Date created;
    private Date updated;
    /**
     * 表示旧密码验证失败
     */
    public static final int CHECK_FAIL_OLD_PASSWORD = 1;

    /**
     * 表示新密码不符合规范
     */
    public static final int CHECK_FAIL_NEW_PASSWORD = 2;

    // ---------------------------------------- 扩展属性 ----------------------------------------

    @Transient
    private String newPassword;

    /**
     * 用于修改密码时判断旧密码
     */
    @Transient
    private String oldPassword;
}
