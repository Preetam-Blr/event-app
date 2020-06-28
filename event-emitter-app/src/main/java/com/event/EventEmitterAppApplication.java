package com.event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class EventEmitterAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventEmitterAppApplication.class, args);
	}

}
