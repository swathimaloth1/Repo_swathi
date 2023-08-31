package mainclass;

import seleniumutilities.Implicitwait;
import test.Logintest;

public class main {

	public static void main(String[] args) throws InterruptedException {
		Implicitwait.implicitwait();
		Logintest.valid_credentials();
	
		Logintest.invalid_credentials();
		Logintest.invalidusername_validpassword();
		Logintest.validuasename_invalidpassword();
		Logintest.validuasername_blankpassword();
		Logintest.blankuasername_validpassword();
		Logintest.blankuasername_blankpassword();
		
		
		
	} 

}
