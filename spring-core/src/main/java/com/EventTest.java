package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import events.CustomEventPublisher;
import events.EventsConfiguration;

public class EventTest {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EventsConfiguration.class);
		CustomEventPublisher eventPublisher = ctx.getBean(CustomEventPublisher.class);
		eventPublisher.doStuff("The event being published...");
		ctx.close();

		
	}

}
