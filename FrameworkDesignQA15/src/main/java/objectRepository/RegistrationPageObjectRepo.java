package objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPageObjectRepo {
	

	WebDriver driver;
	
	@FindBy(id="loginName")
	WebElement txtLoginname; //findelement(By.id("loginName"))
	
	@FindBy(id="fullName")
	WebElement txtFullName; //driver.findelement(By.id("fullName"))
	
	@FindBy(id="email")
	WebElement txtEmail;
	
	@FindBy(id="mobileNo") //findelement(By.linkText("Sign"))
	WebElement txtMobileNumb;
	
	@FindBy(name="SaveBtn")
	WebElement btnSubmit;
	
	@FindBy(id="genderId")
	WebElement lstGender;
	
	@FindBy(id="nationalityId")
	WebElement lstNation;
	
	@FindBy(id="txtDob")
	WebElement txtDateObj;

	@FindBy(className="ui-datepicker-month")
	WebElement dateMonthObj;
	
	@FindBy(className="ui-datepicker-year") //findelement(By.classname("ui-datepicker-year"))
	WebElement dateYearObj;
	
	@FindBy(xpath="//td[@data-handler='selectDay']/a") //findelements()
	List<WebElement> datesObj;
	
	
	public RegistrationPageObjectRepo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement LoginName()
	{
		return txtLoginname;
		//driver.findelement(By.id("loginName"))
	}
	
	public WebElement FullName()
	{
		return txtFullName;

	}
	
	public WebElement MobileNumb()
	{
		return txtMobileNumb;
		
	}
	
	public WebElement Email()
	{
		return txtEmail;
	
	}
	
	public WebElement Submit()
	{
		return btnSubmit;
	}
	
	public void SelectGender(String gender)
	{
		
		Select genSelect = new Select(lstGender);
		genSelect.selectByVisibleText(gender);
	}
	
	public void SelectNationality(String nation)
	{
	
		Select genSelect = new Select(lstNation);
		genSelect.selectByVisibleText(nation);
	}
	
	public void SelectDate(String datetoselect)
	{
		//24-Jun-1988
		String[] datearray;
		datearray = datetoselect.split("-");
		txtDateObj.click();
		Select monthSelect = new Select(dateMonthObj);
		monthSelect.selectByVisibleText(datearray[1]);
		Select yearSelect = new Select(dateYearObj);
		yearSelect.selectByVisibleText(datearray[2]);
		String strtemp;
	
		for(WebElement date:datesObj)
		{
			strtemp = date.getText();
			
			if(strtemp.equalsIgnoreCase(datearray[0]))
			{
				date.click();
				break;
			}
		}
		
	}	

}
