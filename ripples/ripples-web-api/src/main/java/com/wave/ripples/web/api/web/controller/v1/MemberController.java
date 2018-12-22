package com.wave.ripples.web.api.web.controller.v1;


import com.wave.ripples.commons.dto.BaseResult;
import com.wave.ripples.domain.Member;
import com.wave.ripples.web.api.service.MemberService;
import com.wave.ripples.web.api.web.dto.MemberDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 会员 API 模块控制器
 * <p>@Title MemberController </p>
 * <p>@Description TODO </p>
 *
 * @Author dz
 * @Version 1.0.0
 * @Date 2018/12/21 21:54
 */
@RequestMapping(value = "${api.path.v1}/member")
@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @ModelAttribute
    public Member getMember(Long id) {
        Member member = null;
        // 判断是否有 id
        if (id == null) {
            member = new Member();
        }
        // 有 id 则查找实例
        else {
            member = memberService.getById(id);
        }
        return member;
    }

    /**
     * 根据登录 id 获取实例
     *
     * @param loginId
     * @return
     */
    @PostMapping(value = "login")
    public BaseResult login(String loginId, String password) {
        Member byLoginIdMember = memberService.login(loginId, password);
        // 输入的会员名和密码不正确
        if (byLoginIdMember == null) {
            return BaseResult.fail("用户名或密码不正确！");
        }
        // 正确
        else {
            MemberDto memberDto = new MemberDto();
            BeanUtils.copyProperties(byLoginIdMember, memberDto);
            return BaseResult.success("成功", memberDto);
        }
    }

    /**
     * 修改
     *
     * @param member
     * @return
     */
    @PostMapping(value = "modify")
    public BaseResult modify(Member member) {
        // 判断有会员 id 则修改
        if (member.getMemberId() != null) {
            memberService.modify(member);
            return BaseResult.success("修改成功");
        }
        // 没有则返回失败信息
        else {
            return BaseResult.fail("修改失败");
        }
    }
}
