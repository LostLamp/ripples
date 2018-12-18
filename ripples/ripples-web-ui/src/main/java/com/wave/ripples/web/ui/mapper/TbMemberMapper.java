package com.wave.ripples.web.ui.mapper;

import com.wave.ripples.web.ui.entity.TbMember;
import org.springframework.stereotype.Repository;

@Repository
public interface TbMemberMapper {
    /**
     * 根据用户账号查找用户实例
     * @param tbMember
     * @return
     */
    TbMember getByLoginId(TbMember tbMember);
}
