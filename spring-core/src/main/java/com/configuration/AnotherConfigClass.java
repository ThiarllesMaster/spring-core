package com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beans.AnotherHelloBean;

@Configuration
public class AnotherConfigClass {

	@Bean(name = "AnotherHelloWorldBean")
	public AnotherHelloBean getBean() {
		return new AnotherHelloBean();
	}
}
