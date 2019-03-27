<%--
  Created by IntelliJ IDEA.
  User: dz
  Date: 2018/12/24
  Time: 22:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<link href="/static/froala_editor_2.8.5/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" href="/static/froala_editor_2.8.5/codemirror/codemirror-5.40.2/lib/codemirror.css">
<link href="/static/froala_editor_2.8.5/css/themes/dark.min.css" rel="stylesheet" type="text/css"/>
<!-- Include Editor style. -->
<link href="/static/froala_editor_2.8.5/css/froala_editor.pkgd.min.css" rel="stylesheet" type="text/css"/>
<link href="/static/froala_editor_2.8.5/css/froala_style.min.css" rel="stylesheet" type="text/css"/>--%>
<style>
    #content {
        border: 1px solid saddlebrown;
        padding: 16px;
        border-radius: 2px
    }

    .list {
        top: 15px;
        width: 140px;
        height: 40px;
        border: 1px solid #0082E6;
        display: inline-block;
        border-radius: 2px;
        position: relative;
        line-height: 40px;
    }

    #file {
        position: absolute;
        opacity: 0;
        color: white;
        width: 100%;
        height: 100%;
        z-index: 100;
    }

    .list span {
        display: inline-block;
        text-align: center;
        width: 100%;
        line-height: 40px;
        position: absolute;
        color: #0082E6;
    }

    video {
        margin-top: 8px;
        border-radius: 4px;
    }

    ._p {
        margin: 14px;
    }

    ._p input {
        display: inline-block;
        width: 70%;
        margin-left: 6px;
    }

    ._p span {
        font-size: 15px;
    }
</style>

<html>
<head>
    <title>测试</title>
</head>
<body>
<div id="content"  >
    <p class="_p"><span>视频标题</span>：<input id="title" type="text" class="form-control" placeholder="请输入视频名称"></p>
    <p class="_p">
        <span>选择视频： </span>
        <!--文件选择按钮-->
        <a class="list" href="javascript:;">
            <input id="file" type="file" name="myfile" onchange="UpladFile();" /><span>选择视频</span>
        </a>
        <!--上传速度显示-->
        <span id="time"></span>
    </p>
    <!--显示消失-->
    <ul class="el-upload-list el-upload-list--text" style="display:  none;">
        <li tabindex="0" class="el-upload-list__item is-success" >
            <a class="el-upload-list__item-name">
                <i class="el-icon-document"></i><span id="videoName">food.jpeg</span>
            </a>
            <label class="el-upload-list__item-status-label" >
                <i class="el-icon-upload-success el-icon-circle-check" ></i>
            </label>
            <i class="el-icon-close" onclick="del();"></i>
            <i class="el-icon-close-tip"></i>
        </li>
    </ul>

    <!--进度条-->
    <div class="el-progress el-progress--line" style="display: none;">
        <div class="el-progress-bar">
            <div class="el-progress-bar__outer" style="height: 6px;">
                <div class="el-progress-bar__inner" style="width: 0%;">
                </div>
            </div>
        </div>
        <div class="el-progress__text" style="font-size: 14.4px;">0%</div>
    </div>
    <p class="_p"><span>上传视频</span>：<button class="btn btn-primary" type="button" onclick="sub();">上传</button></p>
    <!--预览框-->
    <div class="preview">

    </div>
</div>

<input node-type="fileInput" type="file" name="video" hidefoucs="true" title="视频" accept=".mpg,.m4v,.mp4,.flv,.3gp,.mov,.avi,.rmvb,.mkv,.wmv" style="cursor:pointer;width:1000px;height:1000px;position:absolute;bottom:0;right:0;font-size:200px;" id="publisher_upvideo_154566445401710">
<script type="text/javascript">
    var xhr;//异步请求对象
    var ot; //时间
    var oloaded;//大小
    //上传文件方法
    function UpladFile() {
        var fileObj = document.getElementById("file").files[0]; // js 获取文件对象
        if(fileObj.name){
            $(".el-upload-list").css("display","block");
            $(".el-upload-list li").css("border","1px solid #20a0ff");
            $("#videoName").text(fileObj.name);
        }else{
            alert("请选择文件");
        }
    }
    /*点击取消*/
    function del(){
        $("#file").val('');
        $(".el-upload-list").css("display","none");
    }
    /*点击提交*/
    function sub(){
        var fileObj = document.getElementById("file").files[0]; // js 获取文件对象
        if(fileObj==undefined||fileObj==""){
            alert("请选择文件");
            return false;
        };
        var title = $.trim($("#title").val());
        if(title==''){
            alert("请填写视频标题");
            return false;
        }
        var url = "{php echo webUrl('goods/iframe.upload')}"; // 接收上传文件的后台地址
        var form = new FormData(); // FormData 对象
        form.append("mf", fileObj); // 文件对象
        form.append("title", title); // 标题
        xhr = new XMLHttpRequest(); // XMLHttpRequest 对象
        xhr.open("post", url, true); //post方式，url为服务器请求地址，true 该参数规定请求是否异步处理。
        xhr.onload = uploadComplete; //请求完成
        xhr.onerror = uploadFailed; //请求失败
        xhr.upload.onprogress = progressFunction; //【上传进度调用方法实现】
        xhr.upload.onloadstart = function() { //上传开始执行方法
            ot = new Date().getTime(); //设置上传开始时间
            oloaded = 0; //设置上传开始时，以上传的文件大小为0
        };
        xhr.send(form); //开始上传，发送form数据
    }

    //上传进度实现方法，上传过程中会频繁调用该方法
    function progressFunction(evt) {
        // event.total是需要传输的总字节，event.loaded是已经传输的字节。如果event.lengthComputable不为真，则event.total等于0
        if(evt.lengthComputable) {
            $(".el-progress--line").css("display","block");
            /*进度条显示进度*/
            $(".el-progress-bar__inner").css("width", Math.round(evt.loaded / evt.total * 100) + "%");
            $(".el-progress__text").html(Math.round(evt.loaded / evt.total * 100)+"%");
        }

        var time = document.getElementById("time");
        var nt = new Date().getTime(); //获取当前时间
        var pertime = (nt - ot) / 1000; //计算出上次调用该方法时到现在的时间差，单位为s
        ot = new Date().getTime(); //重新赋值时间，用于下次计算

        var perload = evt.loaded - oloaded; //计算该分段上传的文件大小，单位b
        oloaded = evt.loaded; //重新赋值已上传文件大小，用以下次计算

        //上传速度计算
        var speed = perload / pertime; //单位b/s
        var bspeed = speed;
        var units = 'b/s'; //单位名称
        if(speed / 1024 > 1) {
            speed = speed / 1024;
            units = 'k/s';
        }
        if(speed / 1024 > 1) {
            speed = speed / 1024;
            units = 'M/s';
        }
        speed = speed.toFixed(1);
        //剩余时间
        var resttime = ((evt.total - evt.loaded) / bspeed).toFixed(1);
        time.innerHTML = '上传速度：' + speed + units + ',剩余时间：' + resttime + 's';
        if(bspeed == 0)
            time.innerHTML = '上传已取消';
    }
    //上传成功响应
    function uploadComplete(evt) {
        //服务断接收完文件返回的结果  注意返回的字符串要去掉双引号
        if(evt.target.responseText){
            var str = "../shiping/"+evt.target.responseText;
            alert("上传成功！");
            $(".preview").append("<video  controls='' autoplay='' name='media'><source src="+str+" type='video/mp4'></video>");
        }else{
            alert("上传失败");
        }
    }
    //上传失败
    function uploadFailed(evt) {
        alert("上传失败！");
    }
</script>
<%--
<script src="/static/assets/global/plugins/jquery.min.js" type="text/javascript"></script>
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript"
        src="/static/froala_editor_2.8.5/codemirror/codemirror-5.40.2/lib/codemirror.js"></script>
<script type="text/javascript" src="/static/froala_editor_2.8.5/codemirror/codemirror-5.40.2/mode/xml/xml.js"></script>

<!-- Include Editor JS files. -->
<script type="text/javascript" src="/static/froala_editor_2.8.5/js/froala_editor.pkgd.min.js"></script>
<!--中文字体包，注意要放在最下面，不然会报错-->
<script type="text/javascript" src="/static/froala_editor_2.8.5/js/languages/zh_cn.js"></script>

<script type="text/javascript">
    $(function () {

        //超大屏幕的功能按钮
        var toolbarButtons = ['fullscreen', 'bold', 'italic', 'underline', 'strikeThrough', 'subscript', 'superscript', 'fontFamily', 'fontSize', '|', 'color', 'emoticons', 'inlineStyle', 'paragraphStyle', '|', 'paragraphFormat', 'align', 'formatOL', 'formatUL', 'outdent', 'indent', 'quote', 'insertHR', '-', 'insertLink', 'insertImage', 'insertVideo', 'insertFile', 'insertTable', 'undo', 'redo', 'clearFormatting', 'selectAll', 'html'];
        //大屏幕的功能按钮
        var toolbarButtonsMD = ['fullscreen', 'bold', 'italic', 'underline', 'fontFamily', 'fontSize', 'color', 'paragraphStyle', 'paragraphFormat', 'align', 'formatOL', 'formatUL', 'outdent', 'indent', 'quote', 'insertHR', 'insertLink', 'insertImage', 'insertVideo', 'insertFile', 'insertTable', 'undo', 'redo', 'clearFormatting'];
        //小屏幕的功能按钮
        var toolbarButtonsSM = ['fullscreen', 'bold', 'italic', 'underline', 'fontFamily', 'fontSize', 'insertLink', 'insertImage', 'insertTable', 'undo', 'redo'];
        //手机的功能按钮
        var toolbarButtonsXS = ['bold', 'italic', 'fontFamily', 'fontSize', 'undo', 'redo'];
        //var pid = $('#pid').val();
        //编辑器初始化并赋值
        $('#edit').on('froalaEditor.initialized', function (e, editor) {
            $('#edit').froalaEditor('html.set', '${article.article_content}');

        })
            .froalaEditor({
                placeholderText: '请输入内容', //默认填充内容
                charCounterCount: true,//默认 显示字数
                saveInterval: 0,//不自动保存，默认10000，0为不自动保存
                //theme                  : "dark",//主题：dark，red，gray，royal，注意需要引入对应主题的css
                height: "200px",
                width: "600px",
                toolbarBottom: false,//默认
                toolbarButtonsMD: toolbarButtonsMD,
                toolbarButtonsSM: toolbarButtonsSM,
                toolbarButtonsXS: toolbarButtonsXS,
                toolbarInline: false,//true选中设置样式,默认false
                imageUploadMethod: 'POST',
                heightMin: 400,
                charCounterMax: 14,  //最大字数限制，-1为不限制
                saveURL: '${ctx}/webmana/article/saveArticle',  //自动保存的地址（body参数为html内容）
                saveParams: {postId: '1'},  //保存内容时传的参数
                spellcheck: false,  //是否允许浏览器对输入内容进行拼写检查
                imageUploadURL: '${ctx}/webmana/attachment/uploadArticleImg',//上传到本地服务器
                //imageUploadParams: {pid: '1'}, //上传图片时带的参数
                ///imageDefaultWidth: 100, //上传图片后的默认大小
                //imageResizeWithPercent: true,//不设置这个，imageDefaultWidth的单位为像素，设置后为%
                videoUploadURL: '${ctx}/webmana/attachment/uploadArticleVideo',
                enter: $.FroalaEditor.ENTER_BR, //设置回车键功能
                language: 'zh_cn',
                // toolbarButtons: ['bold', 'italic', 'underline', 'paragraphFormat', 'align','color','fontSize','insertImage','insertTable','undo', 'redo']
            });
    });

    function saveArticle() {
        var html = $('#edit').froalaEditor('html.get', true); //返回富文本编辑里面的html代码
        $.ajax({
            type: 'POST',
            url: '',
            dataType: 'json',
            data: {
                "articleName": $("#articleName").val(),
                "body": html,
                "articleId": $("#articleId").val()
            },
            success: function (data) {
                if (data.success) {
                    layer.msg("保存成功", {icon: 1, time: 1500}, function () {
                        window.parent.location.reload();
                    });
                } else {
                    layer.msg("保存失败", {icon: 1, time: 1500}, function () {
                        window.parent.location.reload();
                    });
                }
            },
            error: function (data) {
                //console.log(data.msg);
            }
        });
    }
</script>
--%>
</body>
</html>
