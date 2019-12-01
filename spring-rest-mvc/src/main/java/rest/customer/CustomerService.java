package rest.customer;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService {

	private CustomerRepository repository;
	private ApplicationEventPublisher applicationEventPublisher;
	
	public CustomerService(CustomerRepository repository, ApplicationEventPublisher applicationEventPublisher) {
		this.repository = repository;
		this.applicationEventPublisher = applicationEventPublisher;
	}
	
	@Transactional
	public Customer createCustomer(String name, String email) {
		Customer customer = new Customer(name, email);
		CustomerCreatedEvent event = new CustomerCreatedEvent(customer);
		applicationEventPublisher.publishEvent(event);
		return repository.save(customer);
	}
	
	
}
