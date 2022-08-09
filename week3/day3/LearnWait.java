package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWait {
public static void main(String[] args) {
	//download the driver and set the path
		WebDriverManager.chromedriver().setup();
		//Launch chrome browser
		ChromeDriver  driver=new ChromeDriver();
		//load application url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize the browser
		driver.manage().window().maximize();
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter the Username as demosalesmanager
		driver.findElement(By.id("username123")).sendKeys("Demosalesmanager");
		//enter the password as crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
}
}
