package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AxesXpathLeaftaps {
public static void main(String[] args) {
	//download the driver and set the path
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the browser
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.xpath("//form[@id='login']//input[@id='password']")).sendKeys("crmsfa");
		
		
		driver.findElement(By.xpath("//form[@id='login']//input[@class='decorativeSubmit']")).click();
		
		
		
}
}
