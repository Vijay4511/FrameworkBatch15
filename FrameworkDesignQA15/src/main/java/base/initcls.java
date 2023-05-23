package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class initcls {
	
	public WebDriver driver;
	public String browsername;
	public Properties prop;
	
	public WebDriver BrowserInitilization() throws IOException
	{
	
		prop = new Properties();
		String projectpath = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(projectpath+"\\Resources\\Config.properties");
		prop.load(fis);
		browsername = prop.getProperty("browser");

		if (browsername.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver(options);
			
		}else if(browsername.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new FirefoxDriver(options);
	
		}else
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
		
		}

		return driver;
	}
	
	public String GetScreenshot(WebDriver driver,String Tcname) throws IOException
	{

		File src = 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String Screenshotpath = System.getProperty("user.dir")+"\\reports\\"+Tcname+".png";
		
		FileUtils.copyFile(src, new File(Screenshotpath));
		return Screenshotpath;
		
	}
	
}
