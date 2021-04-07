package baseClass;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utilities.PropertyRead;

public class LaunchBrowser {
	
	static Properties prop;
	public static WebDriver driver;
	
	@Test
	public static void browserLaunch() throws IOException
	{
		//Defining the object for property
		prop=PropertyRead.prop();
		//Getting path of chrome driver
		String chromeDriverPath = prop.getProperty("chromePath");
		//Setting thh property of chrome driver
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		
		//Initializing and opening the browser
		driver=new ChromeDriver();
		//Getting url from a method
		String url=LaunchBrowser.getUrl();
		//Sending Url to browser
		driver.get(url);
		//Maximizing the browser
		driver.manage().window().maximize();
	}
	
	public static String getUrl() {
		//Getting browser url from Property file
		String url=prop.getProperty("url");
		String Url=null;
		try
		{
		if (url != null)
			Url=url;
		}
		catch(Exception e)
		{
			throw new RuntimeException("url is not found");
		}
		return Url;
	}

}
