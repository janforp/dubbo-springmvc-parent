package com.janita.mvc.api.config;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Janita on 2017-04-05 19:24
 */
@Configuration
@EnableWebMvc
@EnableSwagger
@ComponentScan("com.janita.mvc.user.api.controller")
public class SwaggerConfig {

    private SpringSwaggerConfig springSwaggerConfig;

    @Autowired
    public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig){
        this.springSwaggerConfig = springSwaggerConfig;
    }

    @Bean
    public SwaggerSpringMvcPlugin swaggerSpringMvcPlugin(){
        return new SwaggerSpringMvcPlugin(this.springSwaggerConfig).apiInfo(null).includePatterns(".*");
    }

    private ApiInfo apiInfo(){
        return new ApiInfo("Swagger of demo","swagger实例","开发者：Janita","271621154@qq.com","","");
    }
}
