package seliniumbasics;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathIntro {

	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		
		EdgeOptions eo = new EdgeOptions();
		
		eo.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new EdgeDriver(eo);
				 
		String TcName = "SuccessfullReg";
		
		ArrayList<String> Testdata = ReadingDatafromExcel.ReadExcelData(TcName);

		driver.get("https://www.apsrtconline.in/");
		
		driver.findElement(By.linkText("eTicket Login")).click();
		
		driver.findElement(By.linkText("SignUp")).click();
		
		driver.findElement(By.xpath("//input[@id='loginName']")).sendKeys(Testdata.get(1));
		
		driver.findElement(By.xpath("//input[@name='fullName']")).sendKeys(Testdata.get(2));
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Testdata.get(4));
		
		driver.findElement(By.cssSelector("input#mobileNo")).sendKeys(Testdata.get(3));
		driver.findElement(By.cssSelector("input.continueBtn")).click();
	}

}
