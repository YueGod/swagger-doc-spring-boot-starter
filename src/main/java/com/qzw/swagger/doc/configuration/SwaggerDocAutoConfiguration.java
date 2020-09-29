package com.qzw.swagger.doc.configuration;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.util.StringUtils;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.configuration.Swagger2DocumentationConfiguration;



/**
 * @author quziwei
 * @date 2020/09/28
 * @description auto configuration
 */
@EnableConfigurationProperties({SwaggerDocAutoConfigurationProperties.class})
@Configuration
@AutoConfigureAfter({
  WebMvcAutoConfiguration.class,
  JacksonAutoConfiguration.class,
  HttpMessageConvertersAutoConfiguration.class,
  RepositoryRestMvcAutoConfiguration.class
})
@Import(Swagger2DocumentationConfiguration.class)
@ConditionalOnProperty(
    name = "enable",
    prefix = "qzw.swagger2.doc",
    havingValue = "true",
    matchIfMissing = true)
public class SwaggerDocAutoConfiguration {

  @Bean
  @ConditionalOnClass(Swagger2DocumentationConfiguration.class)
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

  private String fixup(String swaggerBaseUrl) {
    if (StringUtils.isEmpty(swaggerBaseUrl)) {
      swaggerBaseUrl = "";
    }
    return StringUtils.trimTrailingCharacter(swaggerBaseUrl, '/');
  }
}
