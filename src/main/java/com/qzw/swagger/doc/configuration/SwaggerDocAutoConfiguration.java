package com.qzw.swagger.doc.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author quziwei
 * @date 2020/09/28
 * @description 自动装配
 */
@EnableConfigurationProperties(SwaggerDocAutoConfigurationProperties.class)
@Configuration
@ConditionalOnWebApplication
public class SwaggerDocAutoConfiguration {

}
