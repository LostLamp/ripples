<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/20
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的信息</title>
    <link href="/static/assets/pages/css/profile.min.css" rel="stylesheet" type="text/css">
    <jsp:include page="../include/head.jsp"/>
</head>
<body class="page-container-bg-solid">
<jsp:include page="../include/header.jsp"/>
<!---->
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
                                <a href="/personal">首页</a>
                                <i class="fa fa-circle"></i>
                            </li>
                            <li>
                                <a href="/profile">个人中心</a>
                            </li>

                        </ul>
                        <!-- END PAGE BREADCRUMBS -->
                        <!-- BEGIN PAGE CONTENT INNER -->
                        <div class="page-content-inner">
                            <div class="inbox">
                                <div class="row">
                                    <jsp:include page="../include/menu.jsp"/>
                                    <div class="col-md-9">
                                        <!-- BEGIN PROFILE CONTENT -->
                                        <div class="profile-content">
                                            <div class="row">
                                                <div class="col-md-12">
                                                    <div class="portlet light bordered">
                                                        <div class="portlet-title tabbable-line">
                                                            <div class="caption caption-md">
                                                                <i class="icon-globe theme-font hide"></i>
                                                                <span class="caption-subject font-blue-madison bold uppercase">我的账户</span>
                                                            </div>
                                                            <ul class="nav nav-tabs">
                                                                <li class="active">
                                                                    <a href="#tab_1_1" data-toggle="tab">个人信息</a>
                                                                </li>
                                                                <li>
                                                                    <a href="#tab_1_2" data-toggle="tab">修改头像</a>
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
                                                                    <form role="form" action="/profile/update" method="post" id="updateform" >
                                                                        <input type="text" name="id" value="${sessionScope.user.id}" hidden>
                                                                        <div class="form-group">
                                                                            <label class="control-label">账户名</label>
                                                                            <input type="text" placeholder="${sessionScope.user.sname}" name="sname" class="form-control " value="${sessionScope.user.sname}"/> </div>

                                                                        <div class="form-group">
                                                                            <label class="control-label">性别</label>
                                                                            <div class="md-radio-inline">
                                                                                <div class="md-radio has-success">
                                                                                    <input type="radio" id="radio14" name="sex" class="md-radiobtn" value="男" ${"男".equals(sessionScope.user.sex)? "checked":""}>
                                                                                    <label for="radio14">
                                                                                        <span></span>
                                                                                        <span class="check"></span>
                                                                                        <span class="box"></span> 男 </label>
                                                                                </div>
                                                                                <div class="md-radio has-error">
                                                                                    <input type="radio" id="radio15" name="sex" class="md-radiobtn" value="女" ${"女".equals(sessionScope.user.sex)? "checked":""}>
                                                                                    <label for="radio15">
                                                                                        <span></span>
                                                                                        <span class="check"></span>
                                                                                        <span class="box"></span> 女 </label>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label">电话</label>
                                                                            <input type="text" placeholder="${sessionScope.user.phone}" name="phone" class="form-control required phone" value="${sessionScope.user.phone}"/> </div>
                                                                        <div class="form-group" id="myemail">
                                                                            <label class="control-label">邮箱</label>
                                                                            <input type="text" placeholder="${sessionScope.user.email}" name="email" id="email" class="form-control required email" value="${sessionScope.user.email}"/> </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label">地址</label>
                                                                            <input type="text" placeholder="${sessionScope.user.address}" name="address" class="form-control" value="${sessionScope.user.address}"/> </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label">个人说明</label>
                                                                            <textarea class="form-control" rows="3" placeholder="${sessionScope.user.about}" name="about" >${sessionScope.user.about}</textarea>
                                                                        </div>
                                                                        <div class="margiv-top-10">
                                                                            <button type="submit" class="btn green" > 保存 </button>
                                                                            <a href="javascript:;" class="btn default"> 取消 </a>
                                                                        </div>
                                                                    </form>
                                                                </div>
                                                                <!-- END PERSONAL INFO TAB -->
                                                                <!-- CHANGE AVATAR TAB -->
                                                                <div class="tab-pane" id="tab_1_2">
                                                                    <p> 一个人的成功既要靠自身的奋斗，但也要考虑历史的进程 </p>
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
                                                                    <form action="/profile/updatepassword" method="post" id="updatepwdform">
                                                                        <input hidden value="${sessionScope.user.id}" name="id">
                                                                        <div class="form-group">
                                                                            <label class="control-label ">旧密码</label>
                                                                            <input type="password" name="password" class="form-control required" /> </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label ">新密码</label>
                                                                            <input type="password" name="newPassword" id="newPassword" class="form-control required newPassword" /> </div>
                                                                        <div class="form-group">
                                                                            <label class="control-label">确认密码</label>
                                                                            <input type="password" name="RetypeNewPassword" class="form-control required RetypeNewPassword" /> </div>
                                                                        <div class="margin-top-10">
                                                                            <button type="submit" class="btn green">修改密码</button>
                                                                            <a href="javascript:;" class="btn default"> 取消 </a>
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
                                        <!-- END PROFILE CONTENT -->
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
<jsp:include page="../include/foot.jsp"/>
</body>
</html>
