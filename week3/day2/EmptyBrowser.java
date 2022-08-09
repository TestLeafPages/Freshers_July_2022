package week3.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmptyBrowser {
public static void main(String[] args) {
	//download the driver and set the path
	//WebDriverManager.chromedriver().setup();
	WebDriverManager.firefoxdriver().setup();
	//Launch chrome browser
	//ChromeDriver  driver=new ChromeDriver();
	FirefoxDriver driver=new FirefoxDriver();
}
}
