package LearningTestNg.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExcelfromdata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		testData("NewLoginData");
	}

	public static String[][] testData(String SheetName) throws EncryptedDocumentException, IOException {
		File file = new File("./Testdata/Testdata.xls");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(SheetName);

		int row_size = sheet.getPhysicalNumberOfRows();
		int col_size = sheet.getRow(0).getPhysicalNumberOfCells();
        //create 2D array of one row less
		String[][] data = new String[row_size - 1][col_size];
		// iterate until row size -1
		for (int i = 0; i < row_size - 1; i++) {
			for (int j = 0; j < col_size; j++) {
				// getRow() start from i+1
				data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
			}
		}

		for (int i = 0; i < row_size - 1; i++) {
			for (int j = 0; j < col_size; j++) {
				System.out.println(data[i][j]);
			}
		}
		return data;
	}

	public static void singleRead() throws EncryptedDocumentException, IOException {
		// 1st step - create file instance and provide excel file path
		File file = new File("./Testdata/Testdata.xls");
		// 2nd step - create instance for file InputStream and pass file ref_var to its
		// constructor
		FileInputStream fis = new FileInputStream(file);
		// 3rd step - Create ref variable of type workbook
		Workbook workbook = WorkbookFactory.create(fis);
		// 4th step - using workbook ref variable fetch the sheet using sheet name
		Sheet sheet = workbook.getSheet("NewLoginData");
		System.out.println(sheet.getRow(2).getCell(1));
	}

}
