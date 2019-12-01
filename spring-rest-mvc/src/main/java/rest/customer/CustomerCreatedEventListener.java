package rest.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class CustomerCreatedEventListener {
	
	 private static final Logger LOGGER = LoggerFactory.getLogger(CustomerCreatedEventListener.class);
	 
	 private TokenGenerator tokenGenerator;
	 
	 public CustomerCreatedEventListener(TokenGenerator tokenGenerator) {
		this.tokenGenerator = tokenGenerator;
	}
	 
	 @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
	 public void processCustomerCreatedEvent(CustomerCreatedEvent event) {
		 LOGGER.info("Event received: " + event);
	     tokenGenerator.generateToken(event.getCustomer());
	 }

}
