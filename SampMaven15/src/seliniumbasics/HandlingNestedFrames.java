package seliniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingNestedFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Frames")).click();
		
		driver.findElement(By.linkText("Nested Frames")).click();
		
	int framecount =	driver.findElements(By.tagName("frame")).size();
	System.out.println(framecount);
	
	driver.switchTo().frame("frame-top");
	
	WebElement RightFrame = driver.findElement(By.name("frame-right"));
	
	driver.switchTo().frame(RightFrame);
	
	String str = driver.findElement(By.tagName("body")).getText();
	
	System.out.println(str);
	
	driver.switchTo().defaultContent();
	
	

	}

}
