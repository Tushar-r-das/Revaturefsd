package test;

import java.util.Scanner;

class InvalidCodeException extends Exception {
	InvalidCodeException(String msg){
		super(msg);
	}
	}
class Repository1{
	public static String getCountryName(String countryCode) throws InvalidCodeException{ 
		String country = null;
		int cc= Integer.parseInt(countryCode);
		if(cc >= 70 && cc <= 99)
			country = "India";
		else if (cc==908)
			country ="US";
		else if (countryCode.equals("011"))
			country = "Dial somewhere outside of USA";
		else
		{
			try {
				throw new InvalidCodeException("Enter  a  validcode");
			}
			catch (InvalidCodeException e) {
				country = "No country with the given code ";
			}
			}
		return country;
		}
		

//70 to 99  -India
//908 = US

//011      -Dial somewhere outside of USA 

// No country with given code found
		;
		
	
 }
	


public  class Repository {
	
	public static void main(String[] args)throws InvalidCodeException {
		Repository1 r=new Repository1();
		System.out.println("Enter Code Buddy");
		Scanner sc = new Scanner(System.in);
		String countryCode =sc.nextLine();
		System.out.println("country code between 70 to 90 "+ "  " + r.getCountryName(countryCode) );
		System.out.println("country code of 908"+ "  " + r.getCountryName(countryCode) );
		System.out.println(r.getCountryName(countryCode));
		System.out.println(r.getCountryName(countryCode));
	
	}
}



