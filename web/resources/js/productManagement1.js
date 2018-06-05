/*
* 自定义的js代码,用于获取店铺内所有的商品
*
* */


/*获取商品分类信息,需要传入一个url字符串以调用控制层不同的查询方法*/
function getProductCategoryList(url){
    $.ajax({
        url:"/ajax/productCategory",
        type:"get",
        success:function(result){
            /* 这里要检查一下后端是否返回了错误报告信息 */
            if(100 == result.code){
                 var productCategoryList = result.extend.productCategoryList;
                getProductList(url,productCategoryList);
            }
        }
    });
}

/*获取商品信息并回显,需要传入一个url字符串以调用控制层不同的查询方法*/
function getProductList(url,productCategoryList){
    $.ajax({
        url:url,
        type:"get",
        success:function(result){
            if(100 == result.code){
                var productList = result.extend.productList;
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
                        "<div class=\"col-md-4\">" +
                        "<div class=\"card mb-4 box-shadow\">" +
                        "<img class=\"card-img-top\" src=\"" +product.imgAddr +"\" alt=\"商品标题\">" +
                        "<div class=\"card-body\">" +

                        "<h1>" +product.productName + "</h1>" +
                        "<div>" +
                        "<span>$ " +product.normalPrice + "</span>"+
                        "</div>" +
                        "<div class='status'>" +
                        "<small class=\"text-muted\" enableStatus='"+ product.enableStatus+"'>商品状态 : " +(0 == product.enableStatus?'上架中':'已下架') +"</small>" +
                        "</div>" +
                        "<div>" +
                        "<small class=\"text-muted\">商品创建时间 : " +createTime.toLocaleDateString() +"</small>" +
                        "</div>" +
                        "<div>" +
                        "<small class=\"text-muted\">最后编辑时间 : " +editTime.toLocaleDateString()+ "</small>" +
                        "</div>" +
                        "<div>" +
                        "<small class=\"text-muted\">商品分类 : "+productCategoryName+ "</small>" +
                        "</div>" +
                        "<p class=\"card-text\">" +product.productDesc + "</p>" +
                        "<div class=\"d-flex justify-content-between align-items-center\">" +
                        "<div class=\"btn-group\">" +
                        "<a type=\"button\" class=\"btn btn-sm btn-outline-secondary edit btn_edit\"  href=\"/showEditProduct/"+product.productId+"\""+"\">编辑</a>" +
                        "<button type=\"button\" class=\"btn btn-sm btn-outline-secondary btn_switchStatus\"  productId='"+product.productId+"'>"+(product.enableStatus == 0?'下架':'上架')+"</button>" +
                        "<button type=\"button\" class=\"btn btn-sm btn-outline-secondary btn_removeProduct\"  productId='"+product.productId+"'>删除</button>" +
                        "</div>" +
                        "</div>" +
                        "</div>"+
                        "</div>"
                    );
                })
            }else{
                alert(result.msg);
            }
        }
    });
}

//上架和下架商品
$("#shopListRow").on('click','.btn_switchStatus',function () {
    var enableStatus = $(this).parent().parent().prevAll(".status").children("small").attr("enableStatus");
    var productName = $(this).parent().parent().prevAll("h1").text();
    var productId = $(this).attr("productId");
    if(0 == enableStatus){
        var confirmRemove = confirm("确认要下架商品:"+productName+"?");
        if (true == confirmRemove){
            $.ajax({
                url:"/unShelveProduct",
                type:'POST',
                data:{'productId':productId},
                success:function (result) {
                    alert(result.msg);
                    getProductCategoryList();
                }
            });
        }else {
            return;
        }
    }else{
        var confirmRemove = confirm("确认要上架商品:"+productName+"?");
        if (true == confirmRemove){
            $.ajax({
                url:"/shelveProduct",
                type:'POST',
                data:{'productId':productId},
                success:function (result) {
                    alert(result.msg);
                    getProductCategoryList();
                }
            });
        }else {
            return;
        }
   }
})

//删除商品
$("#shopListRow").on('click','.btn_removeProduct',function () {

    var productName = $(this).parent().parent().prevAll("h1").text();
    var confirmRemove = confirm("确认要删除商品:"+productName+"?");
    var productId = $(this).attr("productId");
    if (true == confirmRemove){
        $.ajax({
            url:"/removeProduct",
            type:'POST',
            data:{'productId':productId},
            success:function (result) {
                alert(result.msg);
                getProductCategoryList();
            }
        });
    } else{
        return;
    }
})

$("#allProduct").click(function () {
    getProductCategoryList("/getProductList");
})

$("#shelveProduct").click(function () {
    getProductCategoryList("/getShelveProduct");
})

$("#unShelveProduct").click(function () {
    getProductCategoryList("/getUnShelveProduct");
})

$(function () {
    getProductCategoryList("/getProductList");

})

