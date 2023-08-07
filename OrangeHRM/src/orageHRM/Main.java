package orageHRM;


public class Main {

	public static void main(String[] args) throws InterruptedException {
		Base.browser();
		Login l = new Login();
		l.username();
		l.password();
		l.loginbutton();
		
		Logout la=new Logout();
		la.logout();
		la.logoutbtn();
		
//		Login.username();
//		Login.password();
//		Login.loginbutton();
	
		                                                                                
}
}