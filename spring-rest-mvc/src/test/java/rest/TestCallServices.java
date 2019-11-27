package rest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import model.CustomerJson;

class TestCallServices {
	
	private String URL = "http://localhost:8081/customers";
	private RestTemplate restTemplate = new RestTemplate();

	
	@SuppressWarnings("unchecked")
	@Test
	void testList() {
		List<CustomerJson> customerJson = restTemplate.getForObject(URL, List.class);
		assertNotNull(customerJson);
	}
	
	@Test
	public void registerCustomer() {
		CustomerJson customerJson = new CustomerJson();
		customerJson.setId("6");
		customerJson.setName("Roger");
		ResponseEntity<CustomerJson> responseEntity = restTemplate.postForEntity(URL, customerJson, CustomerJson.class);
		assertThat(responseEntity.getBody(), equalTo(customerJson));
		
	}

}
