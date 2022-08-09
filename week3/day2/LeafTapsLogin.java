package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsLogin {
public static void main(String[] args) throws InterruptedException {
	//download the driver and set the path
	WebDriverManager.chromedriver().setup();
	//Launch chrome browser
	ChromeDriver  driver=new ChromeDriver();
	//load application url
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	//maximize the browser
	driver.manage().window().maximize();
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//enter the Username as demosalesmanager
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	Thread.sleep(5000);
	//enter the password as crmsfa
	Thread.sleep(5000);
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	//click login button
	Thread.sleep(5000);
	driver.findElement(By.className("decorativeSubmit")).click();
	
//	Thread.sleep(2000);
//	String text = driver.findElement(By.tagName("h2")).getText();
//	System.out.println(text);
//	Thread.sleep(2000);
//	driver.findElement(By.linkText("CRM/SFA")).click();
//	
//	//click Leads tap
//	Thread.sleep(2000);
//	driver.findElement(By.linkText("Leads")).click();
//	//Click Create lead button
//	driver.findElement(By.partialLinkText("Create")).click();
//	Thread.sleep(2000);
//	//Enter company name
//	 WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
//	 companyName.clear();
//		companyName.sendKeys("Qeagle");
//		Thread.sleep(2000);
//	//enter first name
//	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aravind");
//	//enter last name
//	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("RK");
//	Thread.sleep(2000);
//	//click create lead button
//	driver.findElement(By.name("submitButton")).click();
//	
//	//String title="View Lead | opentaps CRM";
//	String title="View Lead";
//	String title2 = driver.getTitle();
//	System.out.println(title2);
//	
//	//if(title.equals(title2)) {
//	if(title2.contains(title)) {
//		System.out.println("CreateLead  created successfully");
//	}else {
//		System.out.println("CreateLead  not created successfully");
//	}
//	
//	
//	
	
	
	
	
	
	
	
	
	
	
}
}
