package seliniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCheckRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Checkboxes")).click();

		if(!(driver.findElement(By.xpath("//input[@type='checkbox'][1]")).isSelected()))
		{
			driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		}
		
		if(!(driver.findElement(By.xpath("//input[@type='checkbox'][2]")).isSelected()))
		{
			driver.findElement(By.xpath("//input[@type='checkbox'][2]")).click();
		} 
		
	
		
		
	}

}
