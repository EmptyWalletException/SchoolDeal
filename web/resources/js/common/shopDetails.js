/*
* 自定义的js代码,用于获取店铺内所有的商品
*
* */

/* 定义一个全局变量用于记录末页的页码,服务于页面自动跳转到最后一页 */
var maxPage;
var currentPage;
$(function(){
    build_shopDetails("/getShop");
    build_shopCategory("/ajax/productCategory");
    to_page("/getShelveProduct",1);
})

function build_shopCategory(url) {
    $.ajax({
        url:url,
        type:"get",
        success:function (result) {
            var productCategoryList = result.extend.productCategoryList;

            $("#shopCategoryList").empty();
            var categoryLevel =1;
            $.each(productCategoryList,function (index,productCategory) {

                if (categoryLevel != productCategory.priority){
                    $("#shopCategoryList").append(
                        "<hr/>" +
                        "<a class='nav-item shopCategory' style='color: #040505' href='#'>"+productCategory.productCategoryName+"</a>"
                    )
                }else{
                    if (0 != index){
                        $("#shopCategoryList").append(
                            "<span >/</span>"
                        )
                    }
                    $("#shopCategoryList").append(
                        "<a class='nav-item shopCategory' style='color: #040505' href='#'>"+productCategory.productCategoryName+"</a>"
                    )
                }
                
                categoryLevel = productCategory.priority;
            });

        }
    });
}

function build_shopDetails(url) {
    $.ajax({
        url:url,
        type:"get",
        success:function (result) {
            var shop = result.extend.shop;
            $("#shopImg").attr("src","../../"+shop.shopImg);
            $("#shopName").text(shop.shopName);
            $("#shopDesc").text("店铺简介:"+shop.shopDesc);
            $("#priority").text("店铺等级:"+shop.priority);
            $("#phone").text("联系方式:"+shop.phone);
            $("#shopAddr").text("店铺店址:"+shop.shopAddr);

        }
    });
}




/* 抽取出来的跳转到指定页码页面的方法 */
function to_page(url,pn){
    $.ajax({
        url:url,
        data:"pn="+pn,
        type:"post",
        success:function(result){
            maxPage = result.extend.pageInfo.pages;
            currentPage = result.extend.pageInfo.pageNum;
            build_product_table(result);
            build_page_info(result);
            build_page_nav(result);
        }
    });
}


/*获取商品信息并回显,需要传入一个url字符串以调用控制层不同的查询方法*/
function build_product_table(result){

                var productCategoryList = result.extend.productCategoryList;
                var productList = result.extend.pageInfo.list;

                $("#shopListRow").empty();
                $.each(productList,function (index,product) {
                    var productCategoryName = "";
                    $.each(productCategoryList,function (index,category) {
                        if(product.productCategoryId == category.productCategoryId){
                            productCategoryName = category.productCategoryName;
                        }
                    });

                    var createTime = new Date(product.createTime);
                    var editTime = new Date(product.editTime);
                    $("#shopListRow").append(
                        "<div class='col-lg-3 col-md-6 col-sm-6'>" +
                            "<div class='card mb-4 box-shadow'>" +
                                "<img class='card-img-top' src='../../" +product.imgAddr +"' alt='商品图片'>" +
                                "<div class='card-body'>" +

                                "<h4>" +product.productName + "</h4>" +
                                "<div>" +
                                    "<span>$ " +product.normalPrice + "</span>"+
                                "</div>" +
                                "<div>" +
                                    "<small class='text-muted'>商品创建时间 : " +createTime.toLocaleDateString() +"</small>" +
                                "</div>" +
                                "<div>" +
                                    "<small class='text-muted'>最后编辑时间 : " +editTime.toLocaleDateString()+ "</small>" +
                                "</div>" +
                                "<div>" +
                                    "<small class='text-muted'>商品分类 : "+productCategoryName+ "</small>" +
                                "</div>" +
                                "<p class='card-text'>" +product.productDesc + "</p>" +
                                "<div class=''>" +
                                    "<div class='btn-group'>" +
                                        "<button type='button' class='btn btn-sm btn-outline-secondary btn_collect'  productId='"+product.productId+"'>收藏</button>" +
                                        "<button type='button' class='btn btn-sm btn-outline-secondary btn_addToCart'  productId='"+product.productId+"'>加入购物车</button>" +
                                    "</div>" +
                                "</div>" +
                            "</div>"+
                        "</div>"
                    );
                })
}

