package test;

import java.sql.Driver;

import page.BusOffers_page;
import page.Homepage;
import seleniumutilities.Basepage;

public class Logintest extends Basepage{

	public static void main(String[] args) throws InterruptedException {
		Basepage.launch();
		Thread.sleep(2000);
		Homepage.from_action();
		Thread.sleep(2000);
		BusOffers_page.by_action_offers();
		Thread.sleep(2000);
		
		Basepage.WindoweHandling();
		Thread.sleep(2000);
		
		BusOffers_page.from_action();
		Thread.sleep(2000);
		
		BusOffers_page.to_action();
		Thread.sleep(2000);
		
		
		
		

		Homepage.to_action();
		Thread.sleep(2000);

	}

}
