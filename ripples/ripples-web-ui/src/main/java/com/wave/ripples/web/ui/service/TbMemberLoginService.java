package com.wave.ripples.web.ui.service;

import com.wave.ripples.web.ui.entity.TbMember;

public interface TbMemberLoginService {
    TbMember login(String loginId,String password);
}
