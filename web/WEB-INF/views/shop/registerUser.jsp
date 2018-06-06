<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">

    <title>注册账号</title>

    <!-- Bootstrap core CSS -->
    <link href="/resources/css/bootstrap-4.1.1/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/resources/css/dashboard.css" rel="stylesheet">
<!--    <link href="/resources/css/carousel.css" rel="stylesheet">-->
</head>

<body>
<jsp:include page="nav.jsp"></jsp:include>

<div class="container-fluid">
    <div class="row">


        <jsp:include page="shopLeftBar.jsp"></jsp:include>

        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">

            <jsp:include page="fastJump.jsp"></jsp:include>
            <hr/>
            <br/>


                <div class="row col-lg-6 offset-lg-3">
                    <div class="col-lg-12 ">
                        <h3 class="text-center">注册账号</h3>

                        <div class="needs-validation" id="registerShopForm"  novalidate>
                            <div class="mb-3">
                                <label for="username">输入账号:</label>
                                <input type="text" class="form-control" id="username" name="username" placeholder="请输入5~10位数字账号" required>
                                <span  class="help-block"></span>
                            </div>

                            <div class="mb-3">
                                <label for="password">输入密码:</label>
                                <input type="password"  class="form-control" id="password" name="password" placeholder="请输入5~20位数的密码" required></input>
                                <span  class="help-block"></span>
                            </div>

                            <div class="mb-3">
                                <label for="passwordCheck">校对密码:</label>
                                <input type="password"  class="form-control " id="passwordCheck" name="passwordCheck" placeholder="请输入5~20位数的密码" required></input>
                                <span  class="help-block"></span>
                            </div>

                            <div class="mb-3">
                                <label for="petname">输入昵称:</label>
                                <input type="text"  class="form-control" id="petname" name="petname" placeholder="请输入2~10位字符,只能出现数字或英文或汉字" required></input>
                                <span  class="help-block"></span>
                            </div>

                            <div class="mb-3">
                                <label for="email">输入邮箱:</label>
                                <input type="text"  class="form-control" id="email" name="email" placeholder="请输入您的邮箱" required></input>
                                <span  class="help-block"></span>
                            </div>

                            <div class="mb-3">
                                <label for="phone">手机号码:</label>
                                <input type="text" class="form-control" id="phone" name="phone" placeholder="请输入您的手机号码">
                                <span  class="help-block"></span>
                            </div>


                            <div class="mb-3">
                                <div class="form-group">
                                    <label  class="control-label">选择性别:</label>
                                    <div class="col-sm-10">
                                        <label class="radio-inline">
                                            <input type="radio" name="empGender" id="inlineRadio1" value="1" checked="checked"> 男
                                        </label>
                                        <label class="radio-inline">
                                            <input type="radio" name="empGender" id="inlineRadio2" value="0"> 女
                                        </label>
                                    </div>
                                </div>
                            </div>
                        </div>
                            <button class="btn btn-primary btn-lg btn-block "  id="submit_RegisterUser">提交注册申请</button>
                    </div>
                </div>


                <!-- FOOTER -->
                <footer class="container">
                    <p class="float-right"><a href="#">Back to top</a></p>
                    <p>© 2017-2018 Company, Inc. · <a href="#">Privacy</a> · <a href="https://getbootstrap.com/docs/4.1/examples/carousel/#">Terms</a></p>
                </footer>
        </main>
    </div>
</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="/resources/js/jquery.min.js"></script>
<!--user-defined-js-->
<script src="/resources/js/registerUser.js" charset="UTF-8"></script>

<script src="/resources/js/popper.min.js"></script>
<script src="/resources/css/bootstrap-4.1.1/dist/js/bootstrap.min.js"></script>
<script src="/resources/js/holder.min.js"></script>

<!-- Icons -->
<script src="/resources/js/feather.min.js"></script>
<script>
    feather.replace()
</script>

<!--;----- Graphs -----;-->
<script src="/resources/js/Chart.min.js"></script>




<svg xmlns="http://www.w3.org/2000/svg" width="500" height="500" viewBox="0 0 500 500" preserveAspectRatio="none"
     style="display: none; visibility: hidden; position: absolute; top: -100%; left: -100%;">
    <defs>
        <style type="text/css"></style>
    </defs>
    <text x="0" y="25" style="font-weight:bold;font-size:25pt;font-family:Arial, Helvetica, Open Sans, sans-serif">
        500x500
    </text>
</svg>
</body>
</html>
