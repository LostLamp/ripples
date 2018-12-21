<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/17
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!--
Template Name: Metronic - Responsive Admin Dashboard Template build with Twitter Bootstrap 3.3.7
Version: 4.7.5
Author: KeenThemes
Website: http://www.keenthemes.com/
Contact: support@keenthemes.com
Follow: www.twitter.com/keenthemes
Dribbble: www.dribbble.com/keenthemes
Like: www.facebook.com/keenthemes
Purchase: http://themeforest.net/item/metronic-responsive-admin-dashboard-template/4021469?ref=keenthemes
Renew Support: http://themeforest.net/item/metronic-responsive-admin-dashboard-template/4021469?ref=keenthemes
License: You must have a valid license purchased only from themeforest(the above link) in order to legally use the theme for your project.
-->
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<!-- BEGIN HEAD -->

<head>
    <meta charset="utf-8" />
    <title>涟漪</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta content="width=device-width, initial-scale=1" name="viewport" />
    <meta content="Preview page of Metronic Admin Theme #3 for user inbox" name="description" />
    <meta content="" name="author" />
    <jsp:include page="include/head.jsp"/>
</head>
<!-- END HEAD -->

<body class="page-container-bg-solid">
<div class="page-wrapper">
            <!-- BEGIN HEADER -->
            <div class="page-header" style="height: auto">
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
                                <li class="dropdown dropdown-extended dropdown-notification dropdown-dark" id="header_notification_bar">
                                    <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
                                        <i class=" icon-home"></i>
                                        <span >首页</span>
                                    </a>
                                </li>
                                <li class="dropdown dropdown-extended dropdown-notification dropdown-dark" id="header_notification_bar">
                                    <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
                                        <i class="icon-compass"></i>
                                        <span >发现</span>
                                    </a>
                                </li>
                                <li class="dropdown dropdown-extended dropdown-notification dropdown-dark" id="header_notification_bar">
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
                                                                    <img src="../static/assets/layouts/layout3/img/avatar2.jpg" class="img-circle" alt=""> </span>
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
                                    <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
                                        <img alt="" class="img-circle" src="../static/assets/layouts/layout3/img/avatar9.jpg">
                                        <span class="username username-hide-mobile">Nick</span>
                                    </a>
                                    <ul class="dropdown-menu dropdown-menu-default">
                                        <li>
                                            <a href="page_user_profile_1.html">
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
                                        <a href="login.jsp" class="${sessionScope.user!= null ? 'hidden':''}">登陆</a>
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
            </div>
            <!-- END HEADER -->
    <div class="page-wrapper-row full-height">
        <div class="page-wrapper-middle">
            <!-- BEGIN CONTAINER -->
            <div class="page-container">
                <!-- BEGIN CONTENT -->
                <div class="page-content-wrapper">
                    <!-- BEGIN CONTENT BODY -->

                    <!-- BEGIN PAGE CONTENT BODY -->
                    <div class="page-content">
                        <div class="container">
                            <!-- BEGIN PAGE BREADCRUMBS -->
                            <ul class="page-breadcrumb breadcrumb">
                                <li>
                                    <a href="index.html">主页</a>
                                    <i class="fa fa-circle"></i>
                                </li>
                            </ul>
                            <!-- END PAGE BREADCRUMBS -->
                            <!-- BEGIN PAGE CONTENT INNER -->
                            <div class="page-content-inner">
                                <div class="inbox">
                                    <div class="row">
                                        <div class="col-md-2">
                                            <div class="inbox-sidebar">
                                                <ul class="inbox-nav">
                                                    <li class="active">
                                                        <a href="javascript:;" data-type="inbox" data-title="Inbox"> 热门
                                                        </a>
                                                    </li>
                                                    <li>
                                                        <a href="javascript:;" data-type="inbox" data-title="Inbox"> 头条
                                                        </a>
                                                    </li>
                                                    <li >
                                                        <a href="javascript:;" data-type="inbox" data-title="Inbox"> 新鲜事
                                                        </a>
                                                    </li>
                                                    <li >
                                                        <a href="javascript:;" data-type="inbox" data-title="Inbox"> 榜单
                                                        </a>
                                                    </li>
                                                    <li >
                                                        <a href="javascript:;" data-type="inbox" data-title="Inbox"> 搞笑
                                                        </a>
                                                    </li>
                                                    <li >
                                                        <a href="javascript:;" data-type="inbox" data-title="Inbox"> 时尚
                                                        </a>
                                                    </li>
                                                    <li >
                                                        <a href="javascript:;" data-type="inbox" data-title="Inbox"> 电影
                                                        </a>
                                                    </li>
                                                    <li >
                                                        <a href="javascript:;" data-type="inbox" data-title="Inbox"> 美女
                                                        </a>
                                                    </li>
                                                    <li >
                                                        <a href="javascript:;" data-type="inbox" data-title="Inbox"> 体育
                                                        </a>
                                                    </li>
                                                    <li >
                                                        <a href="javascript:;" data-type="inbox" data-title="Inbox"> 军事
                                                        </a>
                                                    </li>
                                                    <li >
                                                        <a href="javascript:;" data-type="inbox" data-title="Inbox"> 国际
                                                        </a>
                                                    </li>
                                                    <li >
                                                        <a href="javascript:;" data-type="inbox" data-title="Inbox"> 科技
                                                        </a>
                                                    </li>
                                                    <li >
                                                        <a href="javascript:;" data-type="inbox" data-title="Inbox"> 动漫
                                                        </a>
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                        <div class="col-md-10">
                                            <%--轮播图--%>
                                            <div class="shutter col-md-12" style="margin: 5px 5px 20px 5px!important;" >
                                                <div class="shutter-img">
                                                    <a href="#" data-shutter-title="Iron Man"><img src="../static/assets/apps/img/a1.png" alt="#"></a>
                                                    <a href="#" data-shutter-title="Super Man"><img src="../static/assets/apps/img/a2.png" alt="#"></a>
                                                    <a href="#" data-shutter-title="The Hulk"><img src="../static/assets/apps/img/a3.png" alt="#"></a>
                                                    <a href="#" data-shutter-title="The your"><img src="../static/assets/apps/img/a4.png" alt="#"></a>
                                                </div>
                                                <ul class="shutter-btn">
                                                    <li class="prev"></li>
                                                    <li class="next"></li>
                                                </ul>
                                                <div class="shutter-desc">
                                                    <p>Iron Man</p>
                                                </div>
                                            </div>
                                            <%--轮播图END--%>
                                            <%--动态 1--%>
                                            <div class="lmlblog-posts-list words" style="background-image:url(../static/assets/apps/test/images/058.png); " data="4197">

                                                    <!-- 动态内容部分，包括列表 -->
                                                    <div class="lmlblog-post-user-info">
                                                        <div class="lmlblog-post-user-info-avatar" user-data="1">
                                                            <a href="#1" style="display: inline-block;">
                                                                <span class="lmlblog-vip-icon"></span><img src="../static/assets/apps/test/images/tx2.jpg" class="avatar"><i class="lmlblog-verify lmlblog-verify-a" title="司空琪"></i></a>
                                                            <div class="lmlblog-user-info-card" style="display: none;">
                                                                <div class="info_card_loading"><img src="../static/assets/apps/test/picture/chat-loading.gif"><p>资料加载中...</p>
                                                                </div>
                                                            </div>
                                                        </div>

                                                        <div class="lmlblog-post-user-info-name">
                                                            <a href="#1">
                                                                <font style="color:#333;font-weight:600">司空琪</font>
                                                            </a>
                                                            <span class="lmlblog-mark lmlblog-lv" title="经验：3815">Lv.6</span><span class="lmlblog-mark lmlblog-vip">VIP 6</span>
                                                        </div>
                                                        <div class="lmlblog-post-user-info-time" title="2017-12-14 05:25">12-14 05:25</div>
                                                    </div><!-- 作者信息 -->
                                                    <div class="lmlblog-post-setting">
                                                        <i class="fa fa-angle-down"></i>
                                                        <div class="lmlblog-post-setting-box">
                                                            <ul>
                                                                <a href="#" title="查看全文"><li>查看全文</li></a>
                                                                <a href="#1" title="访问主页"><li>访问主页</li></a>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                    <div class="lmlblog-post-content ">
                                                        <a class="post_list_link" href="#">
                                                            <p>　　疏星淡月，紫陌曲岸，持觞游赏，神移长川。一片彀纹，溶溶泄泄，忽而烟靡云敛。睹一丽人，缦立青水，云蒸雾霭，花衬善睐。荧荧兮若北辰之荣现，扰扰兮若紫玉之生烟。颜如舜华，迫闻素腰华琚摇;和颜静志，远望渌水呈雾绡。戏流光之夜蝶，采舞雪之琼花，流眷眷之眸光，润荣曜之笑靥。</p>
                                                            <p>　　偶得美人回顾，思之朝朝暮暮。采芝兰以明愫，寄琼琚以作妆。余咏永慕叹道长，彼应影独愿偕芳。才知世有解语，不过琪语溯光。<img src="../static/assets/apps/test/images/66.png" alt="[s-65]" class="wp-smiley">
                                                                <img src="../static/assets/apps/test/images/8.png" alt="[s-65]" class="wp-smiley"></p></a>
                                                    </div>
                                                    <div class="lmlblog-post-images-list clear">
                                                        <a href="../static/assets/apps/test/images/qi01.jpg" data-fancybox="gallery" data-caption="<i class=&quot;fa fa-copyright&quot;></i> lmlblog">
                                                            <img src="../static/assets/apps/test/images/qi01.jpg" alt="司空琪吧十一月壁纸"></a>
                                                        <a href="../static/assets/apps/test/images/qi02.jpg" data-fancybox="gallery" data-caption="<i class=&quot;fa fa-copyright&quot;></i> lmlblog">
                                                            <img src="../static/assets/apps/test/images/qi02.jpg" alt="司空琪吧十一月壁纸"></a>
                                                        <a href="../static/assets/apps/test/images/qi03.jpg" data-fancybox="gallery" data-caption="<i class=&quot;fa fa-copyright&quot;></i> lmlblog">
                                                            <img src="../static/assets/apps/test/images/qi03.jpg" alt="司空琪吧十一月壁纸"></a>
                                                        <a href="../static/assets/apps/test/images/qi03.jpg" data-fancybox="gallery" data-caption="<i class=&quot;fa fa-copyright&quot;></i> lmlblog">
                                                            <img src="../static/assets/apps/test/images/qi03.jpg" alt="司空琪吧十一月壁纸"></a>
                                                        <a href="../static/assets/apps/test/images/qi03.jpg" data-fancybox="gallery" data-caption="<i class=&quot;fa fa-copyright&quot;></i> lmlblog">
                                                            <img src="../static/assets/apps/test/images/qi03.jpg" alt="司空琪吧十一月壁纸"></a>
                                                    </div>
                                                    <div class="lmlblog-post-bar">
                                                        <li onclick=";">
                                                            <i class="icon-like"></i>点赞 <span>6524</span>
                                                        </li>
                                                        <li onclick=";">
                                                            <i class="icon-share"></i>转发 <span>6524</span>
                                                        </li>
                                                        <li onclick=";">
                                                            <i class="icon-speech"></i>评论 <span>6524</span>
                                                        </li>
                                                        <li onclick=";">
                                                            <i class="icon-star"></i>收藏 <span>6524</span>
                                                        </li>

                                                        <li class="tag clear">
                                                            <i class="lmlblog-icon"></i><a href="#2" title="司空琪壁纸"># 司空琪壁纸</a></li>
                                                    </div>
                                                    <div class="lmlblog-post-like-list">
                                                        <a href="#17" id="had_like_11788">
                                                            <img src="../static/assets/apps/test/picture/11.gif" class="avatar"></a>
                                                        <a href="#18" id="had_like_11499"><img src="../static/assets/apps/test/picture/12.gif" class="avatar"></a>
                                                        <a href="#22" id="had_like_11488"><img src="../static/assets/apps/test/picture/20.png" class="avatar">
                                                            <i class="lmlblog-verify lmlblog-verify-a" title="认证信息：作者许仙白"></i></a><a href="#22" id="had_like_11477">
                                                        <img src="../static/assets/apps/test/picture/13.gif" class="avatar">
                                                        <i class="lmlblog-verify lmlblog-verify-a" title="认证信息：168号计师"></i></a><a href="#22" id="had_like_1">
                                                        <img src="../static/assets/apps/test/images/tx2.jpg" class="avatar">
                                                        <i class="lmlblog-verify lmlblog-verify-a" title="司空琪"></i></a></div>
                                                    <div class="lmlblog-post-footer-bar">
                                                        <span title="2017-12-14 05:25:48">12月14日 05:25</span>
                                                        <span>电脑端</span><i class="lmlblog-icon" onclick="lmlblog_post_type_open();"></i></div>

                                                </div>
                                            <%--动态 1END--%>
                                            <%--动态 2--%>
                                                <div class="lmlblog-posts-list words" style="background-image:url(../static/assets/apps/test/images/058.png); " data="4093">

                                                    <!-- 动态内容部分，包括列表 -->
                                                    <div class="lmlblog-post-user-info">
                                                        <div class="lmlblog-post-user-info-avatar" user-data="1">
                                                            <a href="#1" style="display: inline-block;">
                                                                <span class="lmlblog-vip-icon"></span><img src="../static/assets/apps/test/images/tx2.jpg" class="avatar"><i class="lmlblog-verify lmlblog-verify-a" title="司空琪"></i></a>
                                                            <div class="lmlblog-user-info-card" style="display: none;">
                                                                <div class="info_card_loading"><img src="../static/assets/apps/test/picture/chat-loading.gif"><p>资料加载中...</p>
                                                                </div>
                                                            </div>
                                                        </div>

                                                        <div class="lmlblog-post-user-info-name">
                                                            <a href="#1">
                                                                <font style="color:#333;font-weight:600">司空琪</font>
                                                            </a>

                                                            <span class="lmlblog-mark lmlblog-lv" title="经验：3815">Lv.6</span><span class="lmlblog-mark lmlblog-vip">VIP 6</span></div>

                                                        <div class="lmlblog-post-user-info-time" title="2017-12-01 07:17">12-01 07:17</div>

                                                    </div><!-- 作者信息 -->

                                                    <div class="lmlblog-post-setting">
                                                        <i class="fa fa-angle-down"></i>
                                                        <div class="lmlblog-post-setting-box">
                                                            <ul>
                                                                <a href="#4093.html" title="查看全文"><li>查看全文</li></a>
                                                                <a href="#1" title="访问主页"><li>访问主页</li></a>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                    <h1><a href="http://www.lmlblog.com/blog/sikongqi/2.html" title="查看全文">司空琪同人曲《一剑倾城》</a></h1>

                                                    <div class="lmlblog-post-content ">

                                                        <a class="post_list_link" href="http://www.lmlblog.com/blog/sikongqi/2.html">
                                                            <p>烈风起新秀 挥剑 尘拂袖。塞北白芒中，一袭紫衣踏雪而来。你为父寻医不畏龙潭虎穴，挥剑斩兵勇，一掷退澹台。<br>
                                                                宗家磨砺了你的坚韧，却没有磨平你的卓然风华。一剑一刃，打斗间潇洒自如，宛若惊鸿仙子。</p>
                                                        </a>
                                                        <p style="TEXT-ALIGN: center">
                                                            <iframe class="video_iframe" style="Z-INDEX: 1" height="360" src="http://v.qq.com/iframe/player.html?vid=i0560e7ceal&amp;width=500&amp;height=360&amp;auto=0" frameborder="0" width="500" allowfullscreen="allowfullscreen">
                                                            </iframe></p>
                                                    </div>
                                                    <div class="lmlblog-post-bar">
                                                        <li onclick=";">
                                                            <i class="icon-like"></i>点赞 <span>6524</span>
                                                        </li>
                                                        <li onclick=";">
                                                            <i class="icon-share"></i>转发 <span>6524</span>
                                                        </li>
                                                        <li onclick=";">
                                                            <i class="icon-speech"></i>评论 <span>6524</span>
                                                        </li>
                                                        <li onclick=";">
                                                            <i class="icon-star"></i>收藏 <span>6524</span>
                                                        </li>
                                                    </div>

                                                    <div class="lmlblog-post-like-list">
                                                        <a href="#1463" id="had_like_11463"><img src="../static/assets/apps/test/picture/19.jpg" class="avatar"></a><a href="#1555" id="had_like_11555">
                                                        <img src="../static/assets/apps/test/picture/18.jpg" class="avatar"></a><a href="#1479" id="had_like_11479">
                                                        <img src="../static/assets/apps/test/picture/13.gif" class="avatar"></a><a href="#1" id="had_like_1"><img src="../static/assets/apps/test/images/tx2.jpg" class="avatar">
                                                        <i class="lmlblog-verify lmlblog-verify-a" title="司空琪"></i></a></div>
                                                    <div class="lmlblog-post-footer-bar">
                                                        <span title="2017-12-01 07:17:50">12月01日 07:17</span>
                                                        <span>电脑端</span><i class="lmlblog-icon" onclick="lmlblog_post_type_open();"></i></div>

                                                </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!-- END PAGE CONTENT INNER -->
                        </div>
                    </div>
                    <!-- END PAGE CONTENT BODY -->
                    <!-- END CONTENT BODY -->
                </div>
                <!-- END CONTENT -->
                <!-- BEGIN QUICK SIDEBAR -->
                <a href="javascript:;" class="page-quick-sidebar-toggler">
                    <i class="icon-login"></i>
                </a>

                <!-- END QUICK SIDEBAR -->
            </div>
            <!-- END CONTAINER -->
        </div>
    </div>
    <jsp:include page="include/foot.jsp"/>
    <script src="../static/assets/apps/scripts/velocity.js"></script>
    <script src="../static/assets/apps/scripts/shutter.js"></script>
    <script>
        $(function () {
            $('.shutter').shutter({
                shutterW:938 , // 容器宽度
                shutterH: 358, // 容器高度
                isAutoPlay: true, // 是否自动播放
                playInterval: 3000, // 自动播放时间
                curDisplay: 3, // 当前显示页
                fullPage: false // 是否全屏展示
            });
        });
    </script>
</body>
</html>
