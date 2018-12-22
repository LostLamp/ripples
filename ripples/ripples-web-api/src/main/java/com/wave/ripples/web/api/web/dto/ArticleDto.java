package com.wave.ripples.web.api.web.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 动态消息 传输对象
 * <p>@Title ArticleDto </p>
 * <p>@Description TODO </p>
 *
 * @Author dz
 * @Version 1.0.0
 * @Date 2018/12/22 9:41
 */
@Data
public class ArticleDto implements Serializable {
    private Long archiveId;
    private Long parentId;
    private Long memberId;
    private String content;
    private Long collentCount;
    private Long forwardCount;
    private String image;
    private Integer goodNum;
    private Integer commentNum;
}
