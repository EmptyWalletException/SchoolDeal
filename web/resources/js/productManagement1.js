/*
* 自定义的js代码,用于获取店铺内所有的商品
*
* */




/*获取商品信息并回显*/
function getProductList(){
    /*这里需要实现取到Product的id值的代码*/
    //TO-DO
    $.ajax({
        url:"/getProductList",
        type:"POST",
        data:{"shopId":2},//这里先写死id,后期实现了店铺页面再从页面获取
        success:function(result){

            /* 这里要检查一下后端是否返回了错误报告信息 */
            if(100 == result.code){
                alert(result.msg);
                var productList = result.extend.productList;
                $("#shopListRow").empty();
                $.each(productList,function (index,product) {
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
                        "<div>" +
                        "<small class=\"text-muted\">商品上架时间 : " +createTime.toLocaleDateString() +"</small>" +
                        "</div>" +
                        "<div>" +
                        "<small class=\"text-muted\">最后编辑时间 : " +editTime.toLocaleDateString()+ "</small>" +
                        "</div>" +
                        "<p class=\"card-text\">" +product.productDesc + "</p>" +
                        "<div class=\"d-flex justify-content-between align-items-center\">" +
                        "<div class=\"btn-group\">" +
                        "<a type=\"button\" class=\"btn btn-sm btn-outline-secondary edit\" id='btn_edit' href=\"/showEditProduct/"+product.productId+"\""+"\">编辑</a>" +
                        "<a type=\"button\" class=\"btn btn-sm btn-outline-secondary\">下架</a>" +
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



$(function () {
    getProductList();
    /*$("#shopListRow").on('click',"#btn_edit",function(){
        var productId = $("#btn_edit").attr("productId");
        $.ajax({
            url:"/showEditProduct",
            type:"POST",
            data:{"productId":productId}


        });

    });*/
})

