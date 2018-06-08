<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="">

    <title>Dashboard Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="/resources/css/common/bootstrap-4.1.1/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/resources/css/common/dashboard.css" rel="stylesheet">
<!--    <link href="/resources/css/carousel.css" rel="stylesheet">-->
</head>

<body>
<jsp:include page="../common/nav.jsp"></jsp:include>

<div class="container-fluid">
    <div class="row">


        <jsp:include page="shopLeftBar.jsp"></jsp:include>

        <main role="main" class="col-md-auto ml-sm-auto col-lg-10 px-4">

            <jsp:include page="fastJump.jsp"></jsp:include>

                    <div class="col-md-auto order-md-1">
                        <div class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center">
                            <h3 >管理您的店铺</h3>
                            <p class="lead">您可以在下方的功能选择框里预览您可以执行的操作,然后根据需要选择操作.</p>
                        </div>

                        <div class="container">
                            <div class="card-deck mb-3 text-center">
                                <div class="card mb-4 box-shadow">
                                    <div class="card-header">
                                        <a type="button" class="btn btn-lg btn-block btn-primary" href="/register">注册店铺</a>

                                    </div>
                                    <div class="card-body">
                                        <p class="card-title pricing-card-title">注意事项</p>
                                        <ul class="list-unstyled mt-3 mb-4">
                                            <li>每个用户只能注册一个店铺;</li>
                                            <li>您可以同时拥有买家和卖家两种身份;</li>
                                            <li>注册需要等待约3个工作日的审核时间;</li>
                                            <li>注册成功后请仔细阅读店铺运营规范;</li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="card mb-4 box-shadow">
                                    <div class="card-header">
                                        <a type="button" class="btn btn-lg btn-block btn-primary" href="/editShop">编辑店铺</a>
                                    </div>
                                    <div class="card-body">
                                        <p class="card-title pricing-card-title">注意事项</p>
                                        <ul class="list-unstyled mt-3 mb-4">
                                            <li>需要您已经拥有了一个已通过审核的店铺;</li>
                                            <li>您可以再次修改店铺的所有信息;</li>
                                            <li>您每个月只有一次修改机会;</li>
                                            <li>请等待约3个工作日的审核时间;</li>
                                        </ul>

                                    </div>
                                </div>
                                <div class="card mb-4 box-shadow">
                                    <div class="card-header">
                                        <a type="button" class="btn btn-lg btn-block btn-outline-primary" href="/see">查看店铺</a>

                                    </div>
                                    <div class="card-body">
                                        <p class="card-title pricing-card-title">功能说明</p>
                                        <ul class="list-unstyled mt-3 mb-4">
                                            <li>您可以通过顾客视角来浏览您的店铺;</li>
                                            <li>进入顾客视角后您无法执行购买和收藏操作;</li>
                                            <li>客制化店铺主页的功能在以后会上线;</li>
                                            <li>如果您有好的建议请联系我们;</li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
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
<script src="/resources/js/common/jquery.min.js"></script>
<!--user-defined-js-->

<script src="/resources/js/common/popper.min.js"></script>
<script src="/resources/css/common/bootstrap-4.1.1/dist/js/bootstrap.min.js"></script>
<script src="/resources/js/common/holder.min.js"></script>

<!-- Icons -->
<script src="/resources/js/common/feather.min.js"></script>
<script>
    feather.replace()
</script>

<!--;----- Graphs -----;-->
<script src="/resources/js/common/Chart.min.js"></script>




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
