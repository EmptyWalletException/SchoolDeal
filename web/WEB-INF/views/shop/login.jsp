<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="">

    <title>登录</title>

    <!-- Bootstrap core CSS -->
    <link href="/resources/css/bootstrap-4.1.1/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/resources/css/dashboard.css" rel="stylesheet">
<!--    <link href="/resources/css/carousel.css" rel="stylesheet">-->
</head>

<body class="text-center">
<form class="form-signin col-sm-2 offset-5" action="/loginform" method="post">
    <img class="mb-4" src="" alt="" width="72" height="72">
    <h1 class="h3 mb-3 font-weight-normal">请先登录</h1>
    <label for="inputText" class="sr-only">账号</label>
    <input type="text" id="inputText" class="form-control" placeholder="请输入账号" name="username" value="admin" required autofocus>
    <label for="inputPassword" class="sr-only">密码</label>
    <input type="password" id="inputPassword" class="form-control" placeholder="请输入密码" name="password" value="admin" required>
    <%--<div class="checkbox mb-3">
        <label>
            <input type="checkbox" value="remember-me"> Remember me
        </label>
    </div>--%>
    <button class="btn btn-lg btn-primary btn-block " type="submit">登录</button>
    <p class="mt-5 mb-3 text-muted">&copy; 2018-2019</p>
</form>
</body>
</html>
