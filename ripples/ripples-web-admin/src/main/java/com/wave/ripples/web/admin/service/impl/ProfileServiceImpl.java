package com.wave.ripples.web.admin.service.impl;


import com.wave.ripples.commons.constants.SystemConstants;
import com.wave.ripples.domain.Member;
import com.wave.ripples.web.admin.mapper.MemberMapper;
import com.wave.ripples.web.admin.service.IProfileService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.Date;


/**
 * 个人信息管理
 * @Author wodef
 * @version 1.0.0
 * @Date 2018/12/20
 */
@Service
public class ProfileServiceImpl implements IProfileService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public String save(Member member) {
        String result = checkUser(member);

        // 校验失败
        if (StringUtils.isNoneBlank(result)) {
            return result;
        }

        // 校验成功
        member.setUpdated(new Date());
        memberMapper.update(member);

        return null;
    }

    @Override
    public int modifyPassword(Member member) {
        // 获取当前用户实例
        Member profile = memberMapper.getById(member.getId());

        // 旧密码加密
        String oldPassword = DigestUtils.md5DigestAsHex(member.getOldPassword().getBytes());

        // 旧密码不正确
        if (!StringUtils.equals(profile.getPassword(), oldPassword)) {
            return Member.CHECK_FAIL_OLD_PASSWORD;
        }

        // 校验新密码
        if (StringUtils.isBlank(member.getNewPassword())) {
            return Member.CHECK_FAIL_NEW_PASSWORD;
        }

        // 修改密码
        String newPassword = DigestUtils.md5DigestAsHex(member.getNewPassword().getBytes());
        profile.setPassword(newPassword);
        memberMapper.update(profile);

        return SystemConstants.RESULT_OK;
    }

    /**
     * 用户有效性验证
     */
    private String checkUser(Member member) {
        if (StringUtils.isBlank(member.getMembername())) {
            return "请输入用户名";
        }

        if (StringUtils.isBlank(member.getPhone())) {
            return "请输入手机号";
        }

        if (StringUtils.isBlank(member.getEmail())) {
            return "请输入邮箱";
        }
        return null;
    }
}
