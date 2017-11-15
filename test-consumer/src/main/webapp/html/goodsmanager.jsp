<%--
  Created by IntelliJ IDEA.
  User: duan2ping
  Date: 2017/11/10
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>物品管理中心</title>
    <link rel="stylesheet" type="text/css" href="../css/main.css">
    <script type="application/javascript" src="../js/jquery.min.js"></script>
</head>
<body>
<div class="goods">
    <div class="main">
        <p class="title">
            <h1 align="center">物品管理中心</h1>
        </p>
        <a class="toIndex" href="${pageContext.request.contextPath}">回首页</a>
        <a class="add" href="${pageContext.request.contextPath}/html/goodsadd.jsp">添加物品</a>
        <table class="showList" border="1" cellspacing="0">
            <tr>
                <th>编号</th>
                <th>名称</th>
                <th>类型</th>
                <th>价格</th>
                <th>操作</th>
            </tr>
            <c:forEach var="goods" items="${glist}">
                <tr>
                    <td>${goods.id}</td>
                    <td>${goods.name}</td>
                    <td>${goods.type}</td>
                    <td>${goods.price}</td>
                    <td>
                        <a href="#">删除</a>
                    </td>
                </tr>
            </c:forEach>

        </table>
    </div>
</div>
</body>
</html>
