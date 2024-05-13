package class59_DataProviderExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading2 
{
	@org.testng.annotations.Test
	public void readData() throws IOException 
	{
	 XSSFWorkbook wb= new XSSFWorkbook(new FileInputStream(new File("./TestData/TestData.xlsx")));
	 
 	 int rowCount=wb.getSheet("sheet1").getPhysicalNumberOfRows();
	 int cellCount=wb.getSheet("sheet1").getRow(0).getPhysicalNumberOfCells();
	 Object [][] arr= new Object[rowCount-1][cellCount]; 
	 
	 System.out.println("Numbers of row "+ (rowCount-1));
	 System.out.println("Numbers of Cell "+ cellCount);
	 
	 for(int i=1;i<rowCount;i++)
	 {
		 for(int j=0;j<cellCount;j++)
		 {
	 	 String value="";
		   CellType type= wb.getSheet("sheet1").getRow(i).getCell(j).getCellType();
		   if(type==CellType.NUMERIC)
		   {
			   value=String.valueOf(wb.getSheet("sheet1").getRow(i).getCell(j).getNumericCellValue());
		   }
		   else if(type==CellType.STRING)
		   {
			value=wb.getSheet("sheet1").getRow(i).getCell(j).getStringCellValue();
		   }
		   else if(type==CellType.BOOLEAN)
		   {
			   value=String.valueOf(wb.getSheet("sheet1").getRow(i).getCell(j).getBooleanCellValue());
		   }
		   else if(type==CellType.BLANK)
		   {
			 value="";
		   }
		   arr[i-1][j]=value;
		   System.out.println(arr[i-1][j]);
		 }
		 System.out.println("*****************************");
	 }
	 
	}
	
}
