package com.wave.ripples.web.api.web.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 会员 内容传输对象
 * <p>@Title MemberDto </p>
 * <p>@Description TODO </p>
 *
 * @Author dz
 * @Version 1.0.0
 * @Date 2018/12/20 16:34
 */
@Data
public class MemberDto implements Serializable {
    private Long id;
    private String membername;
    private String password;
    private String phone;
    private String email;
    private String avatar;
    private String introduce;
    private Long isAdmin;
    private Long fans;
}
