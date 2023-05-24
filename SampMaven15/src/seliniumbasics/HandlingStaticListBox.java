package seliniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingStaticListBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.tsrtconline.in/");
		
		driver.findElement(By.linkText("eTicket Login")).click();
		driver.findElement(By.linkText("SignUp")).click();
		
	//	<classname> <objname> = new <classname>
		
		WebElement gender = driver.findElement(By.id("genderId"));
		
		WebElement nationality = driver.findElement(By.id("nationalityId"));
		
		Select genSelect = new Select(gender);
		
		genSelect.selectByValue("25");
		
		Select Nationselect = new Select(nationality);
		
		Nationselect.selectByIndex(1);
		
	List<WebElement> NationalityItems =	Nationselect.getOptions();
		
		for(WebElement item :NationalityItems)
		{
					System.out.println(item.getText());
					//System.out.println("Option Value"+item.getAttribute("value"));
		}
		
		
		WebElement idCardType = driver.findElement(By.name("proofTypeId"));
		
		Select idCardList = new Select(idCardType);
		
	List<WebElement> idCardListItems =	idCardList.getOptions();
	
	for(WebElement obj :idCardListItems)
		System.out.println(obj.getText());
	
	
			
		//Complete the TSrtc registration form by entering some values expect date object
	

	}

}
