package com.globomantics.employee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
//@EnableWebMvc
//@Import(SpringDataRestConfiguration.class)
//@Import({SpringDataRestConfiguration.class, BeanValidatorPluginsConfiguration.class})
public class ApplicationSwaggerConfig {

	@Bean
	public Docket employeeApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build()
                .apiInfo(getApiInfo());
	}

    private ApiInfo getApiInfo() {
        return new ApiInfoBuilder()
                .title("Employee API")
                .version("1.0")
                .description("API for managing employees.")
                .contact(new Contact("Ousama EL IDRISSI", "http://globomantics.com", "oelidrissi@globomantics.com"))
                .license("Apache License Version 2.0")
                .build();
    }
}