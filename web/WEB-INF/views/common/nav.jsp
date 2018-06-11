
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body onload='init()'>

<nav class="navbar navbar-expand-lg navbar-dark fixed-top bg-dark">
    <a class="navbar-brand" href="/index">LOGO 'ᴗ' </a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse"
            aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarCollapse">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="/index">网站首页 </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/shopManagement">卖家板块 </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/admin/shopManagement">管理员板块 </a>
            </li>

            <form class="form-inline mt-2 mt-md-0">
                <input class="form-control mr-sm-2" type="text" placeholder="搜索店铺或商品" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">搜一搜</button>
            </form>
        </ul>

        <%--登录及个人信息区域,在js里通过session判断来切换显示信息--%>
        <ul class="float-right navbar-nav">
            <li  class="nav-item">
                <div class="row">
                    <img id="userHeadImg" class="rounded-circle figure-img" src=".\resources\images\testhead.jpg" alt="头像"/>
                    <a id="login" href="/login" class="nav-link" >登录</a>
                    <a id="register" href="/register/registerUser" class="nav-link" >注册</a>
                    <a id="center" href="/personInfo" class="nav-link" ></a>
                    <a id="exit"href="/logout" class="nav-link">安全退出</a>
                </div>
            </li>
        </ul>
    </div>
</nav>
<script type="text/javascript" >
    function init(){
        var user = "<%=session.getAttribute("user")%>";
        var userName = "<%=session.getAttribute("userName")%>";
        var headImg = "<%=session.getAttribute("headImg")%>";

        if(user=="null"){

            var exit = document.getElementById("exit");
            var userHeadImg = document.getElementById("userHeadImg");
            var center=document.getElementById("center");
            center.style.display='none';
            exit.style.display='none';
            userHeadImg.style.display='none';
        }else{
            var register=document.getElementById("register");
            var login=document.getElementById("login");
            $("#center").text(userName);
            //$("#userHeadImg").attr("src",headImg);//头像测试时由于数据库中没数据所以不开启;
            register.style.display='none';
            login.style.display='none';
        }
    }

</script>

</body>
</html>
