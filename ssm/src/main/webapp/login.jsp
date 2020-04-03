<%--
  Created by IntelliJ IDEA.
  User: 53528
  Date: 2020/4/3
  Time: 12:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/user/login" method="post">
    <p>登录账户：<input name="name"  placeholder="账户" required="required" ></p>
    <p>账户密码：<input name="password"  type="password" placeholder="输入密码" required="required" ></p>
    <input type="submit"  value="立即登录">
</form>

</body>
</html>
