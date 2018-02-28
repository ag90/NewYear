package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid_Demo {
	
	WebDriver driver;
	
	
	@Test
	public void Grid() throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		driver=new RemoteWebDriver(new URL("http://10.141.233.96:4444/wd/hub/"), cap);
		
		String Url="http://www.google.com";
		driver.get(Url);
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		
	}

}
