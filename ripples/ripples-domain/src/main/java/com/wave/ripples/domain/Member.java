package com.wave.ripples.domain;


import com.wave.ripples.domain.abstacts.AbstractBaseEntity;
import lombok.Data;

@Data
public class Member extends AbstractBaseEntity {

    private String membername;
    private String password;
    private String phone;
    private String email;
    private String sex;
    private String avatar;
    private String introduce;
    private Long isAdmin;
    private Long fans;

}
