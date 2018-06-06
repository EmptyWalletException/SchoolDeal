/*
* 自定义的js代码,用于实现前后端之间的功能交互
*
* */



/*点击按钮注册店铺的事件*/
$("#submit_RegisterUser").click(function(){
    /* 检查输入框是否符合正则表达式 */
    if (!validateInput("#username","#password","#petname","#submit_RegisterUser","#email")) {
        return false;
    }

    /* 检查ajax校验用户名是否可用后的标记 */
    if($(this).attr("ajaxCheckUsername") == "error" || $(this).attr("ajaxCheckPetname") == "error"){
        return false;
    }

    /*因为涉及到文件的处理,无法直接用form封装到pojo中,所以先使用js代码来封装数据
    * 这里采用本地账号和用户信息同时注册的方式,需要用到两个pojo封装*/
    var localAuth={};
        localAuth.username = $("#username").val();
        localAuth.password= $("#password").val();

    var personInfo ={};
        personInfo.name=$("#petname").val();
        personInfo.email=$("#email").val();
        personInfo.gender=$("input:checked").val();


    var formData = new FormData();
    formData.append("localAuth",JSON.stringify(localAuth));
    formData.append("personInfo",JSON.stringify(personInfo));

    $.ajax({
        url:"/register/registerUser",
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


/* 抽取出来的输入框的前端校验 */
function validateInput(usernameEle,passwordEle,petnameEle,ajaxEle,emailEle){

    // 验证用户账号  /^[a-z0-9_-]{5,15}$/
    var inputUsername = $(usernameEle).val();
    var regUserName = /(^[a-z0-9_-]{5,15}$)/;
    //alert(!regName.test(inputName));
    //先检查ajax校验用户名的结果,ajax通过后再进一步检查
    if($(ajaxEle).attr("ajaxCheckUsername") != "error"){
        if(!regUserName.test(inputUsername)){
            //alert("用户名格式不正确,请输入2~10位字符,只能出现数字或英文或汉字的组合!");
            showValidateInfo(usernameEle,"error","用户名格式不正确,请输入2~10位字符,只能出现数字或英文或汉字的组合!");
        }else{
            showValidateInfo(usernameEle,"ok","");
        }
    }

    // 验证用户密码  /^[a-z0-9_-]{5,15}$/
    var inputPassword = $(passwordEle).val();
    var regPassword = /(^[a-z0-9_-]{5,15}$)/;
    //alert(!regName.test(inputName));
    if(!regPassword.test(inputPassword)){
        //alert("用户名格式不正确,请输入2~10位字符,只能出现数字或英文或汉字的组合!");
        showValidateInfo(passwordEle,"error","用户名格式不正确,请输入2~10位字符,只能出现数字或英文或汉字的组合!");
    }else{
        showValidateInfo(passwordEle,"ok","");
    }


    // 验证用户昵称  /^[a-z0-9_-]{2,10}$)|(^[\u2E80-\u9FFF]{2,10}/
    var inputPetName = $(petnameEle).val();
    var regPetName = /(^[a-z0-9_-]{2,10}$)|(^[\u2E80-\u9FFF]{2,10})/;
    //alert(!regName.test(inputName));
    //先检查ajax校验用户名的结果,ajax通过后再进一步检查
    if($(ajaxEle).attr("ajaxCheckPetname") != "error"){
        if(!regPetName.test(inputPetName)){
            //alert("用户名格式不正确,请输入2~10位字符,只能出现数字或英文或汉字的组合!");
            showValidateInfo(petnameEle,"error","用户名格式不正确,请输入2~10位字符,只能出现数字或英文或汉字的组合!");
        }else{
            showValidateInfo(petnameEle,"ok","");
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

    //再次判断是否能通过前端校验,以上的校验只是为了显示错误信息,不能中途return,否则会影响用户体验;
    if(!regUserName.test(inputUsername) || !regPassword.test(inputPassword) || !regPetName.test(inputPetName) || !regEmail.test(inputEmail)){
        return false;
    }
    return true;
}






/* 显示校验信息*/
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

/* ajax用户账号输入框的后端校验*/
$("#username").change(function(){
    var inputValue = $(this).val();
    $.ajax({
        url:"/register/checkUsername",
        data:"inputValue="+inputValue,
        type:"POST",
        success:function(result){
            if(100 == result.code){
                showValidateInfo("#username","ok",result.msg);
                //在按钮上添加一个信息,用于判断是否通过校验,从而决定能否提交表单;
                $("#submit_RegisterUser").attr("ajaxCheckUsername","success");
            }else{
                showValidateInfo("#username","error",result.msg);
                $("#submit_RegisterUser").attr("ajaxCheckUsername","error");
            }
        }
    });
});

/* ajax用户昵称输入框的后端校验*/
$("#petname").change(function(){
    var inputValue = $(this).val();
    $.ajax({
        url:"/register/checkPetname",
        data:"inputValue="+inputValue,
        type:"POST",
        success:function(result){
            if(100 == result.code){
                showValidateInfo("#petname","ok",result.msg);
                $("#submit_RegisterUser").attr("ajaxCheckPetname","success");
            }else{
                showValidateInfo("#petname","error",result.msg);
                $("#submit_RegisterUser").attr("ajaxCheckPetname","error");
            }
        }
    });
});


