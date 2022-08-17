package week5.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import week3.day1.ChromeBrowser;

public class IRCTC {
public static void main(String[] args) throws InterruptedException {
	//download the driver and set the path
	WebDriverManager.chromedriver().setup();
	//launch chrome browser
	ChromeDriver driver=new ChromeDriver();
	//load the application url
	driver.get("https://www.irctc.co.in/nget/train-search");
	//maximize the browser
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[text()='OK']")).click();
	
	driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
	
	String title = driver.getTitle();
	System.out.println(title);
}
}
