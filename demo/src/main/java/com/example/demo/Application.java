
 package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.example.demo.AES.anno.EnableEncrypt;


@Configuration
@MapperScan("com.example.demo")
@SpringBootApplication
@EnableScheduling
@EnableEncrypt
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
