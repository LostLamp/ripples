package com.wave.ripples.web.api.web.controller.v1;


import com.wave.ripples.commons.dto.BaseResult;
import com.wave.ripples.domain.Member;
import com.wave.ripples.web.api.service.MemberService;
import com.wave.ripples.web.api.web.dto.MemberDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "${api.path.v1}/member")
@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    Member member = null;

    @ModelAttribute
    public Member getMember(Long id) {
        if (id == null) {
            member = new Member();
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
        MemberDto memberDto = new MemberDto();
        Member byLoginIdMember = memberService.login(loginId, password);
        if (byLoginIdMember == null) {
            return BaseResult.fail("用户名或密码不正确！");
        }
        //
        else {
            BeanUtils.copyProperties(byLoginIdMember, memberDto);
            return BaseResult.success("成功", memberDto);
        }
    }
}
