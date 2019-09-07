import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid_BrowserStack {

	public static void main(String[] args) throws Exception {
		
		URL u=new URL("https://srivijayamadhuri1:5i6WsrBCAo3NqTPdyXqD@hub-cloud.browserstack.com/wd/hub");
		
		DesiredCapabilities d=new DesiredCapabilities();
		d.setCapability("os_version", "12");
		d.setCapability("device", "iPhone 8");
		d.setCapability("real_mobile", "true");
		d.setCapability("browserstack.local", "false");
		
		RemoteWebDriver r=new RemoteWebDriver(u,d);
		WebDriver driver=r;
		
		driver.get("https://facebook.com");
		//driver.manage().window().maximize();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("Madhu");
		
		driver.quit();

	}

}
