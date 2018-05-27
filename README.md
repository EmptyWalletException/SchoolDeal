# SchoolDeal
使用SSM框架开发的校园交易平台

2018/5/27 完成了添加店铺的service层功能:
此次开发中解决的问题:
1.Junit单元测试模块的使用;
2.数据库更新外键时需要与相关联的表保持字段结构的一致,并且外键的值必须要在关联表中已经存在,否则无法插入;
3.mybatis里面有一个配置属性defaultExecutorType，当这个值为BATCH时， 所有mapper类的方法的返回结果就只有-2147482646 这一个值。defaultExecutorType一共有三个值：BATCH, REUSE, SIMPLE。这三个值分别的特点如下：
  
  名称         描述
  SIMPLE     执行器执行其它语句，默认值。
  REUSE     可能重复使用prepared statements 语句
  BATCH     可以重复执行语句和批量更新    
  
而解决以上问题的方法就是可以将defaultExecutorType的值改成SIMPLE或REUSE，或者直接删除该配置就可以了。 
之后执行Mapper文件的方法时就能正确的返回数据库中受影响的行数;
4.使用mybatis的生成器后,如果移动了Mapper文件和实体类,则需要在所有有关联的文件中重新修改引用位置,否则项目启动会报找不到Mapper文件和实体类的错误;  

2018/5/26 创建项目:
暂停了另一个微博项目的开发,初步搭建好了此项目的框架和数据库的构建;
