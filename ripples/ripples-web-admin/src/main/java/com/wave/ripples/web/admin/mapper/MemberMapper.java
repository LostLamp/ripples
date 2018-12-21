package com.wave.ripples.web.admin.mapper;

import com.wave.ripples.domain.Member;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

@Repository
public interface MemberMapper {
    /**
     * 根据 ID 获取实例
     *
     * @param id
     * @return
     */
    Member getById(Long id);

    /**
     * 根据登录账号获取用户实例
     * 账号包括：username、phone、email
     *
     * @param member
     * @return
     */
    Member getByLoginId(Member member);

    /**
     * 更新
     *
     * @param member
     */
    void update(Member member);

    /**
     * 查询全部实例
     * @return
     */
    List<Member> selectAll();

    /**
     * 分页查询
     * @param params 查询参数
     * @return
     */
    List<Member> page(Map<String, Object> params);

    /**
     * 查询总笔数
     * @param member
     * @return
     */
    Integer count(Member member);
}
