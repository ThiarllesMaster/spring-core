package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.SpringCoreApplication;

import events.CustomEventPublisher;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringCoreApplication.class)
class SpringCoreApplicationTests {
	
	@Autowired
	private CustomEventPublisher eventPublisher;

	@Test
	void contextLoads() {
		eventPublisher.doStuff("Cruzeiro sera rebaixado");
	}

}
