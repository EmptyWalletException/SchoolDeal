<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">

    <title>编辑店铺</title>

    <!-- Bootstrap core CSS -->
    <link href="/resources/css/bootstrap.min.css" rel="stylesheet">

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

            <div class="container">
                <div class="py-5 text-center">
                    <img class="d-block mx-auto mb-4" src="https://getbootstrap.com/assets/brand/bootstrap-solid.svg" alt="" width="72" height="72">
                    <h2>编辑商品</h2>
                    <p class="lead">请更新您的商品信息!</p>
                </div>
                <hr/>

                <div class="row">
                    <div class="col-md-8 order-md-1">
                        <h4 class="mb-3">编辑商品</h4>
                        <div class="needs-validation" id="editProductForm"  novalidate>
                            <div class="mb-3">
                                <label for="productName">商品名字</label>
                                <input type="text" class="form-control" id="productName" name="productName"  required>
                                <div class="invalid-feedback">
                                    请输入一个商品名字.
                                </div>
                            </div>

                            <div class="mb-3">
                                <label for="productDesc">商品描述</label>
                                <textarea  class="form-control" id="productDesc" name="productDesc" required></textarea>
                                <div class="invalid-feedback">
                                    请输入商品描述.
                                </div>
                            </div>

                            <div class="mb-3">
                                <label for="normalPrice">商品价格</label>
                                <input type="text" class="form-control" id="normalPrice" name="normalPrice" >
                                <div class="invalid-feedback">
                                    请输入正确的商品价格.
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6 mb-3">
                                    <label for="productCategorySel">选择商品分类</label>
                                    <select class="custom-select d-block w-100" id="productCategorySel" name="productCategorySel"required>
                                        <option value="">选择商品分类</option>
                                        <option>商品分类1</option>
                                        <option>商品分类2</option>
                                        <option>商品分类3</option>
                                        <option>商品分类4</option>
                                    </select>
                                    <div class="invalid-feedback">
                                        请选择商品分类;
                                    </div>
                                </div>
                            </div>

                            <hr class="mb-4">
                            <div class="form-group">
                                <label for="inputFile">上传一张商品主页图片</label>
                                <input type="file" id="inputFile" >
                                <p class="help-block">如果您不需要重新商品主页图片,请跳过上传图片的步骤.</p>
                            </div>
                            <hr class="mb-4">

                        </div>
                            <button class="btn btn-primary btn-lg btn-block "  id="submit_EditProduct">确定修改</button>
                    </div>
                </div>


                <!-- FOOTER -->
                <footer class="container">
                    <p class="float-right"><a href="#">Back to top</a></p>
                    <p>© 2017-2018 Company, Inc. · <a href="#">Privacy</a> · <a href="https://getbootstrap.com/docs/4.1/examples/carousel/#">Terms</a></p>
                </footer>
            </div>
        </main>
    </div>
</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="/resources/js/jquery.min.js"></script>
<!--user-defined-js-->
<script src="/resources/js/editProduct.js" charset="UTF-8"></script>

<script src="/resources/js/popper.min.js"></script>
<script src="/resources/js/bootstrap.min.js"></script>
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
