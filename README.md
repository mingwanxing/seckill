# seckill
使用 springboot 简单实现了 秒杀系统

项目设计
```
 .
 ├── README  -- Doc文档
 ├── mvnw  
 ├── mvnw.cmd
 ├── pom.xml  -- 项目依赖
 ├── src
   ├── main
   │   ├── java
   │   │   └── cn
   │   │       └── mingwangxin
   │   │           └── seckill
   │   │               ├── service   -- 业务层           
   │   │               ├── controller -- MVC的web层
   │   │               ├── dto -- 统一封装的一些结果属性，和entity类似
   │   │               ├── entity -- 实体类
   │   │               ├── enums  -- 手动定义的字典枚举参数
   │   │               ├── exception  -- 统一的异常结果
   │   │               ├── mapper -- Mybatis-Mapper层映射接口
   │   │               └── redis -- redis,jedis 相关配置
   │   └── resources
   │        ├── application.propertes  -- SpringBoot核心配置
   │       ├── cn
   │       │   └── mingwangxin
   │       │       └── seckill
   │       │           └── mapper -- Mybatis-Mapper层XML映射文件
   │       ├── static -- 存放页面静态资源，可通过浏览器直接访问
   │       │   ├── css  
   │       │   ├── js
   │       │   └── lib
   │       │       └── font
   │       │           ├── css
   │       │           ├── fonts
   │       │           └── icon
   │       └── templates -- 存放Thymeleaf模板引擎所需的HTML，不能在浏览器直接访问
   │           ├── page
   │           └── public
   └── test -- 测试文件
    ``` 

