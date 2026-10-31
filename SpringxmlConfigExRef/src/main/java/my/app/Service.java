package my.app;

public class Service {
	
	Repositery repo;

	public Service() {
		super();
	}

	public Repositery getRepo() {
		return repo;
	}

	public void setRepo(Repositery repo) {
		this.repo = repo;
	}

	@Override
	public String toString() {
		return "Service [repo=" + repo + "]";
	}
	
	

}
