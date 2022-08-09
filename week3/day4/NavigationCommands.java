package week3.day4;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import week3.day1.ChromeBrowser;

public class NavigationCommands {
public static void main(String[] args) throws InterruptedException {
	//download the driver and set the path
	WebDriverManager.chromedriver().setup();
	//Launch the browser
	ChromeDriver driver=new ChromeDriver();
	//load the url
	driver.get("http://leaftaps.com/opentaps/control/main");
	//maximize the browser
	driver.manage().window().maximize();
	//navigate the url
	driver.navigate().to("https://www.facebook.com/");
	
	
	Thread.sleep(5000);
	driver.navigate().back();
	
	Thread.sleep(5000);
	driver.navigate().forward();
	
	Thread.sleep(5000);
	driver.navigate().refresh();
	
}
}
