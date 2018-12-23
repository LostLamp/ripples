<%@ tag language="java" pageEncoding="UTF-8"%>
<div class="alert ${message == null ? 'display-hide' : message.contains('成功') ? 'alert-success' : 'alert-danger'}">
    <button class="close" data-close="alert"></button>
    <span> ${message} </span>
</div>
<div class="alert alert-block  ${res == null ? 'display-hide':res.contains('成功')?'alert-success':'alert-danger'} fade in">
    <button type="button" class="close" data-dismiss="alert"></button>
    ${res}
</div>