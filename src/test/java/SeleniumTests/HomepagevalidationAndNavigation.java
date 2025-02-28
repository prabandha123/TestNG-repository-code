package SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomepagevalidationAndNavigation {
	
WebDriver driver;
	
	@BeforeMethod
	public void CSCSApp() throws InterruptedException {	
	WebDriverManager.chromedriver().setup();
	this. driver=new ChromeDriver();
	driver.get("https://cscs.io/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	}
	
	@Test
	public void Homepagevalidation() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Synergetic Solutions')]")).click();
		String actualurl =driver.getCurrentUrl();
		System.out.println(actualurl);
		driver.navigate().back();		
	}
	
	
	@AfterClass
	public void closeapp() {
		driver.quit();
		
	}
	
	

}
