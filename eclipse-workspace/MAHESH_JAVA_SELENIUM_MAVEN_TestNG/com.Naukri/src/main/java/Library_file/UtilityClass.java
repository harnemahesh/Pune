package Library_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class UtilityClass 
{
@Test
public static String GetExel(int RowIndex, int CellIndex) throws EncryptedDocumentException, IOException
{
	FileInputStream  file=new FileInputStream("C:\\Users\\Roshan\\eclipse-workspace\\MAHESH_JAVA_SELENIUM_MAVEN_TestNG\\com.Naukri\\TestData\\MAHESHXL.xlsx");
    Sheet wr=WorkbookFactory.create(file).getSheet("Sheet12");
    String Value1=wr.getRow(RowIndex).getCell(CellIndex).getStringCellValue();
      return Value1;
}

	
}
