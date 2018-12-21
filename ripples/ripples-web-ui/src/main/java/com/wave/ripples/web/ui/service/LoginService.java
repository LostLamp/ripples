package com.wave.ripples.web.ui.service;


import com.wave.ripples.domain.Member;

public interface LoginService {
    Member login(String loginId, String password);
}
