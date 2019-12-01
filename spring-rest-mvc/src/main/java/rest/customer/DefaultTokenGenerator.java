package rest.customer;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DefaultTokenGenerator implements TokenGenerator {
    private final CustomerRepository customerRepository;
    public DefaultTokenGenerator(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void generateToken(Customer customer) {
        final String token = String.valueOf(customer.hashCode());
        customer.activatedWith(token);
        customerRepository.save(customer);
    }
}