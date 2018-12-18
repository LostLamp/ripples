<%--
  Created by IntelliJ IDEA.
  User: qf
  Date: 2018/12/18
  Time: 19:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
</head>
<body>
    <form action="/login" method="post">
        用户名： <input type="text" name="loginId"/></br>
        密码 ：<input type="text" name="password" /></br>
        <input type="submit" value="提交"/>
    </form>

</body>
</html>
