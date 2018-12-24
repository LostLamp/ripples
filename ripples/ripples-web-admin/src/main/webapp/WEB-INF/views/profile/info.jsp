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
    <link href="/static/assets/global/plugins/dropzone/min/dropzone.min.css" rel="stylesheet" type="text/css">
    <link href="/static/assets/global/plugins/dropzone/min/basic.min.css">
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
                                    <div class="profile-usertitle-name"> ${sessionScope.member.memberName} </div>
                                    <div class="profile-usertitle-job"> ${sessionScope.member.email} </div>
                                </div>
                            </div>
                            <!-- END PORTLET MAIN -->
                            <!-- PORTLET MAIN -->
                            <div class="portlet light bordered">
                                <div>
                                    <h5 class="profile-desc-title">关于 ${sessionScope.member.memberName}</h5>
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
                                                        <input type="hidden" name="memberId" value="${sessionScope.member.memberId}" />
                                                        <div class="form-group">
                                                            <label class="control-label font-blue-madison">姓名</label>
                                                            <input type="text" id="memberName" name="memberName" placeholder="${sessionScope.member.memberName}" class="form-control required" value="${sessionScope.member.memberName}" />
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
                                                    <form action="#" role="form">
                                                        <div class="form-group">
                                                           <div id="dropz" class="dropzone">

                                                           </div>
                                                        </div>
                                                        <div class="margin-top-10">
                                                            <a href="javascript:;" class="btn default"> 返回 </a>
                                                            <a href="javascript:;" class="btn green"> 提交 </a>
                                                        </div>
                                                    </form>
                                                </div>
                                                <!-- END CHANGE AVATAR TAB -->
                                                <!-- CHANGE PASSWORD TAB -->
                                                <div class="tab-pane" id="tab_1_3">
                                                    <form id="pwdForm" action="/profile/modify/password" method="post">
                                                        <input type="hidden" name="memberId" value="${sessionScope.member.memberId}" />
                                                        <div class="form-group">
                                                            <label class="control-label">当前密码</label>
                                                            <input id="oldPwd" name="oldPwd" type="password" class="form-control required" /> </div>
                                                        <div class="form-group">
                                                            <label class="control-label">新密码</label>
                                                            <input id="newPwd" name="newPwd" type="password" class="form-control required" /> </div>
                                                        <div class="form-group">
                                                            <label class="control-label">确认密码</label>
                                                            <input id="confirmPwd" name="confirmPwd" type="password" class="form-control required" /> </div>
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
<script src="/static/assets/global/plugins/dropzone/min/dropzone.min.js"></script>
<script>
    $(function () {
        Validation.initValidation("pwdForm", {
            confirmPwd: {
                equalTo: "#newPwd"
            }
        });
    });
    var myDropzone = new Dropzone("#dropz", {
        url: "/upload",
        paramName: "dropFile",
        maxFiles:1,
        dictDefaultMessage: '拖动文件至此或者点击上传', // 设置默认的提示语句
        init: function () {
            this.on("success", function (file, data) {
                // 上传成功触发的事件
                console.log(file);
                console.log(data);
            });
        }
    });
</script>
 <!-- END PAGE LEVEL SCRIPTS -->
</body>
</html>