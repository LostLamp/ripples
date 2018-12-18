package com.wave.ripples.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
public class Member {
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
