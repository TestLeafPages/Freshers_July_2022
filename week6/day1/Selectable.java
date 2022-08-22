package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/selectable/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	
	driver.switchTo().frame(frame);
	
	
	WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
	
	WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
	
	Actions builder=new Actions(driver);
	
	builder.clickAndHold(item1).clickAndHold(item4).release().perform();
	
	
}
}
