package pack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	XSSFSheet sh;
	
	public Excel() throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\AARON\\Desktop\\Testing\\Java Programs\\excel.xlsx");
		XSSFWorkbook ws=new XSSFWorkbook(f);
		sh=ws.getSheet("Sheet1");
	}
	public String readData(int i,int j) {
		Row r=sh.getRow(i);
		Cell c=r.getCell(j);
		int celltype=c.getCellType();
		switch(celltype) {
		case Cell.CELL_TYPE_NUMERIC://numeric
		{
			double d=c.getNumericCellValue();//double
			return String.valueOf(d);
		}
		case Cell.CELL_TYPE_STRING:
		{
			return c.getStringCellValue();
		}
		}
		return null;
		
	}
	
	public static void main(String[] args) {


	}

}
