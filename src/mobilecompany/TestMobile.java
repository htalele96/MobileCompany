package mobilecompany;

public class TestMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone smartPhone=new SmartPhone();
		
		System.out.println(smartPhone.getNetworkName());
		System.out.println(smartPhone.getNetworkSpeed());
		
		//CellPhone celsmartPhonelPhone= new SmartPhone();
		System.out.println(smartPhone.makeCall());
	}

}

