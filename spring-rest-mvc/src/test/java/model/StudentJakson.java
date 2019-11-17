package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentJakson {

	@JsonProperty
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
