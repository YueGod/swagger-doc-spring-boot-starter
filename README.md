#### 使用方法
1.mvn install源码

```
mvn install
```
2.引入包

```
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>com.qzw.starter.swagger</groupId>
            <artifactId>swagger-doc-spring-boot-starter</artifactId>
            <version>2.9.2</version>
        </dependency>
    </dependencies>
```
3.配置文件属性

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
