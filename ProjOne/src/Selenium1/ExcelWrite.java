package Selenium1;

import java.io.FileOutputStream;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws Exception {
		FileOutputStream fo=new FileOutputStream("C:\\Users\\mounikaReddy\\Desktop\\Madhuri\\output.xls");
		WritableWorkbook wwb=Workbook.createWorkbook(fo);
		WritableSheet ws=wwb.createSheet("Result", 1);
		WritableSheet ws1=wwb.createSheet("Madhu", 1);
		int a=10; int b=20;
		int c=a*b;
		Label T=new Label(4, 5, "C value is"+c);
		Label G=new Label(1, 1, "Madhu");
		ws.addCell(T);
		ws1.addCell(G);
		wwb.write();
		wwb.close();
		System.out.println("Done");

	}

}
