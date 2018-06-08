<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="">

    <title>店铺管理</title>

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

            <section class="jumbotron text-center" style="background-color: #ffffff">
                <div class="container">

                    <h3>店铺管理</h3>

                </div>
            </section>

            <div class="album py-5 bg-light">
                <hr/>
                <div class="container" >
                    <div class="row" id="shopListRow">
                        <div class="col-md-4">
                            <div class="card mb-4 box-shadow">
                                <img class="card-img-top" src="/resources/images/product.jpg" alt="店铺标题">
                                <div class="card-body">
                                    <h3>店铺名字</h3>
                                    <div>
                                        <span>所属用户: 小二</span>
                                    </div>
                                    <div>
                                        <small class="text-muted">所属区域 : 上海</small>
                                    </div>

                                    <div>
                                        <small class="text-muted">店铺等级 : 1</small>
                                    </div>
                                    <div>
                                        <small class="text-muted">店铺创建时间 : 2018/5/30</small>
                                    </div>
                                    <div>
                                    <small class="text-muted">最后编辑时间 : 2018/5/30</small>
                                    </div>

                                    <p class="card-text">此处是店铺的简单描述.</p>
                                    <div class="d-flex justify-content-between align-items-center">
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-sm btn-outline-secondary">查看</button>
                                            <button type="button" class="btn btn-sm btn-outline-secondary edit" produtyId="2">编辑</button>
                                        </div>
                                    </div>
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
<script src="/resources/js/admin/shopManagement.js"></script>

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
