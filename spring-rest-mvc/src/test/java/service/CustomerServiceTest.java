package service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import rest.SpringRestMvcApplication;
import rest.customer.Customer;
import rest.customer.CustomerRepository;
import rest.customer.CustomerService;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringRestMvcApplication.class)
public class CustomerServiceTest {

	@Autowired
	private CustomerService customerService;
	@Autowired
	private CustomerRepository customerRepository;

	@Test
	  public void shouldPersistCustomer() throws Exception {
		    //when
		    Customer returnedCustomer = customerService.createCustomer("Rafinha", "rafinha@gmail.com");
		    //then
		    final Customer persistedCustomer = customerRepository.findById(returnedCustomer.getId()).get();
		    assertEquals("rafinha@gmail.com", returnedCustomer.getEmail());
		    assertEquals("Rafinha", returnedCustomer.getName());
		    assertEquals(returnedCustomer, persistedCustomer);
		    assertTrue(returnedCustomer.hasToken());
}
	
	
}
