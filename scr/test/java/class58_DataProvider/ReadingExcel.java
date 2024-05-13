package class58_DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel 
{
	@org.testng.annotations.Test
	public void readData() throws IOException 
	{
		File src = new File("./TestData/TestData.xlsx");
		FileInputStream fis= new FileInputStream(src);
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheet("sheet1");
		XSSFRow row1=sheet1.getRow(0);
		XSSFCell cell1=row1.getCell(0);
		String dataString=cell1.getStringCellValue();
		
		System.out.println(dataString);
		wb.close();
	}
	
}
