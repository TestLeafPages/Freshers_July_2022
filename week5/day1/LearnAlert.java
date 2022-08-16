package week5.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import week3.day1.ChromeBrowser;

public class LearnAlert {
public static void main(String[] args) throws InterruptedException {
	//download the driver and set the path
	WebDriverManager.chromedriver().setup();
	//launch chrome browser
	ChromeDriver driver=new ChromeDriver();
	//load the application url
	driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node0jg5lnvgxcb5bx9r42bjn6s4981299.node0");
	//maximize the browser
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
	
	Alert simpleAlert = driver.switchTo().alert();
	Thread.sleep(3000);
	simpleAlert.accept();
	
	driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
	Alert confirmAlert = driver.switchTo().alert();
	Thread.sleep(3000);
	confirmAlert.dismiss();
	
	driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
	Alert promptAlert = driver.switchTo().alert();
	Thread.sleep(3000);
	promptAlert.sendKeys("Testleaf");
	promptAlert.accept();
	
	
	driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
	Alert sweetAlert = driver.switchTo().alert();
	sweetAlert.accept();
}
}
