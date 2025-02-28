package SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import io.github.bonigarcia.wdm.WebDriverManager;


public class HardANDSoftAsserts {
	
//HardAssert
	
/*	@Test
	public void HardAssertMethod() throws Exception {
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
	//Title Assertion
	String ActualTitle=driver.getTitle();
	String ExpectedTitle="Facebook – log in or sign up";
	Assert.assertEquals(ActualTitle, ExpectedTitle,"Title is matched");
	
	//URL Assertion
	String ActualURL=driver.getCurrentUrl();
	String ExpectedURL="https://www.facebook.com/";
	Assert.assertEquals(ActualURL, ExpectedURL,"URL is mismatched");
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("prabandha.sri@gmail.com");
	driver.findElement(By.name("login")).click();
	
    //Error message
	String ActualMessage=driver.findElement(By.xpath("//div[contains(text(),\"The email address you entered isn't connected to an account. \")]")).getText();
	String ExpectedMessage="The email address you entered isn't connected to an account. ";
	Assert.assertEquals(ActualMessage, ExpectedMessage,"Message is mached");
	}
	*/
	
	
	
	
//SoftAssert
	@Test
	public void SoftAssertMethod() throws Exception {
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
	SoftAssert softAssert = new SoftAssert();
	
	//Title Assertion
	String ActualTitle=driver.getTitle();
	String ExpectedTitle="Facebook – log in or sign up";
	softAssert.assertEquals(ActualTitle, ExpectedTitle,"Title is matched");
	
	//URL Assertion
	String ActualURL=driver.getCurrentUrl();
	String ExpectedURL="https://www.facebook.com/";
	softAssert.assertEquals(ActualURL, ExpectedURL,"URL is mismatched");
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("prabandha.sri@gmail.com");
	driver.findElement(By.name("login")).click();
	
    //Error message
	String ActualMessage=driver.findElement(By.xpath("//div[contains(text(),\"The email address you entered isn't connected to an account. \")]")).getText();
	String ExpectedMessage="The email address you entered isn't connected to an account. Find your account and log in.";
	softAssert.assertEquals(ActualMessage, ExpectedMessage,"Message is mached");
	
	//driver.quit();
	softAssert.assertAll();
	}


}
