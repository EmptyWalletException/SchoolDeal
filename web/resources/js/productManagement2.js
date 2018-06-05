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

            /* 这里要检查一下后端是否返回了错误报告信息 */
            if(100 == result.code){
                var productList = result.extend.productList;
                $("#tbody4productList").empty();
                $.each(productList,function (index,product) {
                    var createTime = new Date(product.createTime);
                    var editTime = new Date(product.editTime);
                    var enableStatus = product.enableStatus;
                    var productCategoryName = "";
                    $.each(productCategoryList,function (index,category) {
                        if(product.productCategoryId == category.productCategoryId){
                            productCategoryName = category.productCategoryName;
                        }
                    });
                    $("#tbody4productList").append(
                        "<tr>"+
                        "<td class='productName'>"+product.productName+"</td>"+
                        "<td>$ "+product.normalPrice+"</td>"+
                        "<td class='status' enableStatus='\"+ product.enableStatus+\"' >"+(0 == enableStatus?'上架中':'已下架')+"</td>"+
                        "<td>"+createTime.toLocaleDateString()+"</td>"+
                        "<td>"+editTime.toLocaleDateString()+"</td>"+
                        "<td>"+productCategoryName+"</td>"+
                        "<td>"+product.productDesc+"</td>"+
                        "<td>"+
                        " <a  class=\"btn btn-sm btn-outline-secondary \" href=\"/editProduct/"+product.productId+"\""+"\">编辑</a>"+
                        "<button type=\"button\" class=\"btn btn-sm btn-outline-secondary btn_switchStatus\"  productId='"+product.productId+"'>"+(product.enableStatus == 0?'下架':'上架')+"</button>" +
                        "<button type=\"button\" class=\"btn btn-sm btn-outline-secondary btn_removeProduct\"  productId='"+product.productId+"'>删除</button>" +
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
$("#tbody4productList").on('click','.btn_removeProduct',function () {
    var productName = $(this).parent().prevAll(".productName").text();
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

//上架和下架商品
$("#shopListRow").on('click','.btn_switchStatus',function () {
    var enableStatus = $(this).parent().prevAll(".status").attr("enableStatus");
    var productName = $(this).parent().prevAll(".productName").text();
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

//页面上的三个筛选商品状态的选择按钮
$("#allProduct").click(function () {
    getProductCategoryList("/getProductList");
})

$("#shelveProduct").click(function () {
    getProductCategoryList("/getShelveProduct");
})

$("#unShelveProduct").click(function () {
    getProductCategoryList("/getUnShelveProduct");
})

//页面加载的时候默认的初始化方法
$(function () {
    getProductCategoryList("/getProductList");
})

