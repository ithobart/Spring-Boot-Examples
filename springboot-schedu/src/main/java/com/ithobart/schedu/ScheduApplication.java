package com.ithobart.schedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ScheduApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScheduApplication.class, args);
	}
}
