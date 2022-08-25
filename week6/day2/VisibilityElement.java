package week6.day2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VisibilityElement {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.leafground.com/waits.xhtml");
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	WebElement ele = driver.findElement(By.xpath("(//span[text()='Click'])[1]"));
	ele.click();
	
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
	
	driver.findElement(By.xpath("//span[text()='I am here']")).click();
	
	boolean displayed = driver.findElement(By.xpath("//span[text()='I am here']")).isDisplayed();
	
	System.out.println(displayed);
}
}
