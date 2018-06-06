/*
* 自定义的js代码,用于实现前后端之间的功能交互
*
* */



/*点击按钮注册店铺的事件*/
$("#submit_RegisterUser").click(function(){
    /* 检查输入框是否符合正则表达式 */


    /* 检查ajax校验用户名是否可用后的标记 */

    /*因为涉及到文件的处理,无法直接用form封装到pojo中,所以先使用js代码来封装数据
    * 这里采用本地账号和用户信息同时注册的方式,需要用到两个pojo封装*/
    var localAuth={};
        localAuth.username = $("#username").val();
        localAuth.password= $("#password").val();

    var personInfo ={};
        personInfo.name=$("#petName").val();
        personInfo.email=$("#email").val();
        personInfo.gender=$("input:checked").val();


    var formData = new FormData();
    formData.append("localAuth",JSON.stringify(localAuth));
    formData.append("personInfo",JSON.stringify(personInfo));

    $.ajax({
        url:"/registerUser",
        type:"POST",
        data:formData,
        async: false,
        contentType:false,
        processData:false,
        cache:false,
        success:function(result){
            alert(result.msg);
            /* 这里要检查一下后端是否返回了错误报告信息 */

                /* 判断从后台返回的错误字段是哪个,如果有,则显示错误信息 */


        }
    });

});


/* 抽取出来的输入框的前端校验
function validatInput(nameEle,ajaxEle,emailEle){
    // 验证用户名  /^[a-z0-9_-]{3,16}$/
    var inputName = $(nameEle).val();
    var regName = /(^[a-z0-9_-]{2,10}$)|(^[\u2E80-\u9FFF]{2,10})/;
    //alert(!regName.test(inputName));
    //先检查ajax校验用户名的结果,ajax通过后再进一步检查
    if($(ajaxEle).attr("ajaxCheckEmpName") != "error"){
        if(!regName.test(inputName)){
            //alert("用户名格式不正确,请输入2~10位字符,只能出现数字或英文或汉字的组合!");
            showValidateInfo(nameEle,"error","用户名格式不正确,请输入2~10位字符,只能出现数字或英文或汉字的组合!");
        }else{
            showValidateInfo(nameEle,"ok","");
        }
    }


    //验证邮箱
    var inputEmail = $(emailEle).val();
    var regEmail = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
    if(!regEmail.test(inputEmail)){
        //alert("邮箱格式不正确!");
        showValidateInfo(emailEle,"error","邮箱格式不正确");
    }else{
        showValidateInfo(emailEle,"ok","");
    }

    if(!regName.test(inputName) || !regEmail.test(inputEmail)){
        return false;
    }
    return true;
}
*/

/* 输入框的后端校验
$("#inputName").change(function(){
    var inputEmpName = this.value;
    $.ajax({
        url:"${APP_PATH}/checkEmp",
        data:"empName="+inputEmpName,
        type:"POST",
        success:function(result){
            if(100 == result.code){
                showValidateInfo("#inputName","ok",result.extend.validateMsg);
                $("#submit_button").attr("ajaxCheckEmpName","success");
            }else{
                showValidateInfo("#inputName","error",result.extend.validateMsg);
                $("#submit_button").attr("ajaxCheckEmpName","error");
            }
        }
    });
});
 */

/* 显示校验信息
function showValidateInfo(ele,status,msg){

    $(ele).parent().removeClass("has-error has-success");
    if("ok" == status){
        $(ele).parent().addClass("has-success");
        $(ele).next("span").text(msg);
    }else{
        $(ele).parent().addClass("has-error");
        $(ele).next("span").text(msg);
    }
}
*/
