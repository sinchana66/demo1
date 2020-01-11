package links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo6 {
static
{
	WebDriverManager.firefoxdriver().setup();
}
@Test
public void testA() throws IOException
{
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("C://Users/WIN/Desktop/image.html");
	List<WebElement> allimages = driver.findElements(By.tagName("img"));
	System.out.println("total no of images"+allimages.size());
	for(WebElement image : allimages)
	{
		String src = image.getAttribute("src");
		URL url=new URL(src);
		HttpURLConnection httpUrlConnection=(HttpURLConnection)url.openConnection();
		httpUrlConnection.setConnectTimeout(2000);
		httpUrlConnection.connect();
		int 
}
	
	
	
}
}
