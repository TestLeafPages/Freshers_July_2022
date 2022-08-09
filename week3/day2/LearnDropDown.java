package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import week3.day1.ChromeBrowser;

public class LearnDropDown {
public static void main(String[] args) {
	//download the driver and set the path
	WebDriverManager.chromedriver().setup();
	//Launch chrome driver
	ChromeDriver driver=new ChromeDriver();
	//load url
	driver.get("http://www.leafground.com/pages/Dropdown.html");
	//maximize the browser
	driver.manage().window().maximize();
	
	
	WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
	Select dd1=new Select(dropDown1);
	dd1.selectByVisibleText("Appium");
	
	WebElement dropDown3 = driver.findElement(By.id("dropdown3"));
	Select dd3=new Select(dropDown3);
	dd3.selectByIndex(1);
	
	//multilingual application use selectByValue
	// selectByVisibleText-- text
	//selectByIndex --- random
	
	
	
	
	
	
}
}
