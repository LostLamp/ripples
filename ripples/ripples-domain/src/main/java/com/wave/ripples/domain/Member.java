package com.wave.ripples.domain;



import com.wave.ripples.domain.abstacts.AbstractBaseEntity;
import lombok.Data;

@Data
public class Member extends AbstractBaseEntity {

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

    private Long isAdmin;
    private Long fans;

    private Date created;
    private Date updated;
}
