package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		//set the driver path
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//launch chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		
	}

}
