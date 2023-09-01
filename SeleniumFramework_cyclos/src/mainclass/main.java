package mainclass;


import test.Logintest;

public class main {

	public static void main(String[] args) throws InterruptedException {
	
		Logintest.valid_credentials();
	
		Logintest.invalid_credentials();
		Logintest.invalidusername_validpassword();
		Logintest.validuasename_invalidpassword();
		Logintest.validuasername_blankpassword();
		Logintest.blankuasername_validpassword();
		Logintest.blankuasername_blankpassword();
		
		
		
	} 

}
