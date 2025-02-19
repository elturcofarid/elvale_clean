package com.onlysystem.elvale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.onlysystem.elvale"})
@SpringBootApplication
public class ElvaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElvaleApplication.class, args);
	}

}
