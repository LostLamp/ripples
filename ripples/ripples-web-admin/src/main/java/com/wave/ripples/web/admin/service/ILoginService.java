package com.wave.ripples.web.admin.service;


import com.wave.ripples.domain.Member;

public interface ILoginService {
    Member login(String loginId, String loginPwd);
    Member getEmail(String email);
}
