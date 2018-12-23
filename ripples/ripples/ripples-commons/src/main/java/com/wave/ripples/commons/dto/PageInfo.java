package com.wave.ripples.commons.dto;

import com.wave.ripples.commons.persistence.AbstractBaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


/**
 * 分页数据传输对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PageInfo<T extends AbstractBaseEntity> {

    private int draw;
    private int recordsTotal;
    private int recordsFiltered;
    private List<T> data;
}
