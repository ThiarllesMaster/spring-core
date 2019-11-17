package rest;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import model.CustomerJson;

class TestCallServices {
	
	private String URL = "http://localhost:8080/customers";

	@SuppressWarnings("unchecked")
	@Test
	void test() {
		RestTemplate restTemplate = new RestTemplate();
		List<CustomerJson> customerJson = restTemplate.getForObject(URL, List.class);
		System.out.println(customerJson.size());
	}

}