/*分页功能部分*/
/*  当前第${pageInfo.pageNum }/${pageInfo.pages }页,当前页记录数:${pageInfo.size }条;总记录数:${pageInfo.total }条; */
function build_page_info(result){
    /* 生成新的元素前一定要先清空掉以前的数据,否则会累加到页面上 */
    $("#page_info").empty();
    $("#page_info").append("当前第"+result.extend.pageInfo.pageNum+"/"+result.extend.pageInfo.pages+"页,当前页记录数:"+result.extend.pageInfo.size+"条;总记录数:"+result.extend.pageInfo.total+"条");
}

/* 显示分页条 */
function build_page_nav(result){
    /* 生成新的元素前一定要先清空掉以前的数据,否则会累加到页面上 */
    $("#page_nav").empty();
    var ul = $("<ul></ul>").addClass("pagination");
    /* 生成首页按钮 */
    var li_frist = $("<li class='page-item'></li>").append($("<a class='page-link'></a>").attr("href","#").append("首页"));
    ul.append(li_frist);
    /* 生成上一页按钮 */
    var li_pre = $("<li class='page-item'></li>").append($("<a class='page-link'></a>").attr("href","#").append("&laquo;"));
    ul.append(li_pre);

    /* 当没有上一页时则按钮不可点击,否则可以点击 */
    if(result.extend.pageInfo.hasPreviousPage == false){
        li_frist.addClass("disabled");
        li_pre.addClass("disabled");
    }else{
        /* 为首页按钮添加一个点击跳转到首页的绑定事件 */
        li_frist.click(function(){
            to_page("/getShelveProduct",1);
        });
        /* 为上一页按钮添加一个点击跳转到上一页的绑定事件 */
        li_pre.click(function(){
            to_page("/getShelveProduct",result.extend.pageInfo.prePage);
        });
    }

    /* 遍历分页信息中是否有12345等页码数 */
    $.each(result.extend.pageInfo.navigatepageNums,function(index,nums){
        var a_nums = $("<a class='page-link'></a>").attr("href","#").append(nums)
        var li_nums = $("<li class='page-item'></li>").append(a_nums);

        if(result.extend.pageInfo.pageNum == nums){
            /* 当前页码高亮显示 ,如果不是当前页码,则会在else里添加点击功能*/
            li_nums.addClass("active");
        }else{
            /* 为每一个遍历后生成出来的li_nums添加一个点击跳转的绑定事件 */
            li_nums.click(function(){
                to_page("/getShelveProduct",nums);
            });
        }
        ul.append(li_nums);
    });

    /* 生成下一页按钮 */
    var li_next = $("<li class='page-item'></li>").append($("<a class='page-link'></a>").attr("href","#").append("&raquo;"));
    ul.append(li_next);
    /* 生成末页按钮 */
    var li_last = $("<li class='page-item'></li>").append($("<a class='page-link'></a>").attr("href","#").append("末页"));
    ul.append(li_last);

    /* 当没有下一页时按钮不可点击,否则可以点击 */
    if(result.extend.pageInfo.hasNextPage == false){
        li_next.addClass("disabled");
        li_last.addClass("disabled");
    }else{
        /* 为下一页按钮添加一个点击跳转到下一页的绑定事件 */
        li_next.click(function(){
            to_page("/getShelveProduct",result.extend.pageInfo.nextPage);
        });
        /* 为末页按钮添加一个点击跳转到末页的绑定事件 */
        li_last.click(function(){
            to_page("/getShelveProduct",result.extend.pageInfo.pages);
        });
    }

    var nav = $("<nav></nav>").attr("aria-label","Page navigation").append(ul);
    $("#page_nav").append(nav);
}












