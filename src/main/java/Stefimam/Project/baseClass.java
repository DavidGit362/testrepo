package Stefimam.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseClass {

	public static WebDriver driver;
	
	public static void browserLaunch (String browserType) {
		if(browserType.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browserType.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else
		{
			System.out.println("Provide Chrome or Firefox as browser name");
		}
	}
	
	public static void urlLaunch(String url)
	{
		driver.get(url);
	}
	
	public static void sendValues(WebElement element, String values)
	{
		element.sendKeys(values);
	}
}
