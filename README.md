# SchoolDeal
使用SSM框架开发的校园交易平台

2-18/6/7

1:完成了注册表单的前端js校验和后端ajax重复性校验,前端输入框有改动时及时进行正则校验,正则校验通过后再进行ajax校验,最后提交表单时第三次校验,最后后端再进行简单的空值校验;使用了bootstrap 4版本的输入框组的校验信息回显方式;因为实体类和数据库表可能还有改动所以暂时不使用JSR303校验组件;此次解决的小问题是注册模块的ajax被security拦截了,后来在controller类层级别增加了/register的url,并在security配置文件里增加/register/**的不拦截规则解决了此问题;

2018/6/6

1:修复了商品管理页面上已经选择只显示上架中商品时,点击下架后页面再次动态生成时显示的是全部商品的小bug:现在点击下架或上架或删除按钮时会根据页面上checkbox选择的显示状态来向后端发送对应的url; 

2:不知道什么原因,security的记住我功能突然起了作用,浏览器关闭后cookie一直存在,再次浏览网页不需要登录,但是重新部署项目后又会需要再登录一次;并且登录成功后会自动跳转到用户想浏览而拦截的页面,而不是在配置文件中指定的固定页面;

3:数据库中新增了角色表和角色至本地帐户的关联表,并再次利用mybatis生成了实体类了Mapper文件;

4:增加了注册账号的功能,在注册账号时会同时注册本地账号和用户信息以及绑定普通用户的角色,使用了mybatis的insert返回主键的功能,注意此功能在Mapper里配置完之后还需要在方法里使用实体类的get方法才能取回主键值,insert语句返回的只能是受影响的行数;


2018/6/5 

1:将数据连接配置文件的账号密码字段改用了DES64加密方式,使用的org.apache.commons.codec组件,不推荐使用sun.misc下的工具;这次开发中解决的问题:在选择BASE64类时,网上大多数教程是采用sun.misc下的base64类,而此类是sun公司不推荐使用的,并且在后续jdk版本中会移除,所以更换成了apache的工具类下的base64;
         
2:完善了商品的上架下架功能,并且可以在页面上选择切换要显示的商品状态,可选择显示上架中的商品或者下架中的商品;同时发现日志记录组件似乎自5月27日之后就不工作了;
         
3:实现了security从数据库中获取账号密码及角色信息;存在的待处理问题是security登录验证成功后不会往session里写入账号数据,需要实现一个自定义的控制类实现网session里写入账号拥有的店铺id以便后面的网页实现查询店铺信息;同时security的记住我功能已经生成了cookie,但是不知道怎么实现下次读取cookie自动登录;另外下次会将security读取数据库的信息加密,提高安全性;


2018/6/3 

1.解决了bootstrap 4 版本不支持字体图标的文件问题,主要方法就是将3版本中bootstrap.min.css里有关font-face字体和glyphicon图标的css复制过来并将font文件夹拷贝过来;
         
2.整合了security权限管理组件,已测试成功,遇到的问题是似乎我的组件不能自动往session里写入登录用户的信息,导致一直跳登录界面,需要验证角色的链接一直被拦截,后来自定义了一个controller往session里写入了登录表单的用户名和密码才解决这个问题,而从网上搜索到的教程则是自动写入的,我的配置文件开启了自动配置但是似乎并没有自动配置,并且测试security也不会自动生成登录表单,但是配置文件中的其它标签配置生效了,证明了此配置文件是已经被容器加载了的;    

2018/6/2 

优化了一下前端的页面和js代码,将页面上重复利用的布局部分抽取出来使用jsp的动态引入利用,之后发现从html改成jsp页面后文档没有声明导致布局有点错乱,需要在文档<html>标签上面一行添加声明<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">,注意此声明里的dtd其实是html而不是jsp的;

2018/5/31 

完成了商品添加和删除 分类添加和编辑,实现了商品图片上传后保存在本地磁盘,防止项目重新部署时图片丢失的问题:
            
            通过修改tomcat文件,在server.xml的<Host >          
            </Host>中间添加下面一句话
            <Context path="/dataResourceImages" docBase="D:\" crossContext="true" reloadable="true" debug="0"></Context>  
            其中path为虚拟路径，  docBase是真实路径
            设置之后就可以用<img src="/dataResourceImages/image.jpg">代替上面的真实路径了【注意：src中使用/而不是\】
            步骤二：配置完server.xml文件之后，启动tomcat会发现在浏览器中依然无法访问到这个图片，原因是还需要在eclipse编译器中修改server的Web Modules。
            双击tomcat进入配置页面，点击Modules进入Web Modules页面点击第二个选项把相应的虚拟路径和真实路径也添加进去：
            以上两部分都配置完成之后，重启服务器就可以在浏览器上显示出期待已久的图片了。

2018/5/30 

完成了商品编辑页面和后端,并且商品页面预留了几个小功能等待以后完善,实现了两种不同的显示风格,重点练习了在js文件中的父元素与子元素及同辈元素之间的索引查找操作,对于通过ajax在文档加载完之后动态生成的元素的选择和绑定事件有了进一步的了解;

2018/5/29 

完成了注册店铺页面的前端和后端:

此次遇到的问题:

1.浏览器控制台提示$.ajax 不是一个方法;问题的原因是前端页面引进的js文件是不带ajax功能的slim版,换成min版就可以解决;

2.ajax使用post和formData提交multipart/form-data数据到后台,后台getParameter取不到值;原因在容器中没有multipartResolver来解析浏览器传过来的请求体,我在spingMVC的配置文件里配置好bean标签之后忘了设置id属性,导致bean没有被扫描进容器;

3.thumbnail无法将request里inputStream流写出成文件;原因在于没有正确的在此之前使用New File(str)建立文件连接,thumbnail.toFile()里最好是传一个文件连接而不是URI地址,并且在toFile方法之前先设置size(),最终能成功的语句是Thumbnails.of(shopImgInputStream).size(200,200).toFile(file);其它的语句经测试都写出失败;

4.实体类中使用Integer,导致转换手机号码时报错;因为手机号码已经超出了Integer范围,使用Long才符合规范;

2018/5/27 

完成了添加店铺的service层功能:

此次开发中解决的问题:

1.Junit单元测试模块的使用;

2.数据库更新外键时需要与相关联的表保持字段结构的一致,并且外键的值必须要在关联表中已经存在,否则无法插入;

3.mybatis里面有一个配置属性defaultExecutorType，当这个值为BATCH时， 所有mapper类的方法的返回结果就只有-2147482646 这一个值。defaultExecutorType一共有三个值：BATCH, REUSE, SIMPLE。这三个值分别的特点如下：
  
      名称           描述
      
      SIMPLE        执行器执行其它语句，默认值。
        
      REUSE         可能重复使用prepared statements 语句
      
      BATCH         可以重复执行语句和批量更新    

  
  
而解决以上问题的方法就是可以将defaultExecutorType的值改成SIMPLE或REUSE，或者直接删除该配置就可以了。 
之后执行Mapper文件的方法时就能正确的返回数据库中受影响的行数;

4.使用mybatis的生成器后,如果移动了Mapper文件和实体类,则需要在所有有关联的文件中重新修改引用位置,否则项目启动会报找不到Mapper文件和实体类的错误;  

2018/5/26 

创建项目:
暂停了另一个微博项目的开发,初步搭建好了此项目的框架和数据库的构建;
