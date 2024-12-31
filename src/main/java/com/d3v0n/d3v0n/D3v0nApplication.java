package com.d3v0n.d3v0n;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class D3v0nApplication {

	public static void main(String[] args) {
		SpringApplication.run(D3v0nApplication.class, args);
	}

}
