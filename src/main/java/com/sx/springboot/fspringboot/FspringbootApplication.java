package com.sx.springboot.fspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot的启动main
 */

@SpringBootApplication
public class FspringbootApplication {

	public static void main(String[] args) {
//		启动了springboot程序,启动spring容器,启动内嵌的tomcat
		SpringApplication.run(FspringbootApplication.class, args);
	}
}
