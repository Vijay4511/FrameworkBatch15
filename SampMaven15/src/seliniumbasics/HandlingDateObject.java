package seliniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDateObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.tsrtconline.in/");
		
		driver.findElement(By.linkText("eTicket Login")).click();
		driver.findElement(By.linkText("SignUp")).click();
		
		// 24 - July -2001
		
		driver.findElement(By.id("txtDob")).click();
				
		WebElement monthObj = driver.findElement(By.className("ui-datepicker-month"));
		
		Select monthSelect = new Select(monthObj);
		
		monthSelect.selectByVisibleText("Jul");
		
		WebElement yearObj = driver.findElement(By.className("ui-datepicker-year"));
		
		Select yearSelect = new Select(yearObj);
		
		yearSelect.selectByVisibleText("2001");
		
	List<WebElement> dates =	driver.findElements(By.xpath("//td[@data-handler='selectDay']/a"));
	
	//System.out.println(dates.size());
	
	String strtemp;
	
	for(WebElement date:dates)
	{
		strtemp = date.getText();
		
		if(strtemp.equalsIgnoreCase("24"))
		{
			date.click();
			break;
		}
	}
		
		
	}

}
