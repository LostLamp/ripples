<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ attribute name="message" type="java.lang.String" required="true" description="模态框中的信息" %>
<%@ attribute name="opts" type="java.lang.String" required="false" description="操作类型：info/提示信息，confirm/确认按钮" %>
<%@ attribute name="url" type="java.lang.String" required="false" description="请求地址，确认删除时使用" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--开始没勾选就点击删除的模态框-->
<div class="modal fade draggable-modal" id="draggable" tabindex="-1" role="basic" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h4 class="modal-title">温馨提示</h4>
            </div>
            <div id="modal-message" class="modal-body">${message}</div>
            <div class="modal-footer">
                <button type="button" class="btn dark btn-outline" data-dismiss="modal">关闭</button>
                <button id="confirm" type="button" class="btn green">确认</button>
            </div>
        </div>
        <!-- /.modal-content -->
    </div>
    <!-- /.modal-dialog -->
</div>
<!--结束没勾选就点击删除的模态框-->
