package execution15;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.initcls;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.ForgetPasswordObjectRepo;
import objectRepository.HomePageObjectrepo;
import objectRepository.LoginPageObjectRepo;

public class LoginModule15Test extends initcls {
	
	WebDriver driver;
	
	@BeforeClass(alwaysRun = true)
	public void BrowserNavigation() throws IOException
	{
		
		driver =BrowserInitilization();
		driver.get(prop.getProperty("url"));
		
	}
	@Test(groups= {"smoke"})
	public void NegativeLoginValidation()
	{
	
		
		HomePageObjectrepo hp = new HomePageObjectrepo(driver);
		hp.EticketLogin().click();
		LoginPageObjectRepo lp = new LoginPageObjectRepo(driver);
		lp.Login("Validusername", "Inpasssword");
		Assert.fail("Failed to test listeners");
		
		
	}
	
	@Test(groups= {"regression"})
	public void ForgetPassword()
	{

		HomePageObjectrepo hp = new HomePageObjectrepo(driver);
		hp.EticketLogin().click();
		
		LoginPageObjectRepo lp = new LoginPageObjectRepo(driver);
		lp.Forgetpwd().click();
		
		ForgetPasswordObjectRepo fp = new ForgetPasswordObjectRepo(driver);
		fp.LoginId().sendKeys("viju452@gmail.com");
		fp.SubmitBtn().click();
		
	}
	
	
	

}
