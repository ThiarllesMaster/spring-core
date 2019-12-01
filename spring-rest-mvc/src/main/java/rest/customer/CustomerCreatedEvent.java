package rest.customer;

public class CustomerCreatedEvent {

	private Customer customer;
	
	public CustomerCreatedEvent(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
}
