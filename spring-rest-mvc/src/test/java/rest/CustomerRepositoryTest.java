package rest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import rest.customer.Customer;
import rest.customer.CustomerDTO;
import rest.customer.CustomerProjectionService;
import rest.customer.CustomerRepository;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class CustomerRepositoryTest {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CustomerProjectionService customerProjectionService;
	
	@Test
	public void findUser() {
		Customer customer = customerRepository.findById(1L).orElse(null);
		assertThat(customer.getName(), equalTo("Rafinha Gomes"));
	}
	
	@Test
	public void listDtos() {
		List<CustomerDTO> list = customerProjectionService.searchCustomers();
		System.out.println(list);
	}
}
