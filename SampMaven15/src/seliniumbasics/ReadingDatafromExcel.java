package seliniumbasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingDatafromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String TcName = "FieldValidation";
		ArrayList<String> Testdata = ReadExcelData(TcName);
				
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.apsrtconline.in/");
		
		driver.findElement(By.linkText("eTicket Login")).click();
		
		driver.findElement(By.linkText("SignUp")).click();

		driver.findElement(By.xpath("//input[@id='loginName']")).sendKeys(Testdata.get(1));
		
		driver.findElement(By.xpath("//input[@name='fullName']")).sendKeys(Testdata.get(2));
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Testdata.get(4));
		
		driver.findElement(By.cssSelector("input#mobileNo")).sendKeys(Testdata.get(3));
		driver.findElement(By.cssSelector("input.continueBtn")).click();
		
		
	}

	public static ArrayList<String> ReadExcelData(String TcName) throws IOException
	{
		ArrayList<String> al = new ArrayList();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\vjred\\Desktop\\Vjdata\\Automation Testing\\SignupData.xlsx");
		
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		
		XSSFSheet wsheet = wbook.getSheet("Regestration");
							
		Iterator<Row> rows = wsheet.iterator();

		while(rows.hasNext())
		{
			Row specificrow = rows.next();
			Iterator<Cell> Cells =	specificrow.cellIterator();
				
				if(specificrow.getCell(0).getStringCellValue().equalsIgnoreCase(TcName))
				{
					while(Cells.hasNext())
					{
					    Cell SpecificCell = Cells.next();
						al.add(SpecificCell.getStringCellValue());
						//System.out.println(SpecificCell.getStringCellValue());
										
					}
				}
			
			
		}
		wbook.close();
		return al;
	}
}
