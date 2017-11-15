<%--
  Created by IntelliJ IDEA.
  User: duan2ping
  Date: 2017/11/10
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>首页</title>
  <link rel="stylesheet" type="text/css" href="css/main.css">
</head>
<body>
<div class="index">
  <div class="main">
    <p class="title">
    <h1 align="center">说明</h1>
    <h2 align="center">该类是物品服务的提供者，用户服务的消费者</h2>
    <hr/>
    <dl>
      <dt><h2>本服务</h2></dt>
      <dd><h3><a href="goods/query">物品管理中心</a></h3></dd>
      <dd><h3><a href="html/goodsadd.jsp">添加物品</a></h3></dd>
    </dl>
    <dl>
      <dt><h2>dubbo消费服务</h2></dt>
      <dd><h3><a href="user/query">点击进入用户管理中心</a></h3></dd>
      <dd><h3><a href="html/useradd.jsp">添加用户</a></h3></dd>
    </dl>
    </p>
  </div>
</div>
</body>
</html>
