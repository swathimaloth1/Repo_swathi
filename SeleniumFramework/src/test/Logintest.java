package test;

import page.Loginpage;
import page.Logout;
import seleniumutilities.Base;

public class Logintest 
{
	public static void main(String[] args) throws InterruptedException {
		Base.launch();
		Base.Explicity();
		Loginpage.username_action();
		Loginpage.password_action();
		Loginpage.loginbutton_action();
		Logout.logout_action();
		
		
	}
	
	
	

}
