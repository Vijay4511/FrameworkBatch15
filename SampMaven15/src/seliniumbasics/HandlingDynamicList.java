package seliniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDynamicList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.apsrtconline.in/");
		
		String fromplace = "Kavali";
		String toPlace = "hyderabad";
		
		SelectCity(fromplace,driver,"to");
		SelectCity(toPlace,driver,"from");

	}
	
	public static void SelectCity(String cityname, WebDriver driver,String place) throws InterruptedException
	{
		
		if(place.equalsIgnoreCase("from"))
			driver.findElement(By.id("fromPlaceName")).sendKeys(cityname);
		else
			driver.findElement(By.id("toPlaceName")).sendKeys(cityname);
		Thread.sleep(500);		
		List<WebElement> FromListItems =	driver.findElements(By.xpath("//a[contains(@id,'ui-id')]"));
		String temp ="";
		String[] strArray;
		
		for(WebElement item:FromListItems)
		{
			temp = item.getText();
			strArray = temp.split("\\n");
			if(strArray[0].equalsIgnoreCase(cityname))  //Nellore
			{
				item.click();
				break;
			}
	
		}
		
	}

}
