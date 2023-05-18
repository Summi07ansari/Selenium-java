package LearningTestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Learning_readExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//1st step - create file instance and provide excel file path 
		File file=new File("./Testdata/Testdata.xls");
        //2nd step - create instance for file InputStream and pass file ref_var to its constructor
		FileInputStream fis=new FileInputStream(file);
		//3rd step - Create ref variable of type workbook
		Workbook workbook= WorkbookFactory.create(fis);
		//4th step - using workbook ref variable fetch the sheet using sheet name
		Sheet sheet = workbook.getSheet("Sheet1");
		System.out.println(sheet.getRow(2).getCell(1));
	}

}
