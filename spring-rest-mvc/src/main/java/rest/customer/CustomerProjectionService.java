package rest.customer;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class CustomerProjectionService {

	@Autowired
	EntityManager entityManager;
	
	
	public List<CustomerDTO> searchCustomers() {
		List<CustomerDTO> customersDTOs = entityManager.createQuery("select new rest.customer.CustomerDTO (c.name) from Customer c", CustomerDTO.class).getResultList();
		return customersDTOs;
	}
}
