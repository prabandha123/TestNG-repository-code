package SeleniumPracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActions {
	
WebDriver driver;
	
	@BeforeMethod
	public void Setup() throws InterruptedException {	
	WebDriverManager.chromedriver().setup();
	this. driver=new ChromeDriver();
	//driver.get("https://www.google.com/");    //This URL for Test methd1 when we want to execute 
	
	driver.get("https://www.facebook.com/");    //This URL for Test methd2 when we want to execute
	driver.manage().window().maximize();
	Thread.sleep(4000);
	}
	
	@Test
	public void KeyboardAction() throws InterruptedException {
		
		Actions act=new Actions(driver);
		
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		
		act.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(2000);
		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		Assert.assertEquals(URL, "https://www.google.com/search?q=Selenium&sca_esv=568176390&source=hp&ei=_X4RZd27IqrN1sQPtImCsAw&iflsig=AO6bgOgAAAAAZRGNDXYHsphvmxTOWmOpokoniuqutRq5&ved=0ahUKEwidruK_48WBAxWqppUCHbSEAMYQ4dUDCAk&uact=5&oq=Selenium&gs_lp=Egdnd3Mtd2l6IghTZWxlbml1bUhGUABYEXAAeACQAQCYAQCgAQCqAQC4AQPIAQD4AQE&sclient=gws-wiz");
		
		
	}
	
	@Test
	public void KeyboardActionSecond() throws InterruptedException {
		
		Actions act=new Actions(driver);
		
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		
		act.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(2000);
		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		Assert.assertEquals(URL, "https://www.google.com/search?q=Selenium&sca_esv=568176390&source=hp&ei=_X4RZd27IqrN1sQPtImCsAw&iflsig=AO6bgOgAAAAAZRGNDXYHsphvmxTOWmOpokoniuqutRq5&ved=0ahUKEwidruK_48WBAxWqppUCHbSEAMYQ4dUDCAk&uact=5&oq=Selenium&gs_lp=Egdnd3Mtd2l6IghTZWxlbml1bUhGUABYEXAAeACQAQCYAQCgAQCqAQC4AQPIAQD4AQE&sclient=gws-wiz");
		
		
	}
	
	
	@AfterClass
	public void closeapp() {
		driver.quit();
		
	}
	
	

}
