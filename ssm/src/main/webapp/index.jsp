<%--
  Created by IntelliJ IDEA.
  User: 53528
  Date: 2020/4/3
  Time: 0:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${list}" var="user">
    ${user.id}-${user.name}-${user.password}<br/>
</c:forEach>
</body>
</html>
