package SeleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionsFirst {
	
	@Test
	public void FirstTestMethod() throws Exception {
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	String ActualTitle=driver.getTitle();
	String ExpectedTitle="Google";
	Assert.assertEquals(ActualTitle, ExpectedTitle,"Title is matched");
	
	}
}
