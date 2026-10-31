package my.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Main {
	@Value("SHIVRAJ")
	private String Name;

	@Override
	public String toString() {
		return "Main [Name=" + Name + "]";
	}

}
