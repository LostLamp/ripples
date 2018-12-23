package com.wave.ripples.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * 动态消息 对象实体类
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
    private Long articleId;
    private Long parentId;
    private Long memberId;
    private String content;
    private Long collentCount;
    private Long forwardCount;
    private String image;
    private Integer goodNum;
    private Integer commentNum;
    private Date created;
    private Date updated;

}
