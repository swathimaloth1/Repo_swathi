package w3School;

public class Main extends Base{

	public static void main(String[] args) throws InterruptedException {
	Base.launch();
//	HTML_forms_page.Firstname_action();
//	HTML_forms_page.Lastname_action();
//	HTML_forms_page.Submit_action();
	
	
	Login_page.username_action();
	Login_page.password_action();
	Login_page.login_action();
	Thread.sleep(4000);
    Profile_page.iframe();
    Thread.sleep(2000);
	Profile_page.profile_page();
	
	}

}
