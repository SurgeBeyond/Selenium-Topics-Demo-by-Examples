package framework.keyworddriven;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestCaseReader {

	static FileInputStream inputStream;
	static Workbook testCaseExcelSheet;
	static Sheet[] sheets;
	int noOfSheets;

	public ArrayList<Sheet> getSheets() throws IOException {
		try {
			String testCaseFilePath = "C:\\Users\\u0119284\\WorkspaceSelenium\\Selenium\\";
			String[] testCaseFileNames = new String[] { "TestCase.xlsx"};

			ArrayList<Sheet> listOfSheets = new ArrayList<Sheet>();

			int noOfTestCaseFiles = testCaseFileNames.length;

			for (int i = 0; i < noOfTestCaseFiles; i++) {
				inputStream = new FileInputStream(new File(testCaseFilePath + testCaseFileNames[i]));
				testCaseExcelSheet = new XSSFWorkbook(inputStream);
				noOfSheets = testCaseExcelSheet.getNumberOfSheets();

				for (int x = 0; x < noOfSheets; x++) {
					listOfSheets.add(testCaseExcelSheet.getSheetAt(x));
				}
			}
			return listOfSheets;
		} finally {
			testCaseExcelSheet.close();
			inputStream.close();

		}
	}
}