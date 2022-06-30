package com.example.mentormenteewebsite;


import org.springframework.web.servlet.config.annotation.*;


//@Configuration
//@EnableSwagger2
public class SwaggerConfig extends WebMvcConfigurationSupport  {
    /*@Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.mentormenteewebsite"))
                .paths(PathSelectors.any())
                .build();

    }
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }*/
}