package C012;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 0-Filepath (Location of the Excel file)
 * 1-Workbook
 * 2-Sheet1,sheet2,sheet3
 * 3-Rows and Columns
 */

public class _02_ExelIntro {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Owner\\Desktop\\TestFile.xlsx";  //Don't forget the file name here, including the extension. (.xlsx)
//        System.out.println("filePath = " + filePath);
        FileInputStream fis = new FileInputStream(filePath); // Specifying the excel filepath and insert  it inside FIS

        Workbook workbook = new XSSFWorkbook(fis);                // Access the workbook (exel file)
        Sheet sheet = workbook.getSheet("sheet1");              // Access the sheet within the workbook
        Row row = sheet.getRow(0);    //Acess  a row (Row 0 is considered HEader)
        Cell cell = row.getCell(0); // Access a cell (Column)
        System.out.println("cell = " + cell);// Print Row 0, cell 0 which is the very first line in exel file

        //Task 1: How to get Los Angeles?

        Row row1 = sheet.getRow(1);
        Cell r1C2 = row1.getCell(2);
        System.out.println(r1C2);

        // Task2 : how to access AZ?
        Row row2 = sheet.getRow(2);
        Cell r1C3 = row2.getCell(3);
        System.out.println("r1C3 = " + r1C3);

        //Task 3 Phoenix
        Row row3 = sheet.getRow(2);
        Cell r1C4 = row2.getCell(2);
        System.out.println("r1C4 = " + r1C4);
        //same output
        System.out.println(sheet.getRow(2).getCell(2));
    }
}