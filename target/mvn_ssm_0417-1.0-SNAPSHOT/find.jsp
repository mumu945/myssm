<%--
  Created by IntelliJ IDEA.
  User: 木木
  Date: 2020/4/20
  Time: 19:37:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="css/find.css" rel="stylesheet"/>
    <script type="text/javascript">

    </script>
</head>
<body>
<div class="dv">
    <a href="${pageContext.request.contextPath}/list">返回</a>
    <table border="1">
        <caption><h2>用户基本信息</h2></caption>
        <tr>
            <td>编号</td>
            <td>用户名</td>
            <td>密码</td>
            <td>电话</td>
            <td>姓名</td>
            <td>余额</td>
            <td>权限</td>
        </tr>
        <tr>
            <td>${user.userId}</td>
            <td>${user.loginName}</td>
            <td>${user.loginPass}</td>
            <td>${user.phone}</td>
            <td>${user.realname}</td>
            <td>${user.amount}</td>
            <td>${user.admin}</td>
        </tr>
    </table>
</div>
</body>
</html>
