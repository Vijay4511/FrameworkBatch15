package seliniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InterviewQuestPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.apsrtconline.in/");
		
	List<WebElement> links =	driver.findElements(By.tagName("a"));
	
	
	System.out.println(links.size());
	
	for(WebElement l:links)
	{
		
		System.out.println(l.getText());
	}
	
	
WebElement PageFooter =	driver.findElement(By.id("fotter-bg"));

				
List<WebElement> Footerlinks = PageFooter.findElements(By.tagName("a"));
	
System.out.println(Footerlinks.size());

	}

}
