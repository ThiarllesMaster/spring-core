package com.beans;

public class HelloWorldBean {
	
	private String value;
	
	public HelloWorldBean(String value) {
		this.value = value;
	}

	public String helloWorld() {
		return "Hello World, the value config=" + value;
	}
}
