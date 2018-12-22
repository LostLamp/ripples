package com.wave.ripples.web.api.web.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/**
 * 会员 数据传输对象
 * <p>@Title MemberDto </p>
 * <p>@Description TODO </p>
 *
 * @Author dz
 * @Version 1.0.0
 * @Date 2018/12/20 16:34
 */
@Data
public class MemberDto implements Serializable {
    private Long memberId;
    private String membername;
    // --登录完成后就不将密码传输回 ui 模块--
    @JsonInclude
    private String password;
    private String phone;
    private String email;
    private Long fans;
}
