package com.example.texasburgercompany;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableWebSecurity
public class TexasBurgerCompanyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TexasBurgerCompanyApplication.class, args);
    }



}
