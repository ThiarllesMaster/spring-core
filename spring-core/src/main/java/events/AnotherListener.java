package events;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnotherListener {

	@EventListener
	public void anotherListener(CustomSpringEvent event) {
		System.out.println("Another Listener");
	}
}
