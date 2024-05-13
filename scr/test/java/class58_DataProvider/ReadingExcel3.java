package class58_DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel3 
{
	@org.testng.annotations.Test
	public void readData() throws IOException 
	{
	 XSSFWorkbook wb= new XSSFWorkbook(new FileInputStream(new File("./TestData/TestData.xlsx")));
	 
 	 int rowCount=wb.getSheet("sheet1").getPhysicalNumberOfRows();
	 System.out.println("Numbers of row "+rowCount);
	 
	 int cellCount=wb.getSheet("sheet1").getRow(0).getPhysicalNumberOfCells();
	 System.out.println("Numbers of Cell "+cellCount);
	 
	 for(int i=0;i<rowCount;i++)
	 {
		 for(int j=0;j<cellCount;j++)
		 {
		  String dataString=wb.getSheet("sheet1").getRow(i).getCell(j).getStringCellValue();
			
		 System.out.println(dataString);
		 wb.close();
		 }
		 System.out.println("*****************************");
	 }
	 
	}
	
}
