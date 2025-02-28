package AllTestngConceptsPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestNGprogram {
  @Test
  public void FirstTestGoogle() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
	  driver.findElement(By.id("APjFqb")).sendKeys("selenium", Keys.ENTER);
	  System.out.println(driver.getTitle());
	  Thread.sleep(2000);
	  
  }
}
