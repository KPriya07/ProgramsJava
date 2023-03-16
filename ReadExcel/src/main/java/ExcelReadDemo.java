
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  
public class ExcelReadDemo  
{  
public static void main(String args[]) throws IOException  
{  
//obtaining input bytes from a file  
FileInputStream fis=new FileInputStream(new File("D:\\JAVA\\Student.xlsx"));  
//creating workbook instance that refers to .xls file  
XSSFWorkbook wb=new XSSFWorkbook(fis);   
//creating a Sheet object to retrieve the object  
XSSFSheet sheet=wb.getSheetAt(0);  
//evaluating cell type    
for(Row row: sheet)     //iteration over row using for each loop  
{  
for(Cell cell:row)    //iteration over cell using for each loop  
{  
System.out.print(cell+ "\t");    
}  
System.out.println(); 
}   
}  
}  
