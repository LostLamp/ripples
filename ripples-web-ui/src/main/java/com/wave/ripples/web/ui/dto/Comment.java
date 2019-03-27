package com.wave.ripples.web.ui.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 评论传输对象
 * <p>@Title Comment </p>
 * <p>@Description TODO </p>
 *
 * @Author dz
 * @Version 1.0.0
 * @Date 2018/12/24 15:24
 */
@Data
public class Comment implements Serializable {
    private Long commentId;
    private Long parentId;
    private Long articleId;
    private Long memberId;
    private Date created;
    private String content;
}
