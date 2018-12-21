<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sys" tagdir="/WEB-INF/tags/sys" %>

<!DOCTYPE html>
<!--[if IE 8]> <html class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html>
<!--<![endif]-->
<!-- BEGIN HEAD -->

<head>
    <title>涟漪 | 管理员个人信息</title>
    <%@ include file="../includes/head.jsp" %>

    <!-- BEGIN PAGE LEVEL STYLES -->
    <link href="/static/assets/pages/css/profile.css" rel="stylesheet" type="text/css" />
    <!-- END PAGE LEVEL STYLES -->
</head>
<!-- END HEAD -->

<body class="page-container-bg-solid page-header-fixed page-sidebar-closed-hide-logo">
    <%@ include file="../includes/header.jsp" %>
    <div class="page-container">
        <%@ include file="../includes/menu.jsp" %>
        <div class="page-content-wrapper">
            <div class="page-content">
                <div class="page-head">
                    <div class="page-title">
                        <h2>管理员个人信息</h2>
                    </div>
                </div>

               <%-- <ul class="page-breadcrumb breadcrumb"></ul>--%>

                <sys:message />

                <div class="row">
                    <div class="col-md-12">
                        <div class="profile-sidebar">
                            <!-- PORTLET MAIN -->
                            <div class="portlet light profile-sidebar-portlet bordered">
                                <div class="profile-userpic">
                                    <img src="/static/assets/pages/media/profile/profile_user.jpg" class="img-responsive" alt="">
                                </div>

                                <div class="profile-usertitle">
                                    <div class="profile-usertitle-name"> ${sessionScope.member.membername} </div>
                                    <div class="profile-usertitle-job"> ${sessionScope.member.email} </div>
                                </div>
                            </div>
                            <!-- END PORTLET MAIN -->
                            <!-- PORTLET MAIN -->
                            <div class="portlet light bordered">
                                <div>
                                    <h5 class="profile-desc-title">关于 ${sessionScope.member.membername}</h5>
                                    <span class="profile-desc-text"> 单 身 一 枚 </span><br /><br />
                                    <span class="profile-desc-text"> 需要就联系${sessionScope.member.phone} </span>
                                </div>
                            </div>
                            <!-- END PORTLET MAIN -->
                        </div>
                        <div class="profile-content">
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="portlet light bordered">
                                        <div class="portlet-title tabbable-line">
                                            <div class="caption caption-md">
                                                <i class="icon-globe theme-font hide"></i>
                                                <span class="caption-subject font-blue-madison bold uppercase">管理员信息</span>
                                            </div>
                                            <ul class="nav nav-tabs">
                                                <li class="active">
                                                    <a href="#tab_1_1" data-toggle="tab">个人信息</a>
                                                </li>
                                                <li>
                                                    <a href="#tab_1_2" data-toggle="tab">上传头像</a>
                                                </li>
                                                <li>
                                                    <a href="#tab_1_3" data-toggle="tab">修改密码</a>
                                                </li>
                                            </ul>
                                        </div>
                                        <div class="portlet-body">
                                            <div class="tab-content">
                                                <!-- PERSONAL INFO TAB -->
                                                <div class="tab-pane active" id="tab_1_1">
                                                    <form id="inputForm" role="form" action="/profile/save" method="post">
                                                        <input type="hidden" name="id" value="${sessionScope.member.id}" />
                                                        <div class="form-group">
                                                            <label class="control-label font-blue-madison">姓名</label>
                                                            <input type="text" id="membername" name="membername" placeholder="${sessionScope.member.membername}" class="form-control required" value="${sessionScope.member.membername}" />
                                                        </div>
                                                        <div class="form-group">
                                                            <label class="control-label font-blue-madison">手机</label>
                                                            <input type="text" id="phone" name="phone" placeholder="${sessionScope.member.phone}" class="form-control required mobile" value="${sessionScope.member.phone}" /> </div>
                                                        <div class="form-group">
                                                            <label class="control-label font-blue-madison">邮箱</label>
                                                            <input type="text" id="email" name="email" placeholder="${sessionScope.member.email}" class="form-control required email" value="${sessionScope.member.email}" /> </div>
                                                        <div class="margiv-top-10">
                                                            <button type="submit" class="btn green"> 保存 </button>
                                                        </div>
                                                    </form>
                                                </div>
                                                <!-- END PERSONAL INFO TAB -->
                                                <!-- CHANGE AVATAR TAB -->
                                                <div class="tab-pane" id="tab_1_2">
                                                    <p> Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum
                                                        eiusmod. </p>
                                                    <form action="#" role="form">
                                                        <div class="form-group">
                                                            <div class="fileinput fileinput-new" data-provides="fileinput">
                                                                <div class="fileinput-new thumbnail" style="width: 200px; height: 150px;">
                                                                    <img src="http://www.placehold.it/200x150/EFEFEF/AAAAAA&amp;text=no+image" alt="" /> </div>
                                                                <div class="fileinput-preview fileinput-exists thumbnail" style="max-width: 200px; max-height: 150px;"> </div>
                                                                <div>
                                                                        <span class="btn default btn-file">
                                                                            <span class="fileinput-new"> Select image </span>
                                                                            <span class="fileinput-exists"> Change </span>
                                                                            <input type="file" name="..."> </span>
                                                                    <a href="javascript:;" class="btn default fileinput-exists" data-dismiss="fileinput"> Remove </a>
                                                                </div>
                                                            </div>
                                                            <div class="clearfix margin-top-10">
                                                                <span class="label label-danger">NOTE! </span>
                                                                <span>Attached image thumbnail is supported in Latest Firefox, Chrome, Opera, Safari and Internet Explorer 10 only </span>
                                                            </div>
                                                        </div>
                                                        <div class="margin-top-10">
                                                            <a href="javascript:;" class="btn green"> Submit </a>
                                                            <a href="javascript:;" class="btn default"> Cancel </a>
                                                        </div>
                                                    </form>
                                                </div>
                                                <!-- END CHANGE AVATAR TAB -->
                                                <!-- CHANGE PASSWORD TAB -->
                                                <div class="tab-pane" id="tab_1_3">
                                                    <form id="pwdForm" action="/profile/modify/password" method="post">
                                                        <input type="hidden" name="id" value="${sessionScope.member.id}" />
                                                        <div class="form-group">
                                                            <label class="control-label">当前密码</label>
                                                            <input id="oldPassword" name="oldPassword" type="password" class="form-control required" /> </div>
                                                        <div class="form-group">
                                                            <label class="control-label">新密码</label>
                                                            <input id="newPassword" name="newPassword" type="password" class="form-control required" /> </div>
                                                        <div class="form-group">
                                                            <label class="control-label">确认密码</label>
                                                            <input id="repeatPassword" name="repeatPassword" type="password" class="form-control required" /> </div>
                                                        <div class="margin-top-10">
                                                            <button type="submit" class="btn green"> 保存 </button>
                                                        </div>
                                                    </form>
                                                </div>
                                                <!-- END CHANGE PASSWORD TAB -->
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <%@ include file="../includes/footer.jsp" %>

<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="/static/assets/global/plugins/jquery-validation/js/jquery.validate.min.js" type="text/javascript"></script>
<script src="/static/assets/global/plugins/jquery-validation/js/localization/messages_zh.min.js" type="text/javascript"></script>
<script src="/static/assets/global/plugins/jquery-validation/js/additional-methods.min.js" type="text/javascript"></script>
    <script src="/static/assets/apps/ripple/validation.js" type="text/javascript"></script>
    <script>
        $(function () {
            Validation.initValidation("pwdForm", {
                repeatPassword: {
                    equalTo: "#newPassword"
                }
            });
        });
    </script>
 <!-- END PAGE LEVEL SCRIPTS -->
</body>
</html>