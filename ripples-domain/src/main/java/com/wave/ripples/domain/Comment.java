package com.wave.ripples.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 评论 pojo对象实体类
 * <p>@Title Comment </p>
 * <p>@Description TODO </p>
 *
 * @Author dz
 * @Version 1.0.0
 * @Date 2018/12/22 15:58
 */
@Data
public class Comment implements Serializable {
    private Long commemtId;
    private Long parentId;
    private Long articleId;
    private Long memberId;
    private Date created;
    private String content;
}
