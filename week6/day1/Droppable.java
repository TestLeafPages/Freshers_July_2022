package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Droppable {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	
	driver.switchTo().frame(frame);
	
	
	WebElement from = driver.findElement(By.id("draggable"));
	
	WebElement to = driver.findElement(By.id("droppable"));
	
	Actions builder=new Actions(driver);
	
	builder.dragAndDrop(from, to).perform();
	
	String cssValue = to.getCssValue("background");
	
	System.out.println(cssValue);
	
}
}
