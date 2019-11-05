package com.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import com.beans.HelloWorldBean;

@Configuration
@Import(AnotherConfigClass.class)
@PropertySource(value = "classpath:config.properties")
public class HelloWorldConfig {
	
	@Value(value = "${mongodb.url}")
	private String url;
	
	@Bean(name = "HelloWorldBean")
	public HelloWorldBean getBean() {
		return new HelloWorldBean(url);
	}

}
