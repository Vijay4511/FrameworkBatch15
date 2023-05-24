package seliniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("JavaScript Alerts")).click();
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(500);
		driver.switchTo().alert().accept();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		driver.switchTo().alert().dismiss();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		driver.switchTo().alert().sendKeys("Vijay Kumar");
		driver.switchTo().alert().accept();
		
		driver.switchTo().defaultContent();
		
		

	}

}
