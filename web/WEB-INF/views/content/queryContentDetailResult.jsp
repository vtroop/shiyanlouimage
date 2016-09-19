<%--
  Created by IntelliJ IDEA.
  User: Evilina
  Date: 2016/9/12
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.gen.entity.Content" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Title</title>

    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="/css/bootstrap.min.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
    <div class="container">
        <h1>content查询结果</h1>

        <!-- 如果用户列表非空 -->
        <c:if test="${empty detail}">
            <div class="alert alert-warning" role="alert">
                <span class="glyphicon glyphicon-info-sign" aria-hidden="true"></span>User表为空，请<a href="/admin/users/add" type="button" class="btn btn-primary btn-sm">添加</a>
            </div>
        </c:if>

        <c:if test="${!empty detail}">
            <h1 class="h1">${detail.contentId}</h1>
            <br>
            body_raw:${detail.bodyRaw}
            <br>
            bodyFixed:${detail.bodyFixed}
            <br>
            time:${detail.updateTime}
            <br>
            image:${detail.imageNumber}

        </c:if>
    </div>
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="/js/jquery.min.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="/js/bootstrap.min.js"></script>
</body>
</html>
