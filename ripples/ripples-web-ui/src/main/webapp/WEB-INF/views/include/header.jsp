<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<div class="page-wrapper">
<div class="page-wrapper">
    <div class="page-wrapper-row">
        <div class="page-wrapper-top">
            <!-- BEGIN HEADER -->
            <div class="page-header">
                <!-- BEGIN HEADER TOP -->
                <div class="page-header-top">
                    <div class="container" >
                        <!-- BEGIN LOGO -->
                        <div class="page-logo">
                            <a href="index.html">
                                <img src="../static/assets/layouts/layout3/img/logo-default.jpg" alt="logo" class="logo-default">
                            </a>
                        </div>
                        <!-- END LOGO -->

                        <!-- BEGIN RESPONSIVE MENU TOGGLER -->
                        <a href="javascript:;" class="menu-toggler"></a>
                        <!-- END RESPONSIVE MENU TOGGLER -->

                        <!-- BEGIN TOP NAVIGATION MENU -->
                        <div class="top-menu">
                            <ul class="nav navbar-nav pull-right" >
                                <!-- BEGIN NOTIFICATION DROPDOWN -->
                                <!-- DOC: Apply "dropdown-hoverable" class after "dropdown" and remove data-toggle="dropdown" data-hover="dropdown" data-close-others="true" attributes to enable hover dropdown mode -->
                                <!-- DOC: Remove "dropdown-hoverable" and add data-toggle="dropdown" data-hover="dropdown" data-close-others="true" attributes to the below A element with dropdown-toggle class -->
                                <li class="dropdown dropdown-extended dropdown-notification dropdown-dark" >
                                    <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
                                        <i class=" icon-home"></i>
                                        <span >首页</span>
                                    </a>
                                </li>
                                <li class="dropdown dropdown-extended dropdown-notification dropdown-dark" >
                                    <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
                                        <i class="icon-compass"></i>
                                        <span >发现</span>
                                    </a>
                                </li>
                                <li class="dropdown dropdown-extended dropdown-notification dropdown-dark" >
                                    <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
                                        <i class=" icon-social-youtube"></i>
                                        <span >视频</span>
                                    </a>
                                </li>

                                <li class="dropdown dropdown-extended dropdown-notification dropdown-dark ${sessionScope.user!= null ? '':''}" id="header_notification_bar">
                                    <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
                                        <i class="icon-bell"></i>
                                        <span class="badge badge-default">7</span>
                                        <span >通知</span>
                                    </a>
                                    <ul class="dropdown-menu">
                                        <li class="external ">
                                            <h3>你有
                                                <strong>12 条</strong> 通知</h3>
                                            <a href="app_todo.html">详情</a>
                                        </li>
                                        <li>
                                            <ul class="dropdown-menu-list scroller" style="height: 250px;" data-handle-color="#637283">
                                                <li>
                                                    <a href="javascript:;">
                                                        <span class="time">just now</span>
                                                        <span class="details">
                                                                    <span class="label label-sm label-icon label-success">
                                                                        <i class="fa fa-plus"></i>
                                                                    </span> New user registered. </span>
                                                    </a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>
                                <!-- END NOTIFICATION DROPDOWN -->
                                <li class="droddown dropdown-separator">
                                    <span class="separator"></span>
                                </li>
                                <!-- BEGIN INBOX DROPDOWN -->
                                <li class="dropdown dropdown-extended dropdown-inbox dropdown-dark ${sessionScope.user!= null ? '':''}" id="header_inbox_bar" >
                                    <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
                                        <span class="circle">3</span>
                                        <span class="corner"></span>
                                    </a>
                                    <ul class="dropdown-menu">
                                        <li class="external  ">
                                            <h3>你有
                                                <strong>7 条</strong> 新消息</h3>
                                            <a href="app_inbox.html">显示全部</a>
                                        </li>
                                        <li>
                                            <ul class="dropdown-menu-list scroller" style="height: 275px;" data-handle-color="#637283">
                                                <li>
                                                    <a href="#">
                                                                <span class="photo">
                                                                    <img src="/static/assets/layouts/layout3/img/avatar2.jpg" class="img-circle" alt=""> </span>
                                                        <span class="subject">
                                                                    <span class="from"> Lisa Wong </span>
                                                                    <span class="time">Just Now </span>
                                                                </span>
                                                        <span class="message"> Vivamus sed auctor nibh congue nibh. auctor nibh auctor nibh... </span>
                                                    </a>
                                                </li>
                                            </ul>
                                        </li>
                                    </ul>
                                </li>
                                <!-- END INBOX DROPDOWN -->
                                <!-- BEGIN USER LOGIN DROPDOWN -->
                                <li class="dropdown dropdown-user dropdown-dark ${sessionScope.user!= null ? '':''}">
                                    <a href="/profile" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
                                        <img alt="" class="img-circle" src="/static/assets/layouts/layout3/img/avatar9.jpg">
                                        <span class="username username-hide-mobile">Nick</span>
                                    </a>
                                    <ul class="dropdown-menu dropdown-menu-default">
                                        <li>
                                            <a href="/personal">
                                                <i class="icon-user"></i> 个人中心 </a>
                                        </li>
                                        <li>
                                            <a href="app_inbox.html">
                                                <i class="icon-envelope-open"></i> 消息
                                                <span class="badge badge-danger"> 3 </span>
                                            </a>
                                        </li>
                                        <li class="divider"> </li>
                                        <li>
                                            <a href="page_user_lock_1.html">
                                                <i class="icon-lock"></i> 锁屏 </a>
                                        </li>
                                        <li>
                                            <a href="page_user_login_1.html">
                                                <i class="icon-key"></i>推出登陆 </a>
                                        </li>
                                    </ul>
                                </li>
                                <!-- END USER LOGIN DROPDOWN -->
                                <!-- BEGIN QUICK SIDEBAR TOGGLER -->
                                <li class="dropdown dropdown-extended quick-sidebar-toggler"  >
                                    <span>
                                        <a href="/login" class="${sessionScope.user!= null ? 'hidden':''}">登陆</a>
                                        <a href="" class="${sessionScope.user!= null ? '':'hidden'}">注销</a>
                                    </span>
                                    <i class="${sessionScope.user!= null ? 'icon-logout':' icon-login'}"></i>
                                </li>

                                <!-- END QUICK SIDEBAR TOGGLER -->
                            </ul>
                        </div>
                        <!-- END TOP NAVIGATION MENU -->
                    </div>
                </div>
                <!-- END HEADER TOP -->
                <!-- BEGIN HEADER MENU -->
                <div class="page-header-menu " >
                    <div class="container">
                        <!-- BEGIN MEGA MENU -->
                        <!-- DOC: Apply "hor-menu-light" class after the "hor-menu" class below to have a horizontal menu with white background -->
                        <!-- DOC: Remove data-hover="dropdown" and data-close-others="true" attributes below to disable the dropdown opening on mouse hover -->
                        <div class="hor-menu  ">
                            <ul class="nav navbar-nav">
                                <li aria-haspopup="true" class="menu-dropdown classic-menu-dropdown ">
                                    <a href="/index"> 首页
                                        <span class="arrow"></span>
                                    </a>
                                </li>
                                <li aria-haspopup="true" class="menu-dropdown mega-menu-dropdown  mega-menu-full">
                                    <a href="/profile"> 个人中心
                                        <span class="arrow"></span>
                                    </a>
                                </li>
                                <li aria-haspopup="true" class="menu-dropdown mega-menu-dropdown  mega-menu-full ">
                                    <a href="/personal"> 好友圈
                                        <span class="arrow"></span>
                                    </a>
                                </li>
                                <li aria-haspopup="true" class="menu-dropdown mega-menu-dropdown  ">
                                    <a href="/photoes"> 我的相册
                                        <span class="arrow"></span>
                                    </a>
                                </li>
                                <li aria-haspopup="true" class="menu-dropdown mega-menu-dropdown  ">
                                    <a href="javascript:;"> 我的收藏
                                        <span class="arrow"></span>
                                    </a>
                                </li>
                                <li aria-haspopup="true" class="menu-dropdown classic-menu-dropdown ">
                                    <a href="javascript:;"> 我的赞
                                        <span class="arrow"></span>
                                    </a>
                                </li>
                                <li aria-haspopup="true" class="menu-dropdown classic-menu-dropdown ">
                                    <a href="javascript:;"> 热门
                                        <span class="arrow"></span>
                                    </a>
                                    <ul class="dropdown-menu pull-left">
                                        <li aria-haspopup="true" class="dropdown-submenu ">
                                            <a href="javascript:;" class="nav-link nav-toggle ">
                                                <i class="icon-settings"></i>话题
                                                <span class="arrow"></span>
                                            </a>
                                        </li>
                                        <li aria-haspopup="true" class="dropdown-submenu ">
                                            <a href="javascript:;" class="nav-link nav-toggle ">
                                                <i class="icon-briefcase"></i>XX
                                                <span class="arrow"></span>
                                            </a>
                                        </li>
                                        <li aria-haspopup="true" class="dropdown-submenu ">
                                            <a href="?p=" class="nav-link nav-toggle ">
                                                <i class="icon-wallet"></i>XX
                                                <span class="arrow"></span>
                                            </a>
                                        </li>
                                        <li aria-haspopup="true" class="dropdown-submenu ">
                                            <a href="?p=" class="nav-link nav-toggle ">
                                                <i class="icon-settings"></i>XX
                                                <span class="arrow"></span>
                                            </a>
                                        </li>
                                        <li aria-haspopup="true" class="dropdown-submenu ">
                                            <a href="javascript:;" class="nav-link nav-toggle ">
                                                <i class="icon-bar-chart"></i>热门XX
                                                <span class="arrow"></span>
                                            </a>
                                        </li>
                                    </ul>
                                </li>
                                <li aria-haspopup="true" class="menu-dropdown classic-menu-dropdown">
                                    <a href="javascript:;">设置
                                        <span class="arrow"></span>
                                    </a>
                                    <ul class="dropdown-menu pull-left">
                                        <li aria-haspopup="true" class="dropdown-submenu ">
                                            <a href="javascript:;" class="nav-link nav-toggle ">
                                                <i class="icon-basket"></i> 账号设置
                                            </a>
                                            <ul class="dropdown-menu pull-left">
                                                <li aria-haspopup="true" class="dropdown-submenu ">
                                                    <a href="/profile" class="nav-link nav-toggle ">
                                                        </i> 修改个人信息
                                                    </a>
                                                </li>
                                                <li aria-haspopup="true" class="dropdown-submenu ">
                                                    <a href="javascript:;" class="nav-link nav-toggle ">
                                                        </i> 修改密码
                                                    </a>
                                                </li>
                                                <li aria-haspopup="true" class="dropdown-submenu ">
                                                    <a href="javascript:;" class="nav-link nav-toggle ">
                                                        </i> 修改头像
                                                    </a>
                                                </li>
                                            </ul>
                                        </li>
                                        <li aria-haspopup="true" class="dropdown-submenu active">
                                            <a href="javascript:;" class="nav-link nav-toggle active">
                                                <i class="icon-docs"></i> 消息设置
                                            </a>
                                        </li>
                                        <li aria-haspopup="true" class="dropdown-submenu ">
                                            <a href="javascript:;" class="nav-link nav-toggle ">
                                                <i class="icon-user"></i> 隐私设置
                                            </a>
                                        </li>
                                        <li aria-haspopup="true" class="dropdown-submenu ">
                                            <a href="javascript:;" class="nav-link nav-toggle ">
                                                <i class="icon-social-dribbble"></i> 屏蔽设置
                                            </a>
                                        </li>
                                        <li aria-haspopup="true" class="dropdown-submenu ">
                                            <a href="javascript:;" class="nav-link nav-toggle ">
                                                <i class="icon-settings"></i> 帮助中心
                                            </a>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                        <!-- END MEGA MENU -->
                    </div>
                </div>
                <!-- END HEADER MENU -->
            </div>
            <!-- END HEADER -->
        </div>
    </div>
</div>