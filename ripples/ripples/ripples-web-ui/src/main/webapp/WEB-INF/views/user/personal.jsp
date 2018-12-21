<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/18
  Time: 17:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>涟漪</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta content="width=device-width, initial-scale=1" name="viewport" />
    <meta content="Preview page of Metronic Admin Theme #3 for user inbox" name="description" />
    <meta content="" name="author" />
    <link href="/static/assets/pages/css/profile.min.css" rel="stylesheet" type="text/css">
    <link href="/static/assets/apps/css/style.css" rel="stylesheet" type="text/css">
   <jsp:include page="../include/head.jsp" />
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
                                    <a href="/personal">朋友圈</a>
                                </li>
                            </ul>
                            <!-- END PAGE BREADCRUMBS -->
                            <!-- BEGIN PAGE CONTENT INNER -->
                            <div class="page-content-inner">
                                <div class="inbox">
                                    <div class="row">
                                        <jsp:include page="../include/menu.jsp"/>
                                        <div class="col-md-9">
                                            <!--发布框-->
                                            <div class="row" id="edit_form" style="margin:15px 0px 15px 0px">
                                                <span class="pull-left" style="margin:15px;">荡起你的涟漪</span>
                                                <span class="tips pull-right" style="margin:15px;"></span>
                                                <!--Begin Form-->
                                                <form role="form" style="margin-top: 50px;">
                                                    <div class="form-group">
                                                        <div class="col-sm-12">
                                                            <div contentEditable="true" id="content" class="form-control " style="width: 100%"></div>
                                                        </div>
                                                        <div class="col-sm-12" style="margin-top: 12px;">
                                                            <span class="emoji">表情</span>
                                                            <span class="pic">图片	</span>
                                                            <span>
									                            <input type="file" name="" class="select_Img" style="display: none">
									                            <img class="preview" src="">
								                            </span>
                                                            <div class="myEmoji">
                                                                <ul  class="nav nav-tabs">
                                                                    <li class="active">
                                                                        <a href="#set" data-toggle="tab">
                                                                            预设
                                                                        </a>
                                                                    </li>
                                                                    <li><a href="#hot" data-toggle="tab">热门</a></li>
                                                                </ul>
                                                                <div  class="tab-content">
                                                                    <div class="tab-pane fade in active" id="set">
                                                                        <div class="emoji_1"></div>
                                                                    </div>
                                                                    <div class="tab-pane fade" id="hot">
                                                                        <div class="emoji_2"></div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <!-- <span> <input type="file" id="selectImg" value=""></input> </span> -->
                                                            <button type="button" id="send" class="btn btn-default pull-right disabled">发布</button>
                                                        </div>
                                                    </div>
                                                </form>
                                                <!--End Form-->
                                            </div>
                                            <!--发布框 END-->
                                            <%--动态 1--%>
                                            <div class="lmlblog-posts-list words" style="background-image:url(/static/assets/apps/test/images/058.png); " data="4197">

                                                <!-- 动态内容部分，包括列表 -->
                                                <div class="lmlblog-post-user-info">
                                                    <div class="lmlblog-post-user-info-avatar" user-data="1">
                                                        <a href="#1" style="display: inline-block;">
                                                            <span class="lmlblog-vip-icon"></span><img src="../static/assets/apps/test/images/tx2.jpg" class="avatar"><i class="lmlblog-verify lmlblog-verify-a" title="司空琪"></i></a>
                                                        <div class="lmlblog-user-info-card" style="display: none;">
                                                            <div class="info_card_loading"><img src="../static/assets/apps/test/picture/chat-loading.gif"><p>资料加载中...</p>
                                                            </div>
                                                        </div>
                                                    </div>

                                                    <div class="lmlblog-post-user-info-name">
                                                        <a href="#1">
                                                            <font style="color:#333;font-weight:600">司空琪</font>
                                                        </a>
                                                        <span class="lmlblog-mark lmlblog-lv" title="经验：3815">Lv.6</span><span class="lmlblog-mark lmlblog-vip">VIP 6</span>
                                                    </div>
                                                    <div class="lmlblog-post-user-info-time" title="2017-12-14 05:25">12-14 05:25</div>
                                                </div><!-- 作者信息 -->
                                                <div class="lmlblog-post-setting">
                                                    <i class="fa fa-angle-down"></i>
                                                    <div class="lmlblog-post-setting-box">
                                                        <ul>
                                                            <a href="#" title="查看全文"><li>查看全文</li></a>
                                                            <a href="#1" title="访问主页"><li>访问主页</li></a>
                                                        </ul>
                                                    </div>
                                                </div>
                                                <div class="lmlblog-post-content ">
                                                    <a class="post_list_link" href="#">
                                                        <p>　　疏星淡月，紫陌曲岸，持觞游赏，神移长川。一片彀纹，溶溶泄泄，忽而烟靡云敛。睹一丽人，缦立青水，云蒸雾霭，花衬善睐。荧荧兮若北辰之荣现，扰扰兮若紫玉之生烟。颜如舜华，迫闻素腰华琚摇;和颜静志，远望渌水呈雾绡。戏流光之夜蝶，采舞雪之琼花，流眷眷之眸光，润荣曜之笑靥。</p>
                                                        <p>　　偶得美人回顾，思之朝朝暮暮。采芝兰以明愫，寄琼琚以作妆。余咏永慕叹道长，彼应影独愿偕芳。才知世有解语，不过琪语溯光。<img src="../static/assets/apps/test/images/66.png" alt="[s-65]" class="wp-smiley">
                                                            <img src="../static/assets/apps/test/images/8.png" alt="[s-65]" class="wp-smiley"></p></a>
                                                </div>
                                                <div class="lmlblog-post-images-list clear">
                                                    <a href="../static/assets/apps/test/images/qi01.jpg" data-fancybox="gallery" data-caption="<i class=&quot;fa fa-copyright&quot;></i> lmlblog">
                                                        <img src="../static/assets/apps/test/images/qi01.jpg" alt="司空琪吧十一月壁纸"></a>
                                                    <a href="../static/assets/apps/test/images/qi02.jpg" data-fancybox="gallery" data-caption="<i class=&quot;fa fa-copyright&quot;></i> lmlblog">
                                                        <img src="../static/assets/apps/test/images/qi02.jpg" alt="司空琪吧十一月壁纸"></a>
                                                    <a href="../static/assets/apps/test/images/qi03.jpg" data-fancybox="gallery" data-caption="<i class=&quot;fa fa-copyright&quot;></i> lmlblog">
                                                        <img src="../static/assets/apps/test/images/qi03.jpg" alt="司空琪吧十一月壁纸"></a>
                                                    <a href="../static/assets/apps/test/images/qi03.jpg" data-fancybox="gallery" data-caption="<i class=&quot;fa fa-copyright&quot;></i> lmlblog">
                                                        <img src="../static/assets/apps/test/images/qi03.jpg" alt="司空琪吧十一月壁纸"></a>
                                                    <a href="../static/assets/apps/test/images/qi03.jpg" data-fancybox="gallery" data-caption="<i class=&quot;fa fa-copyright&quot;></i> lmlblog">
                                                        <img src="../static/assets/apps/test/images/qi03.jpg" alt="司空琪吧十一月壁纸"></a>
                                                </div>
                                                <div class="lmlblog-post-bar">
                                                    <li onclick=";">
                                                        <i class="icon-like"></i>点赞 <span>6524</span>
                                                    </li>
                                                    <li onclick=";" data-toggle="modal" href="#long">
                                                        <i class="icon-share " ></i>转发 <span>6524</span>
                                                    </li>
                                                    <li onclick="showComments('showComments1')">
                                                        <i class="icon-speech"></i>评论 <span>6524</span>
                                                    </li>
                                                    <li onclick=";">
                                                        <i class="icon-star"></i>收藏 <span>6524</span>
                                                    </li>

                                                    <li class="tag clear">
                                                        <i class="lmlblog-icon"></i><a href="#2" title="司空琪壁纸"># 司空琪壁纸</a></li>
                                                </div>
                                                <!--转发模态框-->
                                                <div id="long" class="modal fade modal-scroll" tabindex="-1" data-replace="true">
                                                    <div class="modal-dialog">
                                                        <div class="modal-content">
                                                            <div class="modal-header">
                                                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                                                                <h4 class="modal-title">转发这条微博</h4>
                                                            </div>
                                                            <div class="modal-body">
                                                                <!--发布框-->
                                                                <div class="row" id="forwardForm" style="margin:15px 0px 15px 0px">
                                                                    <span class="pull-left" style="margin:15px;"><h4 class="modal-title">说点什么</h4></span>
                                                                    <!--Begin Form-->
                                                                    <form role="form" style="margin-top: 50px;">
                                                                        <div class="form-group">
                                                                            <div class="col-sm-12">
                                                                                <div contentEditable="true" id="forwardContent" class="form-control " style="width: 100%"></div>
                                                                            </div>
                                                                            <div class="col-sm-12" style="margin-top: 12px;">
                                                                                <span class="emoji">表情</span>
                                                                                <span class="pic">图片	</span>
                                                                                <span>
                                                                                    <input type="file" name="" class="select_Img" style="display: none">
                                                                                    <img class="preview" src="">
                                                                                </span>
                                                                                <div class="myEmoji">
                                                                                    <ul id="myTab" class="nav nav-tabs">
                                                                                        <li class="active">
                                                                                            <a href="#forwardSet" data-toggle="tab">
                                                                                                预设
                                                                                            </a>
                                                                                        </li>
                                                                                        <li><a href="#forwardHot" data-toggle="tab">热门</a></li>
                                                                                    </ul>
                                                                                    <div id="myTabContent" class="tab-content">
                                                                                        <div class="tab-pane fade in active" id="forwardSet">
                                                                                            <div class="emoji_1"></div>
                                                                                        </div>
                                                                                        <div class="tab-pane fade" id="forwardHot">
                                                                                            <div class="emoji_2"></div>
                                                                                        </div>
                                                                                    </div>
                                                                                </div>
                                                                                <!-- <span> <input type="file" id="selectImg" value=""></input> </span> -->
                                                                                <button type="button" id="forwardSend" class="btn btn-default pull-right disabled">转发</button>
                                                                            </div>
                                                                        </div>
                                                                    </form>
                                                                    <!--End Form-->
                                                                </div>
                                                                <!--发布框 END-->
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <!--转发模态框 END-->
                                                <!-- 评论模块 -->
                                                <div class="page-content-inner" id="showComments1" style="display: none">
                                                    <div class="blog-page blog-content-2">
                                                        <div class="row">
                                                            <div class="col-lg-12">
                                                                <div class="blog-single-content bordered blog-container">
                                                                    <!---->
                                                                    <div class="blog-comments">
                                                                        <h3 class="sbold blog-comments-title">评论(30)</h3>
                                                                        <form action="#">
                                                                            <div class="form-group">
                                                                                <textarea rows="6" cols="12" name="message" placeholder="留下评论 ..." class="form-control c-square" style="width: 100%"></textarea>
                                                                            </div>
                                                                            <div class="form-group">
                                                                                <button type="submit" class="btn blue uppercase btn-md sbold btn-block">评论</button>
                                                                            </div>
                                                                        </form>
                                                                        <div class="c-comment-list">
                                                                            <div class="media">
                                                                                <div class="media-left">
                                                                                    <a href="#">
                                                                                        <img class="media-object" alt="" src="/static/assets/pages/img/avatars/team1.jpg"> </a>
                                                                                </div>
                                                                                <div class="media-body">
                                                                                    <h4 class="media-heading">
                                                                                        <a href="#">Sean</a> on
                                                                                        <span class="c-date">23 May 2015, 10:40AM</span>
                                                                                    </h4> Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. </div>
                                                                            </div>
                                                                            <div class="media">
                                                                                <div class="media-left">
                                                                                    <a href="#">
                                                                                        <img class="media-object" alt="" src="/static/assets/pages/img/avatars/team3.jpg"> </a>
                                                                                </div>
                                                                                <div class="media-body">
                                                                                    <h4 class="media-heading">
                                                                                        <a href="#">Strong Strong</a> on
                                                                                        <span class="c-date">21 May 2015, 11:40AM</span>
                                                                                    </h4> Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis.
                                                                                    <div class="media">
                                                                                        <div class="media-left">
                                                                                            <a href="#">
                                                                                                <img class="media-object" alt="" src="/static/assets/pages/img/avatars/team4.jpg"> </a>
                                                                                        </div>
                                                                                        <div class="media-body">
                                                                                            <h4 class="media-heading">
                                                                                                <a href="#">Emma Stone</a> on
                                                                                                <span class="c-date">30 May 2015, 9:40PM</span>
                                                                                            </h4> Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. </div>
                                                                                    </div>
                                                                                </div>
                                                                            </div>
                                                                            <div class="media">
                                                                                <div class="media-left">
                                                                                    <a href="#">
                                                                                        <img class="media-object" alt="" src="/static/assets/pages/img/avatars/team7.jpg"> </a>
                                                                                </div>
                                                                                <div class="media-body">
                                                                                    <h4 class="media-heading">
                                                                                        <a href="#">Nick Nilson</a> on
                                                                                        <span class="c-date">30 May 2015, 9:40PM</span>
                                                                                    </h4> Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. </div>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                    <!---->
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <!--评论模块 END-->
                                                <div class="lmlblog-post-like-list">
                                                    <a href="#17" id="had_like_11788">
                                                        <img src="../static/assets/apps/test/picture/11.gif" class="avatar"></a>
                                                    <a href="#18" id="had_like_11499"><img src="../static/assets/apps/test/picture/12.gif" class="avatar"></a>
                                                    <a href="#22" id="had_like_11488"><img src="../static/assets/apps/test/picture/20.png" class="avatar">
                                                        <i class="lmlblog-verify lmlblog-verify-a" title="认证信息：作者许仙白"></i></a><a href="#22" id="had_like_11477">
                                                    <img src="../static/assets/apps/test/picture/13.gif" class="avatar">
                                                    <i class="lmlblog-verify lmlblog-verify-a" title="认证信息：168号计师"></i></a><a href="#22" >
                                                    <img src="../static/assets/apps/test/images/tx2.jpg" class="avatar">
                                                    <i class="lmlblog-verify lmlblog-verify-a" title="司空琪"></i></a></div>
                                                <div class="lmlblog-post-footer-bar">
                                                    <span title="2017-12-14 05:25:48">12月14日 05:25</span>
                                                    <span>电脑端</span><i class="lmlblog-icon" onclick="lmlblog_post_type_open();"></i></div>

                                            </div>
                                            <%--动态 1END--%>
                                            <%--动态 2--%>
                                            <div class="lmlblog-posts-list words" style="background-image:url(/static/assets/apps/test/images/058.png); " data="4093">

                                                <!-- 动态内容部分，包括列表 -->
                                                <div class="lmlblog-post-user-info">
                                                    <div class="lmlblog-post-user-info-avatar" user-data="1">
                                                        <a href="#1" style="display: inline-block;">
                                                            <span class="lmlblog-vip-icon"></span><img src="../static/assets/apps/test/images/tx2.jpg" class="avatar"><i class="lmlblog-verify lmlblog-verify-a" title="司空琪"></i></a>
                                                        <div class="lmlblog-user-info-card" style="display: none;">
                                                            <div class="info_card_loading"><img src="../static/assets/apps/test/picture/chat-loading.gif"><p>资料加载中...</p>
                                                            </div>
                                                        </div>
                                                    </div>

                                                    <div class="lmlblog-post-user-info-name">
                                                        <a href="#1">
                                                            <font style="color:#333;font-weight:600">司空琪</font>
                                                        </a>

                                                        <span class="lmlblog-mark lmlblog-lv" title="经验：3815">Lv.6</span><span class="lmlblog-mark lmlblog-vip">VIP 6</span></div>

                                                    <div class="lmlblog-post-user-info-time" title="2017-12-01 07:17">12-01 07:17</div>

                                                </div><!-- 作者信息 -->

                                                <div class="lmlblog-post-setting">
                                                    <i class="fa fa-angle-down"></i>
                                                    <div class="lmlblog-post-setting-box">
                                                        <ul>
                                                            <a href="#4093.html" title="查看全文"><li>查看全文</li></a>
                                                            <a href="#1" title="访问主页"><li>访问主页</li></a>
                                                        </ul>
                                                    </div>
                                                </div>
                                                <h1><a href="http://www.lmlblog.com/blog/sikongqi/2.html" title="查看全文">司空琪同人曲《一剑倾城》</a></h1>

                                                <div class="lmlblog-post-content ">

                                                    <a class="post_list_link" href="http://www.lmlblog.com/blog/sikongqi/2.html">
                                                        <p>烈风起新秀 挥剑 尘拂袖。塞北白芒中，一袭紫衣踏雪而来。你为父寻医不畏龙潭虎穴，挥剑斩兵勇，一掷退澹台。<br>
                                                            宗家磨砺了你的坚韧，却没有磨平你的卓然风华。一剑一刃，打斗间潇洒自如，宛若惊鸿仙子。</p>
                                                    </a>
                                                    <p style="TEXT-ALIGN: center">
                                                        <iframe class="video_iframe" style="Z-INDEX: 1" height="360" src="http://v.qq.com/iframe/player.html?vid=i0560e7ceal&amp;width=500&amp;height=360&amp;auto=0" frameborder="0" width="500" allowfullscreen="allowfullscreen">
                                                        </iframe></p>
                                                </div>
                                                <div class="lmlblog-post-bar">
                                                    <li onclick=";">
                                                        <i class="icon-like"></i>点赞<span>6524</span>
                                                    </li>
                                                    <li onclick=";">
                                                        <i class="icon-share"></i>转发<span>6524</span>
                                                    </li>
                                                    <li onclick="showComments('showComments2');">
                                                        <i class="icon-speech"></i>评论<span>6524</span>
                                                    </li>
                                                    <li onclick=";">
                                                        <i class="icon-star"></i>收藏<span>6524</span>
                                                    </li>
                                                </div>
                                                <!-- 评论模块 -->
                                                <div class="page-content-inner" id="showComments2" style="display: none">
                                                    <div class="blog-page blog-content-2">
                                                        <div class="row">
                                                            <div class="col-lg-12">
                                                                <div class="blog-single-content bordered blog-container">
                                                                    <!---->
                                                                    <div class="blog-comments">
                                                                        <h3 class="sbold blog-comments-title">评论(30)</h3>
                                                                        <form action="#">
                                                                            <div class="form-group">
                                                                                <textarea rows="6" cols="12" name="message" placeholder="留下评论 ..." class="form-control c-square" style="width: 100%"></textarea>
                                                                            </div>
                                                                            <div class="form-group">
                                                                                <button type="submit" class="btn blue uppercase btn-md sbold btn-block">评论</button>
                                                                            </div>
                                                                        </form>
                                                                        <div class="c-comment-list">
                                                                            <div class="media">
                                                                                <div class="media-left">
                                                                                    <a href="#">
                                                                                        <img class="media-object" alt="" src="/static/assets/pages/img/avatars/team1.jpg"> </a>
                                                                                </div>
                                                                                <div class="media-body">
                                                                                    <h4 class="media-heading">
                                                                                        <a href="#">Sean</a> on
                                                                                        <span class="c-date">23 May 2015, 10:40AM</span>
                                                                                    </h4> Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. </div>
                                                                            </div>
                                                                            <div class="media">
                                                                                <div class="media-left">
                                                                                    <a href="#">
                                                                                        <img class="media-object" alt="" src="/static/assets/pages/img/avatars/team3.jpg"> </a>
                                                                                </div>
                                                                                <div class="media-body">
                                                                                    <h4 class="media-heading">
                                                                                        <a href="#">Strong Strong</a> on
                                                                                        <span class="c-date">21 May 2015, 11:40AM</span>
                                                                                    </h4> Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis.
                                                                                    <div class="media">
                                                                                        <div class="media-left">
                                                                                            <a href="#">
                                                                                                <img class="media-object" alt="" src="/static/assets/pages/img/avatars/team4.jpg"> </a>
                                                                                        </div>
                                                                                        <div class="media-body">
                                                                                            <h4 class="media-heading">
                                                                                                <a href="#">Emma Stone</a> on
                                                                                                <span class="c-date">30 May 2015, 9:40PM</span>
                                                                                            </h4> Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. </div>
                                                                                    </div>
                                                                                </div>
                                                                            </div>
                                                                            <div class="media">
                                                                                <div class="media-left">
                                                                                    <a href="#">
                                                                                        <img class="media-object" alt="" src="/static/assets/pages/img/avatars/team7.jpg"> </a>
                                                                                </div>
                                                                                <div class="media-body">
                                                                                    <h4 class="media-heading">
                                                                                        <a href="#">Nick Nilson</a> on
                                                                                        <span class="c-date">30 May 2015, 9:40PM</span>
                                                                                    </h4> Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. </div>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                    <!---->
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <!--评论模块 END-->
                                                <div class="lmlblog-post-like-list">
                                                    <a href="#1463" id="had_like_11463"><img src="../static/assets/apps/test/picture/19.jpg" class="avatar"></a><a href="#1555" id="had_like_11555">
                                                    <img src="../static/assets/apps/test/picture/18.jpg" class="avatar"></a><a href="#1479" id="had_like_11479">
                                                    <img src="../static/assets/apps/test/picture/13.gif" class="avatar"></a><a href="#1" id="had_like_1"><img src="../static/assets/apps/test/images/tx2.jpg" class="avatar">
                                                    <i class="lmlblog-verify lmlblog-verify-a" title="司空琪"></i></a>
                                                </div>
                                                <div class="lmlblog-post-footer-bar">
                                                    <span title="2017-12-01 07:17:50">12月01日 07:17</span>
                                                    <span>电脑端</span><i class="lmlblog-icon" onclick="lmlblog_post_type_open();"></i></div>
                                            </div>
                                            <%--动态 2END--%>
                                        </div>

                                    </div>
                                </div>
                            </div>
                            <!-- END PAGE CONTENT INNER -->
                        </div>
                    </div>
                    <!-- END PAGE CONTENT BODY -->
                    <!-- END CONTENT BODY -->
                </div>
                <!-- END CONTENT -->
            </div>
            <!-- END CONTAINER -->
        </div>
    </div>
    <!---->
<jsp:include page="../include/foot.jsp"/>
<script type="text/javascript">
    //评论框展开收起
    var showComments=function (commentsId) {
        //展开评论框
        if($("#"+commentsId).css("display")=="none"){
            $("#"+commentsId).css("display","block");
        }
        //收起评论框
        else {
            $("#"+commentsId).css("display","none");
        }
    }

    //初始化动态发布框
    myEditor.initMyEditor("edit_form","content","send");
</script>
</body>
</html>
