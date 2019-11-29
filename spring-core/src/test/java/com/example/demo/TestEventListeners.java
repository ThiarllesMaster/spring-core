package com.example.demo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.SpringCoreApplication;

import events.CustomEventPublisher;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringCoreApplication.class)
public class TestEventListeners {

	@Autowired
	private CustomEventPublisher eventPublisher;
	
	@Test
	public void publishEvent() {
		eventPublisher.doStuff("Cruzeiro será rebaixado");
	}
}
