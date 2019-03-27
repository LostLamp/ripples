package com.wave.ripples.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 会员 pojo对象实体类
 * <p>@Title Member </p>
 * <p>@Description TODO </p>
 *
 * @Author dz
 * @Version 1.0.0
 * @Date 2018/12/22 17:14
 */
@Data
public class Member implements Serializable {
    private Long memberId;
    private String memberName;
    private String password;
    private String phone;
    private String email;
    private Long fans;
    private Date created;
    private Date updated;
}
