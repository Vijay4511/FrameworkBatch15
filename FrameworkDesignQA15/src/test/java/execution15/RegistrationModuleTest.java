package execution15;

import java.io.IOException;
import java.util.ArrayList;

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
import objectRepository.HomePageObjectrepo;
import objectRepository.LoginPageObjectRepo;
import objectRepository.RegistrationPageObjectRepo;

public class RegistrationModuleTest extends initcls {
	
	WebDriver driver;
	@BeforeClass(alwaysRun = true)
	public void BrowserNavigation() throws IOException
	{
		driver = BrowserInitilization();
		driver.get(prop.getProperty("url"));
	}
	
	
	@Test(groups= {"smoke"})
	public void NegativeValidLoginame() throws IOException
	{
		String Tcname = "LoginNameValid";
		ArrayList<String>TcData;
		CommonMethods cm = new CommonMethods();
		TcData = cm.ReadTestcaseDatafromExcel(Tcname);
		
		HomePageObjectrepo hp = new HomePageObjectrepo(driver);
		hp.EticketLogin().click();
		LoginPageObjectRepo lp = new LoginPageObjectRepo(driver);
		lp.SignUp().click();
		RegistrationPageObjectRepo rp = new RegistrationPageObjectRepo(driver);
		
		rp.LoginName().sendKeys(TcData.get(1));
		rp.FullName().sendKeys(TcData.get(2));
		rp.Email().sendKeys(TcData.get(4));
		rp.MobileNumb().sendKeys(TcData.get(3));
		rp.SelectGender("FEMALE");
		rp.SelectNationality("NRI");
		rp.SelectDate("27-Jul-2014");
		
		rp.Submit().click();
		Assert.fail("Failed to test listeners");
		
	}
	@Test(groups= {"regression"})
	public void NegativeValidFullname()
	{
	
		HomePageObjectrepo hp = new HomePageObjectrepo(driver);
		hp.EticketLogin().click();
		LoginPageObjectRepo lp = new LoginPageObjectRepo(driver);
		lp.SignUp().click();
		RegistrationPageObjectRepo rp = new RegistrationPageObjectRepo(driver);
		rp.LoginName().sendKeys("Vijaykumarw32");
		rp.FullName().sendKeys("Vijykumareballaal");
		rp.Email().sendKeys("viju563@gmmail.com");
		rp.MobileNumb().sendKeys("9876787654");
		rp.SelectGender("MALE");
		rp.SelectNationality("OTHERS");
		rp.SelectDate("21-Feb-2001");
		rp.Submit().click();
	}
	@Test(groups= {"regression"})
	public void NegativeValidMobileNum()
	{
			
		HomePageObjectrepo hp = new HomePageObjectrepo(driver);
		
		hp.EticketLogin().click();
		LoginPageObjectRepo lp = new LoginPageObjectRepo(driver);
		lp.SignUp().click();
		RegistrationPageObjectRepo rp = new RegistrationPageObjectRepo(driver);
	
		rp.LoginName().sendKeys("Vijaykumar34567");
		rp.FullName().sendKeys("Vijykumareballaal");
		rp.Email().sendKeys("viju563@gmmail.com");
		rp.MobileNumb().sendKeys("98767876");
		rp.SelectGender("FEMALE");
		rp.SelectNationality("INDIAN");
		rp.SelectDate("24-Jun-2007");
		rp.Submit().click();
	}

}
