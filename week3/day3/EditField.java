package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class EditField {
public static void main(String[] args) {
	//Download the driver and set the path
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Edit.html");
	driver.manage().window().maximize();
	
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aravind@gmail.com");
	
	
	driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("TestLeaf",Keys.TAB);
	
	
	String attribute = driver.findElement(By.xpath("(//input[@name='username'])[1]")).getAttribute("value");
	System.out.println(attribute);
	
	driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
	
	boolean enabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
	
	System.out.println(enabled);
	
	
	
	//close the browser
	driver.close();
	
	
}
}
