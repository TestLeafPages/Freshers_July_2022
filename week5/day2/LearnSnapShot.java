package week5.day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSnapShot {
public static void main(String[] args) throws IOException {
	//download the driver and set the path
		WebDriverManager.chromedriver().setup();
		//launch chrome browser
		ChromeDriver driver=new ChromeDriver();
		//load the application url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the browser
		driver.manage().window().maximize();
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snap/img");
		FileUtils.copyFile(source, dest);
		
		
		
		
		
}
}
