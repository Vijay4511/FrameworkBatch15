package seliniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlingdifferentwindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> windlowhandles  = driver.getWindowHandles();
		
		Iterator<String> it = 	windlowhandles.iterator();
		
		String parentwindowid = it.next();
		String childwindowid = it.next();
		
		System.out.println(parentwindowid);
		System.out.println(childwindowid);
		
		driver.switchTo().window(childwindowid);
		
		driver.switchTo().frame(1);
		
		driver.findElement(By.id("mobileNoInp")).sendKeys("7200280501");
		
		driver.switchTo().defaultContent();

	}

}
