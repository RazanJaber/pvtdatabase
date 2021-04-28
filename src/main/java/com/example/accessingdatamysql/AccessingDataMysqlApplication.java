package com.example.accessingdatamysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class AccessingDataMysqlApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataMysqlApplication.class, args);
	}
	
	 @Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(AccessingDataMysqlApplication.class);
	 }

	 
	 @GetMapping("/hello")
		public String hello(@RequestParam(value = "name", defaultValue = "application") String name) {
			return String.format("Hello %s", name);
	 }
	

}
