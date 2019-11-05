package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.AnotherHelloBean;
import com.beans.HelloWorldBean;
import com.configuration.HelloWorldConfig;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorldBean bean = (HelloWorldBean) ctx.getBean("HelloWorldBean");
		AnotherHelloBean anotherBean = (AnotherHelloBean) ctx.getBean("AnotherHelloWorldBean");
		System.out.println(bean.helloWorld());
		System.out.println(anotherBean.getAnotherBean());
		SpringApplication.run(SpringCoreApplication.class, args);
	}

}
