package com.zjm;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {
    public ServletInitializer() {
      System.out.println("初始化ServletInitializer");
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {  
        return application.sources(MyBaseSpringBootApplication.class);//MyApplication是启动类名
    }  
}
