package com.wave.ripples.domain.abstacts;

import lombok.Data;

import java.io.Serializable;

@Data
public abstract class AbstractBaseEntity implements Serializable {
    private Long id;
    private String created;
    private String updated;
}
