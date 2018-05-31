/*
* 自定义的js代码,用于获取店铺内所有的商品
*
* */
/*获取商品分类信息*/
function getProductCategoryList(){
    $.ajax({
        url:"/ajax/productCategory",
        type:"get",
        success:function(result){
            /* 这里要检查一下后端是否返回了错误报告信息 */
            if(100 == result.code){
                var productCategoryList = result.extend.productCategoryList;
                getProductList(productCategoryList);
            }
        }
    });
}



/*获取商品信息并回显*/
function getProductList(productCategoryList){
    $.ajax({
        url:"/getProductList",
        type:"get",
        success:function(result){

            /* 这里要检查一下后端是否返回了错误报告信息 */
            if(100 == result.code){
                var productList = result.extend.productList;
                $("#tbody4productList").empty();
                $.each(productList,function (index,product) {
                    var createTime = new Date(product.createTime);
                    var editTime = new Date(product.editTime);
                    var productCategoryName = "";
                    $.each(productCategoryList,function (index,category) {
                        if(product.productCategoryId == category.productCategoryId){
                            productCategoryName = category.productCategoryName;
                        }
                    });
                    $("#tbody4productList").append(
                        "<tr>"+
                        "<td id='productName'>"+product.productName+"</td>"+
                        "<td>$ "+product.normalPrice+"</td>"+
                        "<td>"+createTime.toLocaleDateString()+"</td>"+
                        "<td>"+editTime.toLocaleDateString()+"</td>"+
                        "<td>"+productCategoryName+"</td>"+
                        "<td>"+product.productDesc+"</td>"+
                        "<td>"+
                        " <a  class=\"btn btn-primary \" href=\"/editProduct/"+product.productId+"\""+"\">编辑</a>"+
                        " <button  class=\"btn btn-danger \" id='btn_removeProduct' productId=\""+product.productId+"\""+"\">下架</button>"+
                        "</td>"+
                        "</tr>"
                    )
                })
            }else{
                alert(result.msg);
            }
        }
    });
}

//绑定按钮删除商品的方法
$("#tbody4productList").on('click','#btn_removeProduct',function () {
    var productName = $(this).parent().prevAll("#productName").text();
    var confirmRemove = confirm("确认要下架商品:"+productName+"?");
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

$(function () {
    getProductCategoryList();
})

