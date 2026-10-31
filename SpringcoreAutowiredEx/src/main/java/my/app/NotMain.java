package my.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotMain {
	@Autowired(required = false) /* internaliy its take boolan value true */
	private Main name;

	@Override
	public String toString() {
		return "NotMain [name=" + name + "]";
	}

}
