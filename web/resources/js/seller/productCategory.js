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
                $("#tbody4productCategoryList").empty();
                $.each(productCategoryList,function (index,productCategory) {
                    var createTime = new Date(productCategory.createTime);

                    $("#tbody4productCategoryList").append(
                        "<tr>"+
                        "<td class='td4Edit'>" +
                        "<div class=\"col-lg-6\">\n" +
                        "    <div class=\"input-group\">\n" +
                        "      <input type=\"text\" class=\"form-control\" value=\""+productCategory.productCategoryName+"\" disabled>" +
                        "      <span class=\"input-group-btn\">\n" +
                        "      </span>\n" +
                        "    </div>" +
                        " </div>" +
                        " </td>" +

                        "<td>"+createTime.toLocaleDateString()+"</td>"+
                        "<td class='editAndDeleteButton'>"+
                        "<button  class=\"btn btn-primary editPC\" productCategoryId='"+productCategory.productCategoryId+"'>编辑</button>"+
                        "<button  class=\"btn btn-danger  deletePC\" productCategoryId='"+productCategory.productCategoryId+"'>删除</button>"+
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

$("#tbody4productCategoryList").on('click','.editPC',function () {
    var inputGroup = $(this).parents().prevAll('.td4Edit').children('div').children('div');
    inputGroup.children('input').removeAttr('disabled');
    inputGroup.children('span').append(
        "<button class=\"btn btn-default confirmEdit\" type=\"button\">提交</button>"
    )
    $(this).attr("disabled",true);
});

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



$("#tbody4productCategoryList").on('click','.confirmEdit',function () {
    var productCategoryId = $(this).parents(".td4Edit").nextAll(".editAndDeleteButton").children(".editPC").attr("productCategoryId");
    var productCategoryName =$(this).parents(".td4Edit").children('div').children('div').children('input').val();
    $.ajax({
        url:"/ajax/editProductCategory",
        type:"POST",
        data:{productCategoryId:productCategoryId,productCategoryName:productCategoryName},
        success:function(result){
            alert(result.msg);
            getProductCategoryList();
        }
    });
})

$("#tbody4productCategoryList").on('click','.deletePC',function () {
    var productCategoryId = $(this).attr('productCategoryId');
    $.ajax({
        url:"/ajax/deleteProductCategory",
        type:"POST",
        data:{productCategoryId:productCategoryId},
        success:function(result){
            alert(result.msg);
            getProductCategoryList();
        }
    });
});

$(function () {
    getProductCategoryList();

})

