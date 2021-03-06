<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="">

    <title>店铺详情</title>

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


            <%--店铺详情区域--%>
            <div class="card mb-3">
                <img class="card-img-top" id="shopImg" src="/resources/images/1.jpg" alt="店铺主页图片">
                <div class="card-body">
                    <h3 class="card-title" id="shopName">欢迎光临街角咖啡 </h3>
                    <p  class="card-text" id="owner">店铺主人</p>
                    <p class="card-text" id="priority"><small class="text-muted">店铺等级</small></p>
                    <p class="card-text" id="shopDesc">店铺描述</p>
                    <p  class="card-text" id="phone"  >联系方式</p>
                    <p class="card-text" id="shopAddr">店铺地址</p>

                </div>
            </div>








                <!-- Marketing messaging and featurettes
                ================================================== -->
                <!-- Wrap the rest of the page in another container to center all the content. -->

                <div class="">

                    <div class=" py-5 bg-light ">
                        <div >
                            <h3><a href="#" style="color: #040505" id="allProducts">所有商品:</a></h3>
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

                                <div class="col-lg-2 col-md-4 col-sm-6">
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
<script src="/resources/js/common/shopDetails.js"></script>

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
