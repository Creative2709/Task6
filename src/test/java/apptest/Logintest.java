package apptest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Logintest {

	WebDriver driver;
	@Test
	public void Main() {
		
		System.setProperty("webdriver.chrome.driver","D:\\WORLDLINE\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

		driver.get("https://www.linkedin.com");
		driver.findElement(By.id("session_key")).sendKeys("erswapnil27@gmail.com");
		driver.findElement(By.id("session_password")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div/div/form/div[2]/button")).click();
		
		
		String expected_url= "https://www.linkedin.com/feed/?trk=homepage-basic_sign-in-submit";
		String actual_url = driver.getCurrentUrl();
		
		Assert.assertEquals(expected_url, actual_url);       
	        
	}
}
