package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser {
public static void main(String[] args) {
	//download the driver and set the path
	WebDriverManager.chromedriver().setup();
	
	//Launch chrome browser
	ChromeDriver driver=new ChromeDriver();
	
	//Load application url
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	//maximize the browser
	driver.manage().window().maximize();
}
}
