package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement men = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
	
	Actions builder=new Actions(driver);
	builder.moveToElement(men).perform();
	driver.findElement(By.xpath("(//a[text()='T-Shirts'])[1]")).click();
	
}
}
