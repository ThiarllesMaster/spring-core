package rest.customer;

import org.springframework.stereotype.Service;

@Service
public interface TokenGenerator {
	
	void generateToken(Customer customer);

}
