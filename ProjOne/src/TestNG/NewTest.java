package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class NewTest {
	
	public WebDriver driver;
	
	@DataProvider(name="Sample")
	  public Object[][] dp() {
		  Object[][] obj=new Object[2][2];
		  obj[0][0]="Madhuri";	obj[0][1]="abcdefg";
		  obj[1][0]="Madhuri1";	obj[1][1]="khakhda";
		  return obj;
	    
	    
	  }
 
  @BeforeMethod
  public void beforeMethod()
  {
  	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mounikaReddy\\Desktop\\Madhuri\\Selenium files\\Browser bindings\\chromedriver_win32\\chromedriver.exe");
  	driver=new ChromeDriver();
  	driver.get("http://facebook.com");
  	driver.manage().window().maximize();
  	
  }
    
  @AfterMethod
  public void afterMethod()
  {
  	driver.close();
  }
  
  @Test(dataProvider="Sample")
  public void t1(String uid, String pwd) {
	  
	  driver.findElement(By.id("email")).sendKeys(uid);
		driver.findElement(By.id("pass")).sendKeys(pwd);
  }


 
}
