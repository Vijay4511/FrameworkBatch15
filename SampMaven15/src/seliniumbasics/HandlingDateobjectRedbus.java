package seliniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDateobjectRedbus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.redbus.in/");
		// 24 - Feb - 2024
		String month = "Feb 2024";
		driver.findElement(By.id("onward_cal")).click();
		
	String monthfromApplicaiton =	driver.findElement(By.className("monthTitle")).getText();
	System.out.println(monthfromApplicaiton);
	
		while(!(monthfromApplicaiton.contains(month)))  //Nov 2023 contains Nov --> true ---> !true --> false
		{
			driver.findElement(By.xpath("//button[text()='>']")).click();
			monthfromApplicaiton =	driver.findElement(By.className("monthTitle")).getText();
			System.out.println(monthfromApplicaiton);
		}
			
		List<WebElement> dates =	driver.findElements(By.xpath("//td[contains(@class,'day')]"));

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
