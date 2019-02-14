package steps;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.LinkedHashSet;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutils
{
private static XSSFRow row;
private static XSSFCell cell;
private static XSSFSheet sheet;
private static XSSFWorkbook workbook;
private static FileInputStream excelfile;
private static String path;
public static void setpath() throws Exception
{
       try
       {
              path="D:\\testdata.xlsx";
              excelfile =new FileInputStream(path);
              workbook=new XSSFWorkbook(excelfile);
              sheet=workbook.getSheet("sheet1");
       }
       catch(Exception e)
       {
              e.printStackTrace();
       }
}
public static HashMap getCell() throws Exception
{
	  HashMap<String,String> hm= new HashMap<String,String>();
       String from="";
       String to="";
       int first=sheet.getFirstRowNum();
       int last=sheet.getLastRowNum();
       
       for(int i=first;i<=last;i++ )
       {
    	   if(sheet.getRow(i)!=null)
    	   {
    		   row=sheet.getRow(i);
    		   cell=row.getCell(0);
    		   from=cell.toString();
    		   cell=row.getCell(1);
    		   to=cell.toString();
    		   hm.put(from, to);
    	   }
       }
       
       return hm;
       
}

}
