package com.qzw.swagger.doc.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author quziwei
 * @date 2020/09/28
 * @description Swagger2配置
 */
@ConfigurationProperties(prefix = "qzw.swagger2.doc")
public class SwaggerDocAutoConfigurationProperties {
  /** 标题 */
  private String title = "Swagger2 Doc";

  /** 作者 */
  private String another = "quziwei";

  /** 文档描述 */
  private String description = "Swagger2 Doc";

  /** 版本号 */
  private String version = "1.0.0";

  /** 设置文档信息 */
  private String termsOfServiceUrl = "https://gitee.com/YueGod/";

  /** 是否开启Swagger */
  private boolean enable = true;

  /** 扫描包路径 */
  private String scanPackage = "com";

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAnother() {
    return another;
  }

  public void setAnother(String another) {
    this.another = another;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getTermsOfServiceUrl() {
    return termsOfServiceUrl;
  }

  public void setTermsOfServiceUrl(String termsOfServiceUrl) {
    this.termsOfServiceUrl = termsOfServiceUrl;
  }

  public boolean isEnable() {
    return enable;
  }

  public void setEnable(boolean enable) {
    this.enable = enable;
  }

  public String getScanPackage() {
    return scanPackage;
  }

  public void setScanPackage(String scanPackage) {
    this.scanPackage = scanPackage;
  }
}
