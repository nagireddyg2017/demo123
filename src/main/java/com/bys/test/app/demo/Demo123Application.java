package com.bys.test.app.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Demo123Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo123Application.class, args);
	}

}
