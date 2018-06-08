<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="">

    <title>首页</title>

    <!-- Bootstrap core CSS -->
    <link href="/resources/css/common/bootstrap-4.1.1/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/resources/css/common/dashboard.css" rel="stylesheet">
<!--    <link href="/resources/css/carousel.css" rel="stylesheet">-->
</head>

<body>
<jsp:include page="nav.jsp"></jsp:include>

<div class="container-fluid">
    <div class="row">


       <%-- <jsp:include page="shopLeftBar.jsp"></jsp:include>--%>

        <main role="main" class="col-md-12">


                <%--轮播区域--%>
                <div id="myCarousel" class="carousel slide col-md-10 offset-md-1" data-ride="carousel">
                    <ol class="carousel-indicators">
                        <li data-target="#myCarousel" data-slide-to="0" class=""></li>
                        <li data-target="#myCarousel" data-slide-to="1" class="active"></li>
                        <li data-target="#myCarousel" data-slide-to="2" class=""></li>
                    </ol>
                    <div class="carousel-inner">
                        <div class="carousel-item">
                            <img class="first-slide" src="/resources/images/1.jpg" alt="First slide">
                            <div class="container">
                               <%-- <div class="carousel-caption text-left">
                                    <h1>Example headline.</h1>
                                    <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                                    <p><a class="btn btn-lg btn-primary" href="#" role="button">Sign up today</a></p>
                                </div>--%>
                            </div>
                        </div>
                        <div class="carousel-item active">
                            <img class="second-slide" src="/resources/images/2.jpg" alt="Second slide">
                            <div class="container">

                            </div>
                        </div>
                        <div class="carousel-item">
                            <img class="third-slide" src="/resources/images/3.jpg" alt="Third slide">
                            <div class="container">

                            </div>
                        </div>
                    </div>
                    <a class="carousel-control-prev" href="#myCarousel" role="button" data-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="carousel-control-next" href="#myCarousel" role="button" data-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>




                <!-- Marketing messaging and featurettes
                ================================================== -->
                <!-- Wrap the rest of the page in another container to center all the content. -->

                <div class="">

                    <div class=" py-5 bg-light ">
                        <div >
                            <h3><a href="#" style="color: #040505">浏览商品:</a></h3>
                        </div>
                        <hr/>

                        <%--商品区域--%>
                        <div class="row" >
                            <div class="col-md-2 ">
                                <ul class="nav">
                                    <li class="nav-link">
                                        <hr/>
                                        <a class="nav-item" style="color: #040505" href="/shopManagement">零食</a><span >/</span>
                                        <a class="nav-item" style="color: #040505" href="/shopManagement">瓜果</a><span >/</span>
                                    </li>
                                    <li class="nav-link">
                                        <hr/>
                                        <a class="nav-item" style="color: #040505" href="/shopManagement">饮料</a><span >/</span>
                                        <a class="nav-item" style="color: #040505" href="/shopManagement">牛奶</a><span >/</span>
                                        <a class="nav-item" style="color: #040505" href="/shopManagement">豆奶</a><span >/</span>
                                        <a class="nav-item" style="color: #040505" href="/shopManagement">咖啡</a>
                                    </li>
                                    <li class="nav-link">
                                        <hr/>
                                        <a class="nav-item" style="color: #040505" href="/shopManagement">雪糕</a><span >/</span>
                                        <a class="nav-item" style="color: #040505" href="/shopManagement">冰淇淋</a><span >/</span>
                                        <a class="nav-item" style="color: #040505" href="/shopManagement">冷饮</a>
                                    </li>
                                    <li class="nav-link">
                                        <hr/>
                                        <a class="nav-item" style="color: #040505" href="/shopManagement">餐具</a><span >/</span>
                                        <a class="nav-item" style="color: #040505" href="/shopManagement">茶具</a><span >/</span>
                                        <a class="nav-item" style="color: #040505" href="/shopManagement">水杯</a>
                                    </li>
                                </ul>
                            </div>

                            <%--卡牌展示区--%>
                            <div class="row col-md-10" id="shopListRow">

                                <div class="col-lg-2 col-sm-6">
                                    <div class="card mb-4 box-shadow">
                                        <img class="card-img-top" src="/resources/images/product.jpg" alt="商品标题">
                                        <div class="card-body">
                                            <h4>商品标题</h4>
                                            <div>
                                                <span>$ 54.00</span>
                                            </div>

                                            <div>
                                                <small class="text-muted">零食</small>
                                            </div>
                                            <p class="card-text">此处是商品的简单描述,为了界面美观应该设置字数上限.</p>

                                        </div>
                                    </div>
                                </div>

                                <div class="col-lg-2 col-sm-6">
                                    <div class="card mb-4 box-shadow">
                                        <img class="card-img-top" src="/resources/images/product.jpg" alt="商品标题">
                                        <div class="card-body">
                                            <h4>商品标题</h4>
                                            <div>
                                                <span>$ 54.00</span>
                                            </div>

                                            <div>
                                                <small class="text-muted">零食</small>
                                            </div>
                                            <p class="card-text">此处是商品的简单描述,为了界面美观应该设置字数上限.</p>

                                        </div>
                                    </div>
                                </div>

                                <div class="col-lg-2 col-sm-6">
                                    <div class="card mb-4 box-shadow">
                                        <img class="card-img-top" src="/resources/images/product.jpg" alt="商品标题">
                                        <div class="card-body">
                                            <h4>商品标题</h4>
                                            <div>
                                                <span>$ 54.00</span>
                                            </div>

                                            <div>
                                                <small class="text-muted">零食</small>
                                            </div>
                                            <p class="card-text">此处是商品的简单描述,为了界面美观应该设置字数上限.</p>

                                        </div>
                                    </div>
                                </div>

                                <div class="col-lg-2 col-sm-6">
                                    <div class="card mb-4 box-shadow">
                                        <img class="card-img-top" src="/resources/images/product.jpg" alt="商品标题">
                                        <div class="card-body">
                                            <h4>商品标题</h4>
                                            <div>
                                                <span>$ 54.00</span>
                                            </div>

                                            <div>
                                                <small class="text-muted">零食</small>
                                            </div>
                                            <p class="card-text">此处是商品的简单描述,为了界面美观应该设置字数上限.</p>

                                        </div>
                                    </div>
                                </div>

                                <div class="col-lg-2 col-sm-6">
                                    <div class="card mb-4 box-shadow">
                                        <img class="card-img-top" src="/resources/images/product.jpg" alt="商品标题">
                                        <div class="card-body">
                                            <h4>商品标题</h4>
                                            <div>
                                                <span>$ 54.00</span>
                                            </div>

                                            <div>
                                                <small class="text-muted">零食</small>
                                            </div>
                                            <p class="card-text">此处是商品的简单描述,为了界面美观应该设置字数上限.</p>

                                        </div>
                                    </div>
                                </div>

                                <div class="col-lg-2 col-sm-6">
                                    <div class="card mb-4 box-shadow">
                                        <img class="card-img-top" src="/resources/images/product.jpg" alt="商品标题">
                                        <div class="card-body">
                                            <h4>商品标题</h4>
                                            <div>
                                                <span>$ 54.00</span>
                                            </div>

                                            <div>
                                                <small class="text-muted">零食</small>
                                            </div>
                                            <p class="card-text">此处是商品的简单描述,为了界面美观应该设置字数上限.</p>

                                        </div>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>

                    <!-- START THE FEATURETTES -->

                    <hr class="featurette-divider">

                    <div >
                        <h3><a href="#" style="color: #040505">浏览店铺:</a></h3>
                    </div>
                    <hr/>

                    <div class="row featurette">
                        <div class="col-md-7">
                            <h4 class="featurette-heading">月度最热店铺: <span class="text-muted">一堂和其正</span></h4>
                            <p class="lead">恭喜和掌柜夺得了本月的最热店铺光荣称号,我们勤劳的刘掌柜起得比鸡早睡得比鸡晚,再累再苦也不会忘了当一名奸商的职责和本分--希望他退休归乡的梦想能尽早实现.</p>
                        </div>
                        <div class="col-md-5">
                            <img class="featurette-image img-fluid mx-auto" data-src="" alt="300x300" style="width: 300px; height: 300px;" src="data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%22500%22%20height%3D%22500%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%20500%20500%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_163a4806440%20text%20%7B%20fill%3A%23AAAAAA%3Bfont-weight%3Abold%3Bfont-family%3AArial%2C%20Helvetica%2C%20Open%20Sans%2C%20sans-serif%2C%20monospace%3Bfont-size%3A25pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_163a4806440%22%3E%3Crect%20width%3D%22500%22%20height%3D%22500%22%20fill%3D%22%23EEEEEE%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%22186.5%22%20y%3D%22261.4%22%3E500x500%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E" data-holder-rendered="true">
                        </div>
                    </div>

                    <hr class="featurette-divider">

                    <div class="row featurette">
                        <div class="col-md-7 order-md-2">
                            <h4 class="featurette-heading">最佳新晋店铺: <span class="text-muted">祖传西医</span></h4>
                            <p class="lead">据说我们的贾大夫世家早在他爷爷的爷爷的时候就是一名赤脚老西医了,虽然历史已无法考证,但是胡大夫快准狠的手艺是得到了大家的认可的--尤其是在他收钱的时候.</p>
                        </div>
                        <div class="col-md-5 order-md-1">
                            <img class="featurette-image img-fluid mx-auto" data-src="" alt="300x300" style="width: 300px; height: 300px;" src="data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%22500%22%20height%3D%22500%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%20500%20500%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_163a4806443%20text%20%7B%20fill%3A%23AAAAAA%3Bfont-weight%3Abold%3Bfont-family%3AArial%2C%20Helvetica%2C%20Open%20Sans%2C%20sans-serif%2C%20monospace%3Bfont-size%3A25pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_163a4806443%22%3E%3Crect%20width%3D%22500%22%20height%3D%22500%22%20fill%3D%22%23EEEEEE%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%22186.5%22%20y%3D%22261.4%22%3E500x500%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E" data-holder-rendered="true">
                        </div>
                    </div>

                    <hr class="featurette-divider">

                    <div class="row ">
                        <div class="col-md-7">
                            <h4 class="featurette-heading">最受好评店铺: <span class="text-muted">西施臭豆腐</span></h4>
                            <p class="lead">为什么是西街的赛掌柜拿到了这个奖呢?我猜是她做出了的臭豆腐一点都不正宗的原因--不然西街就没法住人了.</p>
                        </div>
                        <div class="col-md-5">
                            <img class=" img-fluid mx-auto" data-src="" alt="300x300" style="width: 300px; height: 300px;" src="data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%22500%22%20height%3D%22500%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%20500%20500%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_163a4806445%20text%20%7B%20fill%3A%23AAAAAA%3Bfont-weight%3Abold%3Bfont-family%3AArial%2C%20Helvetica%2C%20Open%20Sans%2C%20sans-serif%2C%20monospace%3Bfont-size%3A25pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_163a4806445%22%3E%3Crect%20width%3D%22500%22%20height%3D%22500%22%20fill%3D%22%23EEEEEE%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%22186.5%22%20y%3D%22261.4%22%3E500x500%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E" data-holder-rendered="true">
                        </div>
                    </div>

                    <hr class="featurette-divider">

                    <!-- /END THE FEATURETTES -->

                </div><!-- /.container -->


                <!-- FOOTER -->
                <footer class="container">
                    <p class="float-right"><a href="https://getbootstrap.com/docs/4.1/examples/carousel/#">Back to top</a></p>
                    <p>© 2017-2018 Company, Inc. · <a href="https://getbootstrap.com/docs/4.1/examples/carousel/#">Privacy</a> · <a href="https://getbootstrap.com/docs/4.1/examples/carousel/#">Terms</a></p>
                </footer>
        </main>
    </div>
</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="/resources/js/common/jquery.min.js"></script>
<script src="/resources/js/common/popper.min.js"></script>
<script src="/resources/css/common/bootstrap-4.1.1/dist/js/bootstrap.min.js"></script>
<script src="/resources/js/common/holder.min.js"></script>

<!-- Icons -->
<script src="/resources/js/common/feather.min.js"></script>
<script>
    feather.replace()
</script>

<!-- Graphs -->
<script src="/resources/js/common/Chart.min.js"></script>
<script>

</script>

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
