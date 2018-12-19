package com.wave.ripples.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
/**
 * 用户表
 * */


@Data
public class Member implements Serializable {
    private Long id;
    private String membername;
    private String password;
    private String phone;
    private String email;
    private String sex;
    private String avatar;
    private String introduce;
    private Long is_admin;
    private Long fans;
    private Date created;
    private Date updated;
}
