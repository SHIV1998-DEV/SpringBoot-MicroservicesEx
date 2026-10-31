package my.app;

public class ViewResolver {

	private String preffix;
	private String suffix;

	public ViewResolver() {
		super();

	}

	public String getPreffix() {
		return preffix;
	}

	public void setPreffix(String preffix) {
		this.preffix = preffix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	@Override
	public String toString() {
		return "ViewResolver [preffix=" + preffix + ", suffix=" + suffix + "]";
	}

}
