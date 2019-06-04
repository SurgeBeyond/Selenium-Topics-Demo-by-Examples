package framework.datadriven;
		
		import java.io.File;
		import java.io.FileInputStream;
		import java.io.IOException;
		import org.apache.poi.hssf.usermodel.HSSFWorkbook;
		import org.apache.poi.ss.usermodel.Row;		
		import org.apache.poi.ss.usermodel.Sheet;
		import org.apache.poi.ss.usermodel.Workbook;
		import org.apache.poi.xssf.usermodel.XSSFWorkbook;
		
		public class ReadFromExcelSheet {

		    public void readExcelSheet(String filePath,String fileName,String sheetName) throws IOException{

		    //Create an object of File class to open excel file
		    File file =    new File(filePath+"\\"+fileName);

		    //Create an object of FileInputStream class to read excel file
		    FileInputStream inputStream = new FileInputStream(file);

		    Workbook workBook = null;

		    //Find the file extension by splitting file name in substring  and getting only extension name
		    String fileExtension = fileName.substring(fileName.indexOf("."));

		    //verify that if the file extension is xlsx 
		    if(fileExtension.equals(".xlsx")){
		    //create an object of XSSFWorkbook class
		    workBook = new XSSFWorkbook(inputStream);
		    }
		    //verify if the file extension is xls
		    else if(fileExtension.equals(".xls")){
		        //create an object of XSSFWorkbook class
		        workBook = new HSSFWorkbook(inputStream);
		    }
		    else {
		    	System.out.println("File is not an Excel file.... Exit");
		    	System.exit(0);
		    }

		    //Read sheet inside the workbook by its name
		    Sheet sheet = workBook.getSheet(sheetName);

		    //Find number of rows in excel sheet
		    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		    
		    	    //Create a loop for the rows of excel sheet to read		    
		    		    for (int i = 0; i < rowCount+1; i++) {	    		    	
		        Row row = sheet.getRow(i);

		        //Create a loop for each cell in a row
		        for (int j = 0; j < row.getLastCellNum(); j++) {
		            //Print cell data in console
		            System.out.print(row.getCell(j).getStringCellValue()+"            ");
		        }

		        System.out.println();
		    } 

		    }  
		    
		    //Main function to call readExcelSheet function to read data from excel file
		    public static void main(String[] args) {

		    	try {
		    //Create an object of class ReadFromExcelSheet
		    ReadFromExcelSheet readFromExcelSheet = new ReadFromExcelSheet();

		    //Prepare the path, fileName and sheet name of Excel.
		    String filePath = "C:\\Users\\Public";
		    String fileName="TestExcelFile.xls";
		    String sheetName= "sheet1";

		    //Call read method of the class to read Excel sheet data
		    readFromExcelSheet.readExcelSheet(filePath, fileName, sheetName);

		    	}catch(Exception exception) {
		    		System.out.println(exception.getMessage());
		    	}
		    }
		    	

		}

