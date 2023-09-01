package mainclass;

import page.Basepage;
import test.Logintest;
import test.Profiletest;


public class Main {
	public static void main(String[] args) throws InterruptedException {
		Basepage.launch();
		Logintest.valid_credentials();
		Profiletest.profile();
	}

}
