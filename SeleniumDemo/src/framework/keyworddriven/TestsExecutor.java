package framework.keyworddriven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestsExecutor {

	public static Properties properties = new Properties();
	public static boolean flag = true;
	static Cell cell;

	private static String driverPath = "C:\\Users\\u0119284\\Downloads\\chromedriver_win32\\";
	private static WebElement element;

	private static String[] rowValues = new String[4];
	private static int rowValuesCount = 0;

	public static void main(String[] a) {
		try {
			System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			TestCaseReader reader = new TestCaseReader();
			ArrayList<Sheet> list = reader.getSheets();

			int noOfSheets = list.size();
			Sheet[] sheets = list.toArray(new Sheet[noOfSheets]);

			for (int loop = 0; loop < noOfSheets; loop++) {

				Iterator<Row> rowIterator = sheets[loop].iterator();

				do {
					Row row = rowIterator.next();
					Iterator<Cell> cellIterator = row.cellIterator();
					flag = cellIterator.hasNext();

					while (cellIterator.hasNext()) {
						cell = cellIterator.next();
						if (cell.getStringCellValue().equalsIgnoreCase("Property File")) {

							properties = ObjectReader.getObjectRepository(properties,
									cellIterator.next().getStringCellValue());

							System.out.print("   " + properties.getProperty("URL"));
							System.out.print("   " + properties.getProperty("SearchInputBox"));
							System.out.println();
							System.out.println();
						}
					} // End of Cell Iterator

					if (!flag)
						break;

					if (!cell.getStringCellValue().equalsIgnoreCase("Property File")) {
						break;
					}
				} while (rowIterator.hasNext());// End of row Iterator.
				rowIterator.next();

				do {
					Row row = rowIterator.next();
					Iterator<Cell> cellIterator = row.cellIterator();

					if (row.getCell(2) == null) {
						row.createCell(2, Cell.CELL_TYPE_STRING).setCellValue("");
						;
					}

					if (row.getCell(3) == (null)) {
						row.createCell(3, Cell.CELL_TYPE_STRING).setCellValue("");
						;
					}

					if (row.getCell(4) == (null)) {
						row.createCell(4, Cell.CELL_TYPE_STRING).setCellValue("");
						;
					}

					if (row.getCell(5) == null) {
						System.out.println(row.getCell(1).getStringCellValue() + " "
								+ row.getCell(2).getStringCellValue() + " " + row.getCell(3).getStringCellValue() + " "
								+ row.getCell(4).getStringCellValue());

						UIOperation.performOperation(driver, properties, row.getCell(1).getStringCellValue(),
								row.getCell(2).getStringCellValue(), row.getCell(3).getStringCellValue(),
								row.getCell(4).getStringCellValue());
					} else {

						if (row.getCell(5).getCellType() == 0) {

							System.out.println(row.getCell(1).getStringCellValue() + " "
									+ row.getCell(2).getStringCellValue() + " " + row.getCell(3).getStringCellValue()
									+ " " + row.getCell(5).getNumericCellValue());

							UIOperation.performOperation(driver, properties, row.getCell(1).getStringCellValue(),
									row.getCell(2).getStringCellValue(), row.getCell(3).getStringCellValue(),
									(int) row.getCell(5).getNumericCellValue());
						} else {

							System.out.println(row.getCell(1).getStringCellValue() + " "
									+ row.getCell(2).getStringCellValue() + " " + row.getCell(3).getStringCellValue()
									+ " " + row.getCell(4).getStringCellValue());

							UIOperation.performOperation(driver, properties, row.getCell(1).getStringCellValue(),
									row.getCell(2).getStringCellValue(), row.getCell(3).getStringCellValue(),
									row.getCell(4).getStringCellValue());
						}
					}

					System.out.println();
				} while (rowIterator.hasNext()); // End of row Iterator.
				System.out.println();

			}
		} catch (Exception e) {
			System.out.println("TestExecutor: " + e.getMessage());
		}
	}

}
