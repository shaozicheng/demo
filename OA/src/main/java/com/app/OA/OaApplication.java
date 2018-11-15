package com.app.OA;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.app.OA.AES.anno.EnableEncrypt;



@Configuration
@MapperScan("com.app.OA")
@SpringBootApplication
@EnableCaching
@EnableScheduling
@ServletComponentScan
@EnableEncrypt
public class OaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OaApplication.class, args);
		

	}
	
	
	
}
