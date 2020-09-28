package com.qzw.swagger.doc.configuration;

import com.qzw.swagger.doc.SwaggerDoc;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author quziwei
 * @date 2020/09/28
 * @description 自动装配
 */
@EnableConfigurationProperties(SwaggerDocAutoConfigurationProperties.class)
@Configuration
@ConditionalOnWebApplication
public class SwaggerDocAutoConfiguration {
  @Bean
  @ConditionalOnClass(SwaggerDoc.class)
  public SwaggerDoc swaggerDoc(SwaggerDocAutoConfigurationProperties properties) {
    return new SwaggerDoc();
  }

  @Bean
  @ConditionalOnClass(SwaggerDoc.class)
  public Docket docket(SwaggerDocAutoConfigurationProperties properties) {
    return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(apiInfo(properties))
        .select()
        .apis(RequestHandlerSelectors.basePackage(properties.getScanPackage()))
        .paths(PathSelectors.any())
        .build();
  }

  public ApiInfo apiInfo(SwaggerDocAutoConfigurationProperties properties) {
    return new ApiInfoBuilder()
        .title(properties.getTitle())
        .description(properties.getDescription())
        .version(properties.getVersion())
        .termsOfServiceUrl(properties.getTermsOfServiceUrl())
        .build();
  }
}
