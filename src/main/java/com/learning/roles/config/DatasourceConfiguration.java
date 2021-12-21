package com.learning.roles.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Configuration
public class DatasourceConfiguration {

  @Value("${roles_app.datasource.url}")
  private String dataSourceUrl;

  @Value("${roles_app.datasource.password}")
  private String password;

  @Value("${roles_app.datasource.username}")
  private String user;

  @Value("${roles_app.datasource.driver-class-name}")
  private String driver;

  @Bean
  public DataSource dataSource() {
    System.out.println("hola parce");
    System.out.println(this.dataSourceUrl);
    System.out.println(this.driver);
    DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
    dataSourceBuilder.username(this.user);
    dataSourceBuilder.password(this.password);
    dataSourceBuilder.url(this.dataSourceUrl);
    dataSourceBuilder.driverClassName(this.driver);
    return dataSourceBuilder.build();
  }

  @Bean
  public NamedParameterJdbcTemplate namedParameterJdbcTemplate(
    DataSource dataSource
  ) {
    return new NamedParameterJdbcTemplate(dataSource);
  }
}
