package week5.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {
public static void main(String[] args) {
	//download the driver and set the path
		WebDriverManager.chromedriver().setup();
		//launch chrome browser
		ChromeDriver driver=new ChromeDriver();
		//load the application url
		driver.get("https://www.leafground.com/frame.xhtml");
		//maximize the browser
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement frame1 = driver.findElement(By.id("Click"));
		
		frame1.click();
		String text = frame1.getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		
		List<WebElement> frameCount = driver.findElements(By.tagName("iframe"));
		
		int size = frameCount.size();
		
		System.out.println(size);
		
		
		
}
}
