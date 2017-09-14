package gitMaven;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
	

	public static WebDriver driver;
	
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\gdriver\\geckodriver.exe");
		System.setProperty("webdriver.firefox.driver", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		driver =new FirefoxDriver();
	}
	@Test
	public void doLogin()
	{
		
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("chavan.tejaswini15@gmail.com");
		
	}
	public void tearDown()
	{
		driver.quit();
	}
}
