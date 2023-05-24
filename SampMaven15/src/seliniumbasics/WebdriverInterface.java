package seliniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("Webdriver.Edge.Driver", "C:\\Users\\vjred\\Desktop\\Automation Testing\\chromedriver.exe");
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.apsrtconline.in/");
		
		//Click on Eticket login link. --> Instruction 
		
		driver.findElement(By.partialLinkText("eTicket")).click();
		
	//	******** Information **************************//**PerformAction** 		
		
		//Enter Username into Username Field 
		
		driver.findElement(By.id("userName")).sendKeys("Vijaykumar");
		
		driver.findElement(By.name("password")).sendKeys("Kumar");
		
		driver.findElement(By.className("loginBtn")).click();
		
		String ExpErrorMsg = "Login incorrect. Please try again";
		
		String Actualerrormsg = driver.findElement(By.tagName("strong")).getText();
		
		if(ExpErrorMsg.equalsIgnoreCase(Actualerrormsg))
		{
			System.out.println("Verification was successfull");
		}
		
		else
		{
			System.out.println("Verification was NOT successfull");
		}
			
		
		//if(<Condition>)
		//{
			//if block
		//}
		//else
		//{
			//else block
		//}
		

	}

}
