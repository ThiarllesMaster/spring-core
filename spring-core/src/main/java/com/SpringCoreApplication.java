package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import events.EventsConfiguration;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EventsConfiguration.class);
		
		
		ctx.close();
		SpringApplication.run(SpringCoreApplication.class, args);
	}

}
