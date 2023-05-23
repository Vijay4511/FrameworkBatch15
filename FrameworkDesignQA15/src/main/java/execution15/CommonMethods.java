package execution15;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CommonMethods {
	
	public static ArrayList<String> ReadTestcaseDatafromExcel(String TcName) throws IOException
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
