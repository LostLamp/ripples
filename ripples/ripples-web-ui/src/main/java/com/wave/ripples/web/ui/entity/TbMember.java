package com.wave.ripples.web.ui.entity;

import com.wave.ripples.web.ui.abstracts.AbstractBaseEntity;
import lombok.Data;

@Data
public class TbMember extends AbstractBaseEntity {

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
