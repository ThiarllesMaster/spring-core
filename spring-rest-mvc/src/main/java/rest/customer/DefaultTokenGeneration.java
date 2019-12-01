package rest.customer;

import org.springframework.stereotype.Service;

@Service
public class DefaultTokenGeneration {

	private CustomerRepository repository;
	
	public DefaultTokenGeneration(CustomerRepository repository) {
		this.repository = repository;
	}
}
