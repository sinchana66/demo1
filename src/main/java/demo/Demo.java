package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testData.Datautility;

public class Demo
{
	static
	{
		WebDriverManager.firefoxdriver().setup();
	}
	@Test
	public void testA() throws InterruptedException
	{
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String url = Datautility.getPropertyData("url");
		String username = Datautility.getPropertyData("un");
		String password = Datautility.getPropertyData("pw");
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username);
		Reporter.log(username);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Reporter.log(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
	
	

}
}
