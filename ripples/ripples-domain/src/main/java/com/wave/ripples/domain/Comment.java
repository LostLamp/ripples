package com.wave.ripples.domain;

import com.wave.ripples.commons.persistence.AbstractBaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 评论实体类
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Comment extends AbstractBaseEntity {
    private Long commentId;
    private Long parentId;
    private Long archiveId;
    private Long memberId;
    private String content;
}
