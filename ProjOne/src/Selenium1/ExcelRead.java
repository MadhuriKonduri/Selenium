package Selenium1;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

 
 
public class ExcelRead {
 
 public static void main(String []args) throws Exception{

	 FileInputStream f=new FileInputStream("C:\\Users\\mounikaReddy\\Desktop\\Madhuri\\Test.xls");
	 Workbook wb=Workbook.getWorkbook(f);
	 Sheet s=wb.getSheet("Sheet1");
	 int r=s.getRows();
	 int c=s.getColumns();
	 
	 for(int i=0;i<r;i++)
	 {
		 for(int j=0;j<c;j++)
		 {
			 System.out.println(s.getCell(j, i).getContents());
		 }
	 }
	 
 }
}