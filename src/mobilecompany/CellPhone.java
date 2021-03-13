package mobilecompany;

public abstract class CellPhone {
	public abstract void setRegNo(String regNo);
	
	public abstract String makeCall();
	
	public String getOsName() {
		return "OSName";
	}
}
