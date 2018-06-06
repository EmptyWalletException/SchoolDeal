<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">

    <title>商品管理</title>

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

            <section class="jumbotron text-center" style="background-color: #ffffff">
                <div class="container">
                    <h3 >选择浏览方式</h3>
                    <p class="lead text-left">您可以选择两种浏览方式来管理您的商品:
                        1,使用带图片的简单预览方式(默认方式);
                        2,使用不带图片的表格预览方式;
                        移动端建议切到横屏浏览</p>
                    <p>
                        <a href="/productManagement" class="btn btn-primary my-2">使用预览方式1</a>
                        <a href="/productManagement2" class="btn btn-secondary my-2">使用预览方式2</a>
                    </p>
                    <p>
                    <h3>选择商品状态</h3>
                    <div class=" my-3 row" id="chooseShopStateGroup">
                        <div class="custom-control custom-radio" style="margin-left: auto;margin-right: auto;">
                            <input id="allProduct" name="chooseShopState" type="radio" class="custom-control-input" checked required>
                            <label class="custom-control-label" for="allProduct">全部的商品</label>
                        </div>
                        <div class="custom-control custom-radio" style="margin-left: auto;margin-right: auto;">
                            <input id="shelveProduct" name="chooseShopState" type="radio" class="custom-control-input" required>
                            <label class="custom-control-label" for="shelveProduct">上架中商品</label>
                        </div>
                        <div class="custom-control custom-radio" style="margin-left: auto;margin-right: auto;">
                            <input id="unShelveProduct" name="chooseShopState" type="radio" class="custom-control-input" required>
                            <label class="custom-control-label" for="unShelveProduct">已下架商品</label>
                        </div>
                    </div>
                    </p>
                </div>
            </section>

            <div class="album py-5 bg-light">
                <div class="text-center">
                    <a type="button" class="btn btn-sm btn-primary " href="/addProduct">新增一个商品</a>
                </div>
                <hr/>
                <div class="container" >
                    <div class="row" id="shopListRow">
                        <div class="col-md-4">
                            <div class="card mb-4 box-shadow">
                                <img class="card-img-top" src="/resources/images/product.jpg" alt="商品标题">
                                <div class="card-body">
                                    <h1>商品标题</h1>
                                    <div>
                                        <span>$ 54.00</span>
                                    </div>
                                    <div>
                                        <small class="text-muted">商品状态 : 上架中</small>
                                    </div>
                                    <div>
                                    <small class="text-muted">商品创建时间 : 2018/5/30</small>
                                    </div>
                                    <div>
                                    <small class="text-muted">最后编辑时间 : 2018/5/30</small>
                                    </div>
                                    <div>
                                        <small class="text-muted">零食</small>
                                    </div>
                                    <p class="card-text">此处是商品的简单描述,为了界面美观应该设置字数上限.</p>
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-sm btn-outline-secondary edit" produtyId="2">编辑</button>
                                            <button type="button" class="btn btn-sm btn-outline-secondary">下架</button>
                                            <button type="button" class="btn btn-sm btn-outline-secondary">上架</button>
                                        </div>

                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-4">
                            <div class="card mb-4 box-shadow">
                                <img class="card-img-top" src="/resources/images/product.jpg" alt="商品标题">
                                <div class="card-body">
                                    <h1>商品标题</h1>
                                    <div>
                                        <span>$ 54.00</span>
                                    </div>
                                    <div>
                                        <small class="text-muted">商品状态 : 上架中</small>
                                    </div>
                                    <div>
                                        <small class="text-muted">商品创建时间 : 2018/5/30</small>
                                    </div>
                                    <div>
                                        <small class="text-muted">最后编辑时间 : 2018/5/30</small>
                                    </div>
                                    <div>
                                        <small class="text-muted">零食</small>
                                    </div>
                                    <p class="card-text">此处是商品的简单描述,为了界面美观应该设置字数上限.</p>
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-sm btn-outline-secondary edit" produtyId="2">编辑</button>
                                            <button type="button" class="btn btn-sm btn-outline-secondary">下架</button>
                                            <button type="button" class="btn btn-sm btn-outline-secondary">上架</button>
                                        </div>
                                    </div>
                                </div>
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
<script src="/resources/js/jquery.min.js"></script>
<!--user-defined-js-->
<script src="/resources/js/productManagement1.js"></script>

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
