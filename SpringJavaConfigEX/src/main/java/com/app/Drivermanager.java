package com.app;

public class Drivermanager {
	
	private String DriverName;
	private String Url;
	
	public String getDriverName() {
		return DriverName;
	}

	@Override
	public String toString() {
		return "Drivermanager [DriverName=" + DriverName + ", Url=" + Url + "]";
	}

	public void setDriverName(String driverName) {
		DriverName = driverName;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

	public Drivermanager() {
		super();
	}
	

}
