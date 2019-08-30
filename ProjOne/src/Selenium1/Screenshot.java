package Selenium1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mounikaReddy\\Desktop\\Madhuri\\Selenium files\\Browser bindings\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
	
		Thread.sleep(2000);
		
		TakesScreenshot Scrshot=(TakesScreenshot)driver;
		File f=Scrshot.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File("C:\\Users\\mounikaReddy\\Desktop\\Madhuri\\123.png"));
		driver.close();

	}

}
