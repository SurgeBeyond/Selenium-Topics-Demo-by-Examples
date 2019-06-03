package readwriteexcel;
		
		import java.io.File;
		import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
		import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;		
		import org.apache.poi.ss.usermodel.Sheet;
		import org.apache.poi.ss.usermodel.Workbook;
		import org.apache.poi.xssf.usermodel.XSSFWorkbook;
		
		public class WriteToExcelSheet {

		    public void writeExcelSheet(String filePath,String fileName,String sheetName, String[] dataToWriteInSheet) throws IOException{

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
        
	        int loop=0;
	        
	        // Loop to reach first empty row
	        while(sheet.getRow(loop)!=null) {loop++;}
	        
	        // create first row, after traversing the all filled rows
	        Row row = sheet.createRow(loop);   	
	        
		        for(int j = 0; j < dataToWriteInSheet.length; j++){

		            //Fill data in row
		            Cell cell = row.createCell(j);
		            cell.setCellValue(dataToWriteInSheet[j]);
		        }

	        //Close input stream
	        inputStream.close();

	        //Create an object of FileOutputStream class to create write data in excel file
	        FileOutputStream outputStream = new FileOutputStream(file);

	        //write data in the excel file
	        workBook.write(outputStream);

	        //close output stream
	        outputStream.close();
		    }  
		    
		    //Main function to call readExcelSheet function to read data from excel file
		    public static void main(String[] args) {

		    	try {
		    //Create an object of class ReadFromExcelSheet
		    WriteToExcelSheet readFromExcelSheet = new WriteToExcelSheet();

		    //Prepare the path, fileName and sheet name of Excel.
		    String filePath = "C:\\Users\\Public";
		    String fileName="TestExcelFileWrite.xls";
		    String sheetName= "sheet1";
		    String[] employeeNames = {"Mr. John", "Mr. Smith"};

		    //Call read method of the class to read Excel sheet data
		    readFromExcelSheet.writeExcelSheet(filePath, fileName, sheetName, employeeNames);

		    	}catch(Exception exception) {
		    		System.out.println(exception.getMessage());
		    	}
		    }		    	
		}

