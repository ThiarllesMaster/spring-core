package rest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import rest.customer.Customer;
import rest.customer.CustomerDTO;
import rest.customer.CustomerProjectionService;
import rest.customer.CustomerRepository;
import specification.CustomerSpecification;
import specification.SearchCriteria;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringRestMvcApplication.class)
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
	
	@Test
	public void testSpecification() {
		CustomerSpecification customerSpecification = new CustomerSpecification(new SearchCriteria("name", ":", "Rafinha Gomes"));
		List<Customer> customers = customerRepository.findAll(customerSpecification);
		assertThat(customers.get(0).getName(), equalTo("Rafinha Gomes"));
	}
	
}
