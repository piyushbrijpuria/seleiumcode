package class59_DataProviderExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading 
{
	@org.testng.annotations.Test
	public void readData() throws IOException 
	{
	 XSSFWorkbook wb= new XSSFWorkbook(new FileInputStream(new File("./TestData/TestData.xlsx")));
	 
 	 int rowCount=wb.getSheet("sheet1").getPhysicalNumberOfRows();
	 int cellCount=wb.getSheet("sheet1").getRow(0).getPhysicalNumberOfCells();
	 Object [][] arr= new Object[rowCount-1][cellCount]; 
	 
	 System.out.println("Numbers of Row "+ (rowCount-1));
	 System.out.println("Numbers of Cell "+ cellCount);
	 
	 for(int i=1;i<rowCount;i++)
	 {
		 for(int j=0;j<cellCount;j++)
		 {
		  arr[i-1][j]=wb.getSheet("sheet1").getRow(i).getCell(j).getStringCellValue();
		  System.out.println(arr[i-1][j]);
		 }	 
		 System.out.println("*****************************");
	 }	 
	}	
}
