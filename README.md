#### 使用方法

1.引入包

```
    <dependencies>
        <dependency>
            <groupId>io.github.yuegod.starter.swagger</groupId>
            <artifactId>swagger-doc-spring-boot-starter</artifactId>
            <version>2.9.2</version>
        </dependency>
    </dependencies>
```
2.配置文件属性。 
注意，以下配置不是必须。Swagger2Doc默认是开启状态

```
//API标题
qzw.swagger2.doc.title=Demo Api
//API作何
qzw.swagger2.doc.another=quziwei
//API描述
qzw.swagger2.doc.description=Demo Project
//APi版本
qzw.swagger2.doc.version=1.0
//链接
qzw.swagger2.doc.termsOfServiceUrl=https://gitee.com/YueGod/
//是否开启
qzw.swagger2.doc.enable=true
//需要扫描的包路径
qzw.swagger2.doc.scanPackage=com
```
