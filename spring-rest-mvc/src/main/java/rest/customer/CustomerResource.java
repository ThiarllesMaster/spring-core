package rest.customer;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerResource {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@PostMapping
	public Customer addCustomer(@Valid @RequestBody Customer customer) {
		return customerRepository.save(customer);
	}
	
	@GetMapping
	public List<Customer> findAll() {
		return (List<Customer>) customerRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Customer> findCustomer(@PathVariable Long id) {
		Optional<Customer> customer = customerRepository.findById(id);
		if (!customer.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(customer.get());
	}

}
