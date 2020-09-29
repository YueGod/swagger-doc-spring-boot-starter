package com.qzw.swagger.doc.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author quziwei
 * @date 2020/09/28
 * @description Swagger2配置
 */
@ConfigurationProperties(prefix = "qzw.swagger2.doc")
public class SwaggerDocAutoConfigurationProperties {
  /** title */
  private String title = "Swagger2 Doc";

  /** another */
  private String another = "quziwei";

  /** description */
    private String description = "Swagger2 Doc";

  /** version */
  private String version = "1.0.0";

  /** termsOfServiceUrl */
  private String termsOfServiceUrl = "https://gitee.com/YueGod/";

  /** enable or disable */
  private boolean enable = true;

  /** scan package path */
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
