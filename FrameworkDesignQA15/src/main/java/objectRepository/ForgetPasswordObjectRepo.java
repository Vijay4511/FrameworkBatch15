package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPasswordObjectRepo {
	
	WebDriver driver;
	
	@FindBy(id="userName")
	WebElement txtLoginId; 
	
	@FindBy(id="submitBtn")
	WebElement btnSubmit; 
	
	public ForgetPasswordObjectRepo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement LoginId()
	{
		return txtLoginId;
		
	}
	public WebElement SubmitBtn()
	{
		return btnSubmit;
		
	}
	
	

}
