package com.wave.ripples.web.admin.mapper;

import com.wave.ripples.domain.Member;
import com.wave.ripples.web.admin.service.IBaseService;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

@Repository
public interface IMemberMapper extends IBaseMapper<Member> {
    /**
     * 根据 ID 获取实例
     */
    Member getById(Long id);

    /**
     * loginId包括：username、phone、email
     */
    Member getByLoginId(String loginId);

    /**
     * 更新
     */
    void update(Member member);

    /**
     * 查询全部实例
     */
    List<Member> selectAll();

    /**
     * 新增
     */
    void insert(Member member);

    /**
     * 删除实例
     */
    void delete(Long id);
}
