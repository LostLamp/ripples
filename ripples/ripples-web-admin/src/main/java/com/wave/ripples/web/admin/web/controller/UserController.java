package com.wave.ripples.web.admin.web.controller;

import com.wave.ripples.commons.constants.utils.StringUtils;
import com.wave.ripples.domain.Member;
import com.wave.ripples.web.admin.abstracts.AbstractBaseController;
import com.wave.ripples.web.admin.commons.PageInfo;
import com.wave.ripples.web.admin.dto.DataTable;
import com.wave.ripples.web.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户管理
 */
@Controller
@RequestMapping(value = "user")
public class UserController extends AbstractBaseController<Member> {

    @Autowired
    private UserService userService;

    /**    * 跳转列表页
     */
    @GetMapping(value = "list")
    public String list() {
        return "user/list";
    }

    @ResponseBody
    @PostMapping(value = "page")
    public DataTable<Member> page(Member member, HttpServletRequest request) {
        DataTable<Member> dataTable = new DataTable<>();

        String strDraw = request.getParameter("draw");
        String strStart = request.getParameter("start");
        String strLength = request.getParameter("length");

        String iDisplayStart = request.getParameter("iDisplayStart");
        System.out.println(iDisplayStart);

        int draw = StringUtils.isBlank(strDraw) ? 1 : Integer.parseInt(strDraw);
        int start = StringUtils.isBlank(strStart) ? 0 : Integer.parseInt(strStart);
        int length = StringUtils.isBlank(strLength) ? 10 : Integer.parseInt(strLength);

        PageInfo<Member> pageInfo = userService.page(member, start, length);
        dataTable.setDraw(draw);
        dataTable.setRecordsTotal(pageInfo.getTotal());
        dataTable.setRecordsFiltered(pageInfo.getTotal());
        dataTable.setData(pageInfo.getData());
        return dataTable;
    }
}
