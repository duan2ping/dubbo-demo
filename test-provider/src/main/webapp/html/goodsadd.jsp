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
    <title>添加物品</title>
    <link rel="stylesheet" type="text/css" href="../css/main.css">
</head>
<body>
<div class="addGoods">
    <spring:form  method="post" action="${pageContext.request.contextPath}/goods/add">
        <p><h2 align="center">添加物品</h2></p>
        <table>
            <tr>
                <th>物品名称：</th>
                <td><input type="text" name="name" placeholder="请输入物品名称"/></td>
            </tr>
            <tr>
                <th>物品类型：</th>
                <td><input type="text" name="type" placeholder="请输入物品类型"/></td>
            </tr>
            <tr>
                <th>物品价格：</th>
                <td><input type="text" name="price" placeholder="请输入物品价格"/></td>
            </tr>
            <tr>
                <th colspan="2"><input type="submit" value="添加"/> </th>
            </tr>
        </table>
    </spring:form>
</div>
</body>
</html>
