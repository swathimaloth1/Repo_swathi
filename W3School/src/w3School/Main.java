package w3School;

public class Main extends Base{

	public static void main(String[] args) throws InterruptedException {
	Base.launch();
//	HTML_forms_page.Firstname();
//	HTML_forms_page.Lastname();
//	HTML_forms_page.Submit();
	
	
	Login_page.username();
	Login_page.password();
	Login_page.login();
	
	Profile_page.profile_page();
	
	}

}
