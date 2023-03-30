package com.othyagocarvalho;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

  @Bean(name = "appricationName")
  public String appricationName() {
    return "Sistema de Vendas";
  }

}
