package com.wave.ripples.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * 消息 对象实体类
 * <p>@Title Article </p>
 * <p>@Description TODO </p>
 *
 * @Author dz
 * @Version 1.0.0
 * @Date 2018/12/18 15:29
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Article implements Serializable {
    private Long archive_id;
    private Long member_id;
    private String content;
    private Long view_count;
    private Date pub_time;
    private Date updated;
    private Integer good_num;
    private Integer bad_num;
}
