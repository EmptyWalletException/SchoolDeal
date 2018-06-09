

$(function(){

    build_shopCategory("/ajax/productCategory");

})

function build_shopCategory(url) {
    $.ajax({
        url:url,
        type:"get",
        success:function (result) {
            var productCategoryList = result.extend.productCategoryList;

            $("#shopCategoryList").empty();
            //这里定义一个层级,为了在遍历时将上一次遍历的层级与当前遍历的层级做比较
            var preCategoryLevel =1;
            $.each(productCategoryList,function (index,productCategory) {

                //上一次遍历的层级与正在遍历的层级不同时会增加一个分隔线,所以会被划分到下一行;
                if (preCategoryLevel != productCategory.priority){
                    $("#shopCategoryList").append(
                        "<hr/>" +
                        "<a class='nav-item shopCategory' style='color: #040505' href='#'>"+productCategory.productCategoryName+"</a>"
                    )
                }else{
                    //在不是第一次遍历时会增加一个/用来分隔各个层级的分类
                    if (0 != index){
                        $("#shopCategoryList").append(
                            "<span >/</span>"
                        )
                    }
                    $("#shopCategoryList").append(
                        "<a class='nav-item shopCategory' style='color: #040505' href='#'>"+productCategory.productCategoryName+"</a>"
                    )
                }
                //遍历完成后,将正在遍历的层级赋值给上一次遍历的层级;
                preCategoryLevel = productCategory.priority;
            });

        }
    });
}















