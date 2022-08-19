package week5.day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://erail.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//enter from station
	WebElement from = driver.findElement(By.id("txtStationFrom"));
	from.clear();
	from.sendKeys("MAS", Keys.ENTER);
	//enter to station
	WebElement to = driver.findElement(By.id("txtStationTo"));
	to.clear();
	to.sendKeys("MDU", Keys.ENTER);
	//click sort on date
	driver.findElement(By.id("chkSelectDateOnly")).click();
	
	
	List<WebElement> trainName = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]"));
	int size = trainName.size();
	
	System.out.println("TrainCount"+size);
	
	for (int i = 0; i <size; i++) {
		String text = trainName.get(i).getText();
		System.out.println(text);
	}
	
	//System.out.println(trainName);
	
	
	
	
}
}
