package seliniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablePractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://codenboxautomationlab.com/practice/");
		
		WebElement courseTable = driver.findElement(By.id("product"));
		
		int rowCount = courseTable.findElements(By.tagName("tr")).size();
		int colCount = courseTable.findElements(By.tagName("th")).size();
		
		for(int i=1;i<rowCount;i++)
		{
			if(i==9)
			{
				WebElement trow = courseTable.findElements(By.tagName("tr")).get(i);
				
				for(int j=0;j<colCount;j++)
				{
					String tColumnText = trow.findElements(By.tagName("td")).get(j).getText();
					
					System.out.print(tColumnText+"--");
				}
				
				System.out.println();
				break;
			}
		
			
		}
		
	}

}
