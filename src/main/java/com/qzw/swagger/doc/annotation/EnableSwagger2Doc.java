package com.qzw.swagger.doc.annotation;

import com.qzw.swagger.doc.configuration.SwaggerDocAutoConfiguration;
import org.springframework.context.annotation.Import;

/**
 * @author quziwei
 * @date 2020/09/28
 * @description
 */
@Import(SwaggerDocAutoConfiguration.class)
public @interface EnableSwagger2Doc {}
