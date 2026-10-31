package my.app;

public class Controller {
	
	Service Sob;

	public Controller() {
		super();
	}

	public Service getSob() {
		return Sob;
	}

	public void setSob(Service sob) {
		Sob = sob;
	}

	@Override
	public String toString() {
		return "Controller [Sob=" + Sob + "]";
	}
	
	

}
