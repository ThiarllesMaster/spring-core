package events;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventsConfiguration {

	@Bean
	public CustomEventPublisher createPublisher() {
		return new CustomEventPublisher();
	}
	
	@Bean
	public CustomEventListener createEventListener() {
		return new CustomEventListener();
	}
	
	@Bean
	public AnotherListener createAnotherListener() {
		return new AnotherListener();
	}
}
