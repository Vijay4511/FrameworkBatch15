package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjectRepo {
	
	WebDriver driver;
	
	@FindBy(id="userName")
	WebElement txtUsername; //driver.findelement(By.id("userName"))
	
	@FindBy(id="password")
	WebElement txtPassword; //driver.findelement(By.id("password"))
	
	@FindBy(id="submitBtn")
	WebElement btnLogin;
	
	@FindBy(linkText="SignUp") //findelement(By.linkText("Sign"))
	WebElement lnkSignup;
	
	@FindBy(linkText="Forgot Password")
	WebElement lnkFgtPassword; //driver.finelement(By.linktext("Forget password"))
	
	public LoginPageObjectRepo(WebDriver driver)
	{
		//this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void Login(String uname,String pwd)
	{
		txtUsername.sendKeys(uname);
		txtPassword.sendKeys(pwd);
		btnLogin.click();
	}
	
	public WebElement SignUp()
	{
		return lnkSignup;
	}
	
	
	
	
	public WebElement Forgetpwd()
	{
		return lnkFgtPassword;
	}
	

}
