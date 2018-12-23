package com.wave.ripples.web.api.web.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 消息 传输对象
 * <p>@Title CommentDto </p>
 * <p>@Description TODO </p>
 *
 * @Author dz
 * @Version 1.0.0
 * @Date 2018/12/23 16:46
 */
@Data
public class CommentDto implements Serializable {
    private Long comment_id;
    private Long parent_id;
    private Long archive_id;
    private Long member_id;
    private String content;
}
