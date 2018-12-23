package com.wave.ripples.commons.persistence;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public abstract class AbstractBaseEntity implements Serializable {
    private Date created;
}
