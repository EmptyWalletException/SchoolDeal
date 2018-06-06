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

    <style type="text/css">
        /*下面两个css用于控制登录表单显示在页面正中间*/
        html, body {
            height: 100%;
        }
        body{
            display: flex;
        }
    </style>
</head>


<body class="text-center" >
<form class="form-signin" id="form-signin" action="/loginform" method="POST">
    <img class="mb-4" src="" alt="" width="72" height="72">
    <h1 class="h3 mb-3 font-weight-normal">请先登录再执行操作</h1>
    <label  style="color: red" id="msg">${sessionScope.SPRING_SECURITY_LAST_EXCEPTION.message }</label>
    <label for="inputUserName" class="sr-only">账号</label>
    <input type="text" id="inputUserName" class="form-control" name="username" placeholder="请出入账号" required autofocus>
    <label for="inputPassword" class="sr-only">密码</label>
    <input type="password" id="inputPassword" class="form-control" name="password" placeholder="请输入密码" required>
    <div class="checkbox mb-3">
        <label>
            <input type="checkbox" name="remember-me" checked="checked"/> 记住我
        </label>
        <br/>
        <label>
            <a href="/registerUser">还没有账号?来注册一个吧!</a>
        </label>
    </div>
    <a class="btn btn-lg btn-primary btn-block " id="btn_login" >登录</a>
    <p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
</form>

<script src="/resources/js/jquery.min.js"></script>
<script src="/resources/js/popper.min.js"></script>
<script src="/resources/js/login.js"></script>
<script src="/resources/css/bootstrap-4.1.1/dist/js/bootstrap.min.js"></script>
<script src="/resources/js/holder.min.js"></script>

<!-- Icons -->
<script src="/resources/js/feather.min.js"></script>
</body>
</html>
