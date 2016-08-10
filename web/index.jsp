<%--
  Created by IntelliJ IDEA.
  User: Evilina
  Date: 2016/7/29
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
  <title>$Title$</title>

  <!-- Bootstrap -->
  <link href="css/bootstrap.min.css" rel="stylesheet">

  <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
  <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
  <![endif]-->
  </head>
  <body>

  <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
  <script src="js/jquery.min.js"></script>
  <!-- Include all compiled plugins (below), or include individual files as needed -->
  <script src="js/bootstrap.min.js"></script>
  $END$

  <form action="/test/testModelAttributes" method="post">
      <input type="hidden" name="id" value="1">
    username: <input type="text" name="username" value="http">
    password: <input type="password" name="password" value="">
    <input type="submit" value="submit">
  </form>

  <form action="test/testPOJO">
    username: <input type="text" name="username">
    password: <input type="password" name="password">
    <input type="submit" value="submit">
  </form>
  <a href="hello">hello world</a>

  <br>

  <form action="/test/hello_post" method="post">
    <input type="submit" value="submit">
  </form>
  </body>
</html>
