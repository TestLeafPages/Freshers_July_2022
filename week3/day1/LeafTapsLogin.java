package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsLogin {
public static void main(String[] args) {
	//download the driver and set the path
	WebDriverManager.chromedriver().setup();
	//Launch chrome browser
	ChromeDriver  driver=new ChromeDriver();
	//load application url
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	//maximize the browser
	driver.manage().window().maximize();
	
	//enter the Username as demosalesmanager
	driver.findElement(By.id("username123")).sendKeys("Demosalesmanager");
	//enter the password as crmsfa
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	//click login button
	driver.findElement(By.className("decorativeSubmit")).click();
	
	
	String text = driver.findElement(By.tagName("h2")).getText();
	System.out.println(text);
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	
}
}
