<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sys" tagdir="/WEB-INF/tags/sys" %>

<!DOCTYPE html>
<!--[if IE 8]> <html class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html>
<!--<![endif]-->
<!-- BEGIN HEAD -->

<head>
    <title>涟漪 | 用户管理</title>
    <%@ include file="../includes/head.jsp" %>
    <%--<link href="/static/assets/global/plugins/datatables/datatables.min.css" rel="stylesheet" type="text/css" />
    <link href="/static/assets/global/plugins/datatables/plugins/bootstrap/datatables.bootstrap.css" rel="stylesheet" type="text/css" />--%>
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
                    <h1>用户管理</h1>
                </div>
            </div>

            <ul class="page-breadcrumb breadcrumb"></ul>

            <sys:message/>

            <div class="row search-area" style="display: none;">
                <div class="col-md-12">
                    <div class="portlet light bordered">
                        <div class="portlet-title">
                            <div class="caption">
                                <span class="caption-subject font-blue bold uppercase">高级搜索</span>
                            </div>
                        </div>
                        <div class="portlet-body form">
                            <!-- BEGIN FORM-->
                            <div class="horizontal-form">
                                <div class="form-body">
                                    <div class="row">
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <label class="control-label">姓名</label>
                                                <input id="memberName" type="text" class="form-control"
                                                       placeholder="姓名">
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <label class="control-label">手机</label>
                                                <input id="phone" type="text" class="form-control" placeholder="手机">
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <label class="control-label">邮箱</label>
                                                <input id="email" type="text" class="form-control" placeholder="邮箱">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-actions right">
                                    <button type="button" class="btn blue" onclick="search();"> 搜索</button>
                                </div>
                            </div>
                            <!-- END FORM-->
                        </div>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col-md-12">
                    <!-- BEGIN SAMPLE TABLE PORTLET-->
                    <div class="portlet light bordered">
                        <div class="portlet-title">
                            <div class="caption">
                                <span class="caption-subject font-blue bold uppercase">用户列表</span>
                            </div>
                            <div class="actions">
                                <a class="btn btn-circle btn-icon-only btn-default" href="javascript:;" title="搜索"
                                   onclick="$('.search-area').toggle('fast');">
                                    <i class="icon-magnifier"></i>
                                </a>
                                <a class="btn btn-circle btn-icon-only btn-default" href="/user/form" title="新增">
                                    <i class="icon-cloud-upload"></i>
                                </a>
                            </div>
                        </div>
                        <div class="btn-group">
                            <button id="sample_editable_2_new" class="btn sbold red"
                                    onclick="ICheck.delete('/delete/select')">
                                <i class="fa fa-minus"></i> 批量删除
                            </button>
                        </div>
                        <div class="portlet-body">
                            <form action="" id="deleteform">
                                <table id="dataTable" class="table table-striped table-hover table-bordered">
                                    <thead>
                                    <tr>
                                        <th>
                                            <input id="checkAll" type="checkbox" class="icheckbox_minimal check_all"/>
                                        </th>
                                        <th> 姓名</th>
                                        <th> 手机</th>
                                        <th> 邮箱</th>
                                        <th> 更新时间</th>
                                        <th> 操作</th>
                                    </tr>
                                    </thead>
                                    <tbody></tbody>
                                </table>
                            </form>
                        </div>
                    </div>
                    <!-- END SAMPLE TABLE PORTLET-->
                </div>
            </div>
        </div>
    </div>
</div>

<!--模态框-->
<sys:model message=""/>
<!--模态框-->
<%@ include file="../includes/footer.jsp" %>
<script src="/static/assets/global/scripts/datatable.js" type="text/javascript"></script>
<script src="/static/assets/global/plugins/datatables/datatables.min.js" type="text/javascript"></script>
<script src="/static/assets/global/plugins/datatables/plugins/bootstrap/datatables.bootstrap.js"
        type="text/javascript"></script>
<script src="/static/assets/apps/ripple/datatables.js" type="text/javascript"></script>
<script src="/static/assets/apps/ripple/dateutils.js" type="text/javascript"></script>
<script src="/static/assets/apps/ripple/sweetalert.js" type="text/javascript"></script>
<script src="/static/assets/apps/ripple/form-icheck.js" type="text/javascript"></script>
<script>
    var _grid;

    $(function () {
        _grid = DataTables.initDataTable("/user/page", [
            {
                "data": function (row, type, set, meta) {
                    return "<input name='deletesid' id=" + row.id + "value=" + row.id + "  type=\"checkbox\" class=\"icheckbox_minimal\"/>";
                }
            },
            {"data": "memberName"},
            {"data": "phone"},
            {"data": "email"},
            {
                "data": function (row, type, set, meta) {
                    return DateUtils.format(row.updated, 'yyyy-MM-dd HH:mm:ss');
                }
            },
            {
                "data": function (row, type, set, meta) {
                    return '<a href="/user/form" class="btn blue btn-circle btn-outline sbold uppercase mt-sweetalert"> 新增 </a>&nbsp;&nbsp;' +
                        '<a href="/user/form?id=' + row.memberId + '" class="btn green btn-circle btn-outline sbold uppercase mt-sweetalert"> 编辑 </a>&nbsp;&nbsp;' +
                        '<button class="btn red btn-circle btn-outline sbold uppercase mt-sweetalert" \n' +
                        ' data-title="确定删除当前数据项吗？" \n' +
                        ' data-type="warning" \n' +
                        ' data-show-confirm-button="true" \n' +
                        ' data-confirm-button-class="btn-danger" \n' +
                        ' data-show-cancel-button="true" \n' +
                        ' data-cancel-button-class="btn-default" \n' +
                        ' data-close-on-confirm="false" \n' +
                        ' data-close-on-cancel="false" \n' +
                        ' data-confirm-button-text=\'确定\'\n' +
                        ' data-cancel-button-text=\'取消\' \n' +
                        ' data-popup-title-success="已删除" \n' +
                        ' data-popup-title-cancel="已取消" \n' +
                        ' data-url="/user/delete?id=' + row.memberId + '" \n' +
                        ' >删除</button>'
                }
            }
        ]);
    });

    function search() {
        // 清理传递的参数
        _grid.clearAjaxParams();

        var memberName = $("#memberName").val();
        var phone = $("#phone").val();
        var email = $("#email").val();

        if (memberName.length != 0) {
            _grid.setAjaxParam("memberName", memberName);
        }

        if (phone.length != 0) {
            _grid.setAjaxParam("phone", phone);
        }

        if (email.length != 0) {
            _grid.setAjaxParam("email", email);
        }

        // 重新加载 Ajax 数据
        _grid.getDataTable().ajax.reload();
    }
</script>
</body>
</html>