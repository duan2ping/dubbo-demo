<%--
  Created by IntelliJ IDEA.
  User: duan2ping
  Date: 2017/11/10
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>添加用户</title>
    <link rel="stylesheet" type="text/css" href="../css/main.css">
</head>
<body>
    <div class="addUser">
        <spring:form  method="post" action="${pageContext.request.contextPath}/user/add">
        <p><h2 align="center">添加用户</h2></p>
        <table>
            <tr>
                <th>用户名：</th>
                <td><input type="text" name="name" placeholder="请输入用户名"/></td>
            </tr>
            <tr>
                <th>年龄：</th>
                <td><input type="text" name="age" placeholder="请输入年龄"/></td>
            </tr>
            <tr>
                <th>住址：</th>
                <td><input type="text" name="address" placeholder="请输入住址"/></td>
            </tr>
            <tr>
                <th colspan="2"><input type="submit" value="添加"/> </th>
            </tr>
        </table>
        </spring:form>
    </div>
</body>
</html>
