var myEditor =function () {
    var headlerInitMyEditor=function (editorId,contentId,sendId) {
        $(function () {
            $("#"+contentId).keyup(function () {
                //判断输入的字符串长度
                var content_len = $("#"+contentId).text().replace(/\s/g, "").length;
                $(".tips").text("已经输入" + content_len + "个字");
                if (content_len == 0) {
                    // alert(content);
                    $(".tips").text("");
                    $("#"+sendId).addClass("disabled");
                    return false;
                } else {
                    $("#"+sendId).removeClass("disabled");
                }
            });
            $(".pic").click(function () {
                $(".select_Img").click();
            })
            // 	function confirm(){
            // 		var r= new FileReader();
            // f=$(".select_Img").files[0];
            // r.readAsDataURL(f);
            // r.onload=function(e) {
            // 	$(".preview").src=this.result;
            // };
            // 	}
            //点击按钮发送内容
            $("#"+sendId).click(function () {
                // var myDate = new Date();
                //   var min = myDate.getMinutes();
                //   var time = min-(min-1);
                //   //alert(time);
                var content = $("#"+contentId).html();
                //判断选择的是否是图片格式
                var imgPath = $(".imgPath").text();
                var start = imgPath.lastIndexOf(".");
                var postfix = imgPath.substring(start, imgPath.length).toUpperCase();
                if (imgPath != "") {
                    if (postfix != ".PNG" && postfix != ".JPG" && postfix != ".GIF" && postfix != ".JPEG") {
                        alert("图片格式需为png,gif,jpeg,jpg格式");
                    } else {
                        $(".item_msg").append("<div class='col-sm-12 col-xs-12 message' > <img src='/static/assets/apps/img/editor/icon.png' class='col-sm-2 col-xs-2' style='border-radius: 50%'><div class='col-sm-10 col-xs-10'><span style='font-weight: bold;''>Jack.C</span> <br><small class='date' style='color:#999'>刚刚</small><div class='msg_content'>" + content + "<img class='mypic' onerror='this.src='/static/assets/apps/img/editor/bg_1.jpg' src='file:///" + imgPath + "' ></div></div></div>");
                    }
                } else {
                    $(".item_msg").append("<div class='col-sm-12 col-xs-12 message' > <img src='/static/assets/apps/img/editor/icon.png' class='col-sm-2 col-xs-2' style='border-radius: 50%'><div class='col-sm-10 col-xs-10'><span style='font-weight: bold;''>Jack.C</span> <br><small class='date' style='color:#999'>刚刚</small><div class='msg_content'>" + content + "</div></div></div>");
                }
            });
            //添加表情包1
            for (var i = 1; i < 60; i++) {
                $("#"+editorId+" .emoji_1").append("<img src='/static/assets/apps/img/editor/f" + i + ".png' style='width:35px;height:35px' >");
            }
            //添加表情包2
            for (var i = 1; i < 61; i++) {
                $("#"+editorId+" .emoji_2").append("<img src='/static/assets/apps/img/editor/h" + i + ".png' style='width:35px;height:35px' >");
            }
            $(".emoji").click(function () {
                $(".myEmoji").show();
                //点击空白处隐藏弹出层
                $(document).click(function (e) {
                    if (!$("#"+editorId).is(e.target) && $("#"+editorId).has(e.target).length === 0) {
                        $(".myEmoji").hide();
                    }
                });
            });
            //将表情添加到输入框
            $("#"+editorId+" .myEmoji img").each(function () {
                $(this).click(function () {
                    var url = $(this)[0].src;
                    alert(url);
                    $("#"+contentId).append("<img src='" + url + "' style='width:25px;height:25px' >");
                    $("#"+sendId).removeClass("disabled");
                })
            })
            //放大或缩小预览图片
            $(".mypic").click(function () {
                var oWidth = $(this).width(); //取得图片的实际宽度
                var oHeight = $(this).height(); //取得图片的实际高度
                if ($(this).height() != 200) {
                    $(this).height(200);
                } else {
                    $(this).height(oHeight + 200 / oWidth * oHeight);
                }
            })
        })
    }
    return{
        initMyEditor:function (editorId,contentId,sendId) {
            headlerInitMyEditor(editorId,contentId,sendId);
        }
    }
}();