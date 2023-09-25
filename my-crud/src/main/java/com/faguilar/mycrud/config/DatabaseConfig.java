package com.faguilar.mycrud.config;


import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

   @Bean
   @ConfigurationProperties("crud.datasource.tomcat")
   public DataSource dataSource(){
      final HikariDataSource ds = (HikariDataSource) DataSourceBuilder.create().build();
      ds.setConnectionTestQuery("select 1");
      return ds;
   }

}
