package com.wave.ripples.web.ui.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Member 数据传输对象
 * <p>@Title Member </p>
 * <p>@Description TODO </p>
 *
 * @Author dz
 * @Version 1.0.0
 * @Date 2018/12/20 20:39
 */
@Data
public class Member implements Serializable {
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
