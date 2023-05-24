package execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Signin {
	
	@BeforeClass
	public void SigninNavigation()
	{
		System.out.println("SigninNavigation");
	}
	
	@Test(groups= {"regression"})
	public void SiginNegValidation()
	{	
		System.out.println("SiginNegValidationTestcaseCode");
	}
	@Parameters({"url","uname"})
	@Test(groups= {"smoke"})
	public void SuccessfSigin(String url,String uname)
	{
		System.out.println(url);
		System.out.println(uname);
		System.out.println("SuccessfSiginTestcaseCode");
	}
	
	@Test(dataProvider = "getlogindate")
	public void WebLogin(String uname,String pwd)
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.apsrtconline.in");
		driver.findElement(By.linkText("eTicket Login")).click();
		driver.findElement(By.id("userName")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.id("submitBtn")).click();
	}
	
	@DataProvider
	public Object[][] getlogindate()
	{
		Object[][] data = new Object[3][2];
		//one data set
		data[0][0] = "Vijay";
		data[0][1] = "Password1";
		//second data set
		data[1][0] = "Redddy";
		data[1][1] = "Kumar234";
		//third data set
		data[2][0] = "Nihanth";
		data[2][1] = "Welcome01";
		
		return data;
		
	}
	@Test
	public void Forgetpassword()
	{
		System.out.println("ForgetpasswordTestcaseCode");
	}

}
