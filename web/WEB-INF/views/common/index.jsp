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
                            <h3><a href="/index" style="color: #040505">所有商品:</a></h3>
                        </div>
                        <hr/>

                        <%--商品区域--%>
                        <div class="row" >
                            <div class="col-md-2 ">
                                <ul class="nav">
                                    <li class="nav-link" id="shopCategoryList">

                                        <a class="nav-item shopCategory" style="color: #040505" href="#">零食</a><span >/</span>
                                        <a class="nav-item shopCategory" style="color: #040505" href="#">零食</a><span >/</span>
                                        <a class="nav-item shopCategory" style="color: #040505" href="#">零食</a><span >/</span>
                                        <a class="nav-item shopCategory" style="color: #040505" href="#">零食</a><span >/</span>
                                        <hr/>
                                        <a class="nav-item shopCategory" style="color: #040505" href="#">零食</a><span >/</span>
                                        <a class="nav-item shopCategory" style="color: #040505" href="#">零食</a><span >/</span>
                                        <a class="nav-item shopCategory" style="color: #040505" href="#">零食</a><span >/</span>

                                    </li>
                                </ul>
                            </div>

                            <%--卡牌展示区--%>
                            <div class="row col-md-10" id="shopListRow">

                                <div class="col-lg-3 col-md-4 col-sm-6">
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

                                <div class="col-lg-3 col-md-4 col-sm-6">
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

                                <div class="col-lg-3 col-md-4 col-sm-6">
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

                                <div class="col-lg-3 col-md-4 col-sm-6">
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

                                <div class="col-lg-3 col-md-4 col-sm-6">
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

                                <div class="col-lg-3 col-md-4 col-sm-6">
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

                        <%--分页条--%>
                        <div class="container" >
                            <div class="row">
                                <!-- 分页结果信息 -->
                                <div class="col-md-6" id="page_info">
                                    分页信息
                                </div>

                                <!-- 导航条 -->
                                <div class="col-md-6" id="page_nav">
                                    <nav aria-label="...">
                                        <ul class="pagination">
                                            <li class="page-item disabled">
                                                <a class="page-link" href="#" tabindex="-1">Previous</a>
                                            </li>
                                            <li class="page-item"><a class="page-link" href="#">1</a></li>
                                            <li class="page-item active">
                                                <a class="page-link" href="#">2 <span class="sr-only">(current)</span></a>
                                            </li>
                                            <li class="page-item"><a class="page-link" href="#">3</a></li>
                                            <li class="page-item">
                                                <a class="page-link" href="#">Next</a>
                                            </li>
                                        </ul>
                                    </nav>
                                </div>
                            </div>
                        </div>
                    </div>

                    </div>



                    <hr class="featurette-divider">





                </div>


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
<script src="/resources/js/common/index.js"></script>

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
