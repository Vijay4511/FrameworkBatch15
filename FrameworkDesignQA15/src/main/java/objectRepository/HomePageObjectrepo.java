package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjectrepo {
	
	WebDriver driver;
	
	
	public HomePageObjectrepo(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement EticketLogin()
	{
		
		return driver.findElement(By.linkText("eTicket Login"));
	}
	
	public WebElement AgentLogin()
	{
		return driver.findElement(By.linkText("ATP/OPR Login"));
	}
	
	
	

}
