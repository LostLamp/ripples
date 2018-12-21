package com.wave.ripples.web.admin.service.impl;

import com.google.common.collect.Maps;
import com.wave.ripples.domain.Member;
import com.wave.ripples.web.admin.commons.PageInfo;
import com.wave.ripples.web.admin.mapper.MemberMapper;
import com.wave.ripples.web.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private MemberMapper userMapper;

    @Override
    public List<Member> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public PageInfo<Member> page(Member member, int start, int length) {
        Map<String, Object> params = Maps.newHashMap();
        params.put("member", member);
        params.put("start", start);
        params.put("length", length);

        List<Member> data = userMapper.page(params);
        int total = count(member);

        PageInfo<Member> pageInfo = new PageInfo<>();
        pageInfo.setData(data);
        pageInfo.setTotal(total);

        return pageInfo;
    }

    @Override
    public int count(Member member) {
        return userMapper.count(member);
    }
}
