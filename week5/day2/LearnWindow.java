package week5.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import week3.day1.ChromeBrowser;

public class LearnWindow {
public static void main(String[] args) throws InterruptedException, IOException {
	//download the driver and set the path
	WebDriverManager.chromedriver().setup();
	//launch chrome browser
	ChromeDriver driver=new ChromeDriver();
	//load the application url
	driver.get("https://www.leafground.com/window.xhtml");
	//maximize the browser
	driver.manage().window().maximize();
	
	String parentWindow = driver.getWindowHandle();
	System.out.println(parentWindow);
	WebElement ele = driver.findElement(By.xpath("//span[text()='Open']"));
	File source = ele.getScreenshotAs(OutputType.FILE);
	File dest=new File("./snap/img");
	FileUtils.copyFile(source, dest);
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
//	Set<String> newWindow = driver.getWindowHandles();
//	System.out.println(newWindow.size());
//	
//	List<String> openedWindow=new ArrayList<String>(newWindow);
//	String childWindow = openedWindow.get(1);
//	
//	driver.switchTo().window(childWindow);
//	
//	System.out.println(driver.getTitle());
//	System.out.println(driver.getCurrentUrl());
//	
//	driver.close();
//	
//	//driver.quit();
//	driver.switchTo().window(parentWindow);
//	driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
//	
//	Set<String> secondWindow = driver.getWindowHandles();
//	System.out.println(secondWindow.size());
//	
	
}
}
