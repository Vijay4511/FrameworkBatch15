package seliniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Frames")).click();
		
		driver.findElement(By.linkText("iFrame")).click();
		String str = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		
		System.out.println(str);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//body[@id='tinymce']/p")).sendKeys("Siva kumar");
		
		driver.switchTo().defaultContent();
		
		str = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		System.out.println("Second time - "+str);
		

	}

}
