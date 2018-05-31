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
                alert(result.msg);
                var productCategoryList = result.extend.productCategoryList;
                $("#tbody4productCategoryList").empty();
                $.each(productCategoryList,function (index,productCategory) {
                    var createTime = new Date(productCategory.createTime);
                    $("#tbody4productCategoryList").append(
                        "<tr>"+
                        "<td>"+productCategory.productCategoryName+"</td>"+
                        "<td>"+createTime.toLocaleDateString()+"</td>"+
                        "<td>"+
                        "<a  class=\"btn btn-primary \" href=\"editProductCategory/"+productCategory.productCategoryId+"\">编辑</a>"+
                        "<a  class=\"btn btn-danger \" href=\"deleteProductCategory/"+productCategory.productCategoryId+"\">删除</a>"+
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

$("#addProductCategroy").click(function () {
    var name = $("#tempProductCateGoryName").val();
    $.ajax({
        url:"/ajax/addProductCategory",
        type:"POST",
        data:{productCategoryName:name},
        success:function(result){
            alert(result.msg);
            getProductCategoryList();
        }
    });
});

$(function () {
    getProductCategoryList();

})

