import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteDemo {
	
	static String name="Krishnapriya";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("Myname");
		XSSFRow rw=sheet.createRow(0);
		Cell cl=rw.createCell(0);
		cl.setCellValue(name);
		File obfile=new File("D:\\JAVA\\Myname.xlsx");
		FileOutputStream fo=new FileOutputStream(obfile);
		wb.write(fo);
		fo.close();
		System.out.println("Success");
	}

}
