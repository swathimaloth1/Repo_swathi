package orageHRM;


public class Main {

	public static void main(String[] args) throws InterruptedException {
		Base.browser();
		Login l = new Login();
		l.username();
		l.password();
		l.loginbutton();
//		Login.username();
//		Login.password();
//		Login.loginbutton();
		Thread.sleep(2000);
		
		Logout.logoutbtn();
		Thread.sleep(2000);
		
		Logout.logout();
		
		
   

	
	
	
	
	
}
}