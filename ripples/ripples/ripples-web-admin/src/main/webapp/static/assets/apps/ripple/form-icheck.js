var ICheck = function () {

    var _checkAll;
    var _checkbox;

    /**
     * 初始化勾选框样式
     */
    var handlerCheckbox = function () {

        $('input[type="checkbox"].icheckbox_minimal').iCheck({
            checkboxClass: 'icheckbox_minimal-blue'
        });
        // 获取控制全选的单个勾选框
        _checkAll = $('input[type="checkbox"].icheckbox_minimal.check_all');
        // 获取全部的勾选框
        _checkbox = $('input[type="checkbox"].icheckbox_minimal');
    };

    /**
     * 全选功能
     */
    var handlerCheckAll = function () {
        // 为 true 表示为未点击前状态为勾选中，
        _checkAll.on("ifClicked", function (e) {
            // 为 true 表示 未选中
            if (e.target.checked) {
                _checkbox.iCheck("uncheck");
            }
            // 为 false 表示 选中
            else {
                _checkbox.iCheck("check");
            }
        })
        // 全部勾选框控制全选框
        var num = 0;
        _checkbox.each(function () {
            $(this).on("ifClicked", function (e) {
                // 没有勾选上
                if (e.target.checked) {
                    // 全选则消失
                    _checkAll.iCheck("uncheck");
                }
            })
            if ($(this).checked == false) {
                num++;
            }
        });
        if (num == _checkbox.length) {
            _checkAll.iCheck("check");
        }
    };

    // 多选删除
    var handlerDeleteMulti = function (url) {
        // 定义存储 id 的数组
        var idArray = new Array();
        // 获取每一个勾选框对象
        var _checkbox = $('input[type="checkbox"].icheckbox_minimal');
        // 遍历每一个勾选框对象
        _checkbox.each(function () {
            // 获取里面勾选上带有的 id 的值
            var _id = $(this).attr("id");
            console.log($(this));
            if (_id != "undefined" && _id != null && $(this).is(":checked")) {
                idArray.push(_id);
            }
        });
        // 如果没有勾选上，模态框弹出提示
        if (idArray.length === 0) {

            $("#modal-message").html("您还没有选择任何数据，请至少选择一项")
        }
        // 勾选上就提示是否删除
        else {
            $("#modal-message").html("您确定删除吗？")
        }
        // 模态框展示信息出来
        $("#draggable").modal("show");

        // 给确认按钮绑定删除事件
        $("#confirm").bind("click", function () {
            del(idArray, url);
        });

        // AJAX 异步删除
        function del(idArray, url) {
            $("#draggable").modal("hide");

            if (idArray.length === 0) {
                // 没有勾选，处理项就不处理
            }
            // 删除处理
            else {
                $.ajax({
                    "url": url,
                    "type": "POST",
                    "data": {"ids": idArray.toString()},
                    "dataType": "JSON",
                    "success": function (data) {
                        if (data === 200) {
                            // 请求删除成功
                            window.location.reload();
                        }
                        // 删除失败
                        else {
                            // 给确定按钮解绑
                            $("#confirm").unbind("click");
                            // 重新绑定隐藏事件
                            $("#confirm").bind("click", function () {
                                $("#draggable").modal("hide");
                            });
                            $("#modal-message").html("请求失败");
                            $("#draggable").modal("show");
                        }
                    }
                });
            }
        }
    };

    return {
        init: function () {
            handlerCheckbox();
            handlerCheckAll();
        },
        getCheckbox: function () {
            return _checkbox;
        },
        delete: function (url) {
            handlerDeleteMulti(url);
        }
    }
}();

$(document).ready(function () {
    ICheck.init();
});