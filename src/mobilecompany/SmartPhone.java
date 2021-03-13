package mobilecompany;

public class SmartPhone extends CellPhone implements ThreeGNework, FourGNetwork {
 
	private String regNo;
	
	@Override
	public String getNetworkSpeed() {
		// TODO Auto-generated method stub
		return "5mbps";
	}

	@Override
	public String getNetworkName() {
		// TODO Auto-generated method stub
		return "Jio";
	}

	@Override
	public void setRegNo(String regNo) {
		// TODO Auto-generated method stub
		this.regNo=regNo;
	}

	@Override
	public String makeCall() {
		// TODO Auto-generated method stub
		return "Dialing 1234";
	}
	
}
