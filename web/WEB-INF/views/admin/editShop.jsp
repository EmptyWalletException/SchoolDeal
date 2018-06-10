<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">

    <title>编辑店铺</title>

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

        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">

            <jsp:include page="fastJump.jsp"></jsp:include>

            <hr/>
            <br/>

            <div class="row col-lg-6 offset-lg-3">
                <div class="col-lg-12 ">
                        <h3 class="text-center">编辑店铺</h3>

                        <div class="needs-validation" id="registerShopForm"  novalidate>
                            <div >
                                <img  class="card-img" src="" alt="店铺主页图片" id="shopImg">
                            </div>
                            <br/>
                            <div class="mb-3">
                                <label for="shopName">招牌名字:</label>
                                <input type="text" class="form-control" id="shopName" name="shopName"  required>
                                <div class="invalid-feedback">
                                    请输入一个可使用的店铺名字.
                                </div>
                            </div>

                            <div class="mb-3">
                                <label for="shopDesc">店铺描述:</label>
                                <textarea  class="form-control" id="shopDesc" name="shopDesc" required></textarea>
                                <div class="invalid-feedback">
                                    请输入店铺描述.
                                </div>
                            </div>

                            <div class="mb-3">
                                <label for="phone">手机号码:</label>
                                <input type="text" class="form-control" id="phone" name="phone" >
                                <div class="invalid-feedback">
                                    请输入正确的手机号码.
                                </div>
                            </div>

                            <div class="mb-3">
                                <label for="shopAddr">店铺地址:</label>
                                <input type="text" class="form-control" id="shopAddr" name="shopAddr"  required>
                                <div class="invalid-feedback">
                                    请输入您的店铺地址.
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-6 mb-3">
                                    <label for="areaSel">选择店铺区域:</label>
                                    <select class="custom-select d-block w-100" id="areaSel" name="areaId"required>
                                        <option value="">选择店铺区域</option>
                                        <option>华东</option>
                                        <option>华西</option>
                                        <option>华南</option>
                                        <option>华北</option>
                                    </select>
                                    <div class="invalid-feedback">
                                        请选择店铺区域.
                                    </div>
                                </div>


                            </div>

                            <hr class="mb-4">
                            <div class="form-group">
                                <label for="inputFile">上传一张店铺主页图片:</label>
                                <input type="file" id="inputFile" >
                                <p class="help-block">如果您不需要重新更换店铺图片,请跳过上传图片的步骤.</p>
                            </div>
                            <hr class="mb-4">

                        </div>
                            <button class="btn btn-primary btn-lg btn-block "  id="submit_EditShop">提交更新</button>
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
<script src="/resources/js/admin/editShop.js" charset="UTF-8"></script>

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
