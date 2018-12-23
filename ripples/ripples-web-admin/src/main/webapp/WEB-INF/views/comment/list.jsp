<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<!--[if IE 8]> <html class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html>
<!--<![endif]-->
<!-- BEGIN HEAD -->

<head>
    <title>涟漪 | 评论管理</title>
    <%@ include file="../includes/head.jsp" %>
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
                    <h1>评论管理</h1>
                </div>
            </div>

            <ul class="page-breadcrumb breadcrumb"></ul>

            <sys:message />

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
                                                <label class="control-label">评论内容</label>
                                                <input id="content" type="text" class="form-control" placeholder="评论内容">
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
                                <span class="caption-subject font-blue bold uppercase">评论列表</span>
                            </div>
                            <div class="actions">
                                <a class="btn btn-circle btn-icon-only btn-default" href="javascript:;" title="搜索" onclick="$('.search-area').toggle('fast');">
                                    <i class="icon-magnifier"></i>
                                </a>
                            </div>
                        </div>
                        <div class="portlet-body">
                            <table id="dataTable" class="table table-striped table-hover table-bordered">
                                <thead>
                                <tr>
                                    <th> 评论ID </th>
                                    <th> 评论父ID </th>
                                    <th> 消息ID </th>
                                    <th> 会员ID </th>
                                    <th> 评论内容 </th>
                                    <th> 评论时间 </th>
                                    <th style="width: 50px"> 操作 </th>
                                </tr>
                                </thead>
                                <tbody></tbody>
                            </table>
                        </div>
                    </div>
                    <!-- END SAMPLE TABLE PORTLET-->
                </div>
            </div>
        </div>
    </div>
</div>

<%@ include file="../includes/footer.jsp" %>
<script src="/static/assets/global/scripts/datatable.js" type="text/javascript"></script>
<script src="/static/assets/global/plugins/datatables/datatables.min.js" type="text/javascript"></script>
<script src="/static/assets/global/plugins/datatables/plugins/bootstrap/datatables.bootstrap.js" type="text/javascript"></script>
<script src="/static/assets/apps/ripple/datatables.js" type="text/javascript"></script>
<script src="/static/assets/apps/ripple/dateutils.js" type="text/javascript"></script>
<script src="/static/assets/apps/ripple/sweetalert.js" type="text/javascript"></script>

<script>
    var _grid;

    $(function () {
        _grid = DataTables.initDataTable("/comment/page", [
            {"data": "commentId"},
            {"data": "parentId"},
            {"data": "archiveId"},
            {"data": "memberId"},
            {"data": "content"},
            {
                "data": function (row, type, set, meta) {
                    return DateUtils.format(row.created, 'yyyy-MM-dd HH:mm:ss');
                }
            },
            {
                "data": function (row, type, set, meta) {
                    return '<button type="button" class="btn btn-sm red-mint mt-sweetalert btn-outline sbold uppercase"' +
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
                        ' data-url="/comment/delete?id='+row.commentId+'"\n'+
                        ' >删除<i class="fa fa-trash"></i></button>'
                }
            }
        ]);
    });
    function search() {
        // 清理传递的参数
        _grid.clearAjaxParams();

        var content = $("#content").val();

        if (content.length != 0) {
            _grid.setAjaxParam("content", content);
        }

        // 重新加载 Ajax 数据
        _grid.getDataTable().ajax.reload();
    }

</script>
</body>
</html>

