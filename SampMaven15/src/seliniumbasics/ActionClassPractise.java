package seliniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		/*driver.get("https://www.amazon.in/");
		
		Actions act = new Actions(driver);
		
		WebElement SignIn = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		act.moveToElement(SignIn).build().perform();
		
		WebElement AmazonTextbox = driver.findElement(By.id("twotabsearchtextbox"));
		
		act.moveToElement(AmazonTextbox).click().sendKeys("Vijaykumar").doubleClick().build().perform();*/
		
		driver.get("https://jqueryui.com/droppable/");
		
	int framecount =driver.findElements(By.tagName("iframe")).size();
	System.out.println(framecount);
	
	driver.switchTo().frame(0);
	Actions act = new Actions(driver);
			
		WebElement sourceObj = driver.findElement(By.id("draggable"));
		
		WebElement destObj = driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(sourceObj, destObj).build().perform();

		
	}

}
