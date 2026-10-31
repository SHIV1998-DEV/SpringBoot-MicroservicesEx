package my.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Con")
public class Confurigation {
	@Value("${DB1.A}")
	private String id1;
	@Value("${DB2.B}")
	private String id2;
	@Value("${DB3.C}")
	private String id3;
	@Value("${DB4.D}")
	private String id4;
	@Value("${DB5.E}")
	private String id5;
	@Value("${DB6.F}")
	private String id6;
	@Override
	public String toString() {
		return "Confurigation [id1=" + id1 + ", id2=" + id2 + ", id3=" + id3 + ", id4=" + id4 + ", id5=" + id5
				+ ", id6=" + id6 + "]";
	}

}
