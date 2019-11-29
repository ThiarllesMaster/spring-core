package events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CustomEventPublisher {

	@Autowired
	private ApplicationEventPublisher eventPublisher;
	
	public void doStuff(String message) {
		CustomSpringEvent springEvent = new CustomSpringEvent(this, message);
		eventPublisher.publishEvent(springEvent);
	}
}
