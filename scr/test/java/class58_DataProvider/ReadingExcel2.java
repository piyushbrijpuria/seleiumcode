package class58_DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel2 
{
	@org.testng.annotations.Test
	public void readData() throws IOException 
	{
		XSSFWorkbook wb= new XSSFWorkbook(new FileInputStream(new File("./TestData/TestData.xlsx")));
		String dataString=wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(dataString);
		wb.close();
	}
	
}
