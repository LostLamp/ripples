<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/29
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="page-sidebar-wrapper">
    <div class="page-sidebar navbar-collapse collapse">
        <ul class="page-sidebar-menu  page-header-fixed " data-keep-expanded="false" data-auto-scroll="true" data-slide-speed="200" style="padding-top: 20px">
            <li class="heading">
                <h3 class="uppercase">涟漪管理系统</h3>
            </li>
            <li class="nav-item start active open">
                <a href="javascript:;" class="nav-link nav-toggle">
                    <i class="icon-home"></i>
                    <span class="title">控制面板</span>
                    <span class="selected"></span>
                    <span class="arrow open"></span>
                </a>
                <ul class="sub-menu">
                    <li class="nav-item start active open">
                        <a href="/main" class="nav-link ">
                            <i class="icon-bar-chart"></i>
                            <span class="title">涟漪控制器</span>
                            <span class="selected"></span>
                        </a>
                    </li>
                </ul>
            </li>
            <li class="heading">
                <h3 class="uppercase">功能菜单</h3>
            </li>
            <li class="nav-item  ">
                <a href="javascript:;" class="nav-link nav-toggle">
                    <i class="icon-users"></i>
                    <span class="title">用户管理</span>
                    <span class="arrow"></span>
                </a>
                <ul class="sub-menu">
                    <li class="nav-item  ">
                        <a href="/user/list" class="nav-link ">
                            <i class="icon-user "></i>
                            <span class="title">用户列表</span>
                        </a>
                    </li>
                </ul>
            </li>
        </ul>
    </div>
</div>