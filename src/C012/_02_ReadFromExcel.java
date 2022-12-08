package C012;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

//NOTE: ORDER:1. Workbook, 2.Sheet, 3.Row, 4.Cell
public class _02_ReadFromExcel {
    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir") + "/testData/EmployeeList.xlsx";
        FileInputStream fis = new FileInputStream(filePath);

        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet1 = workbook.getSheet("sheet1");
        Row headerRow = sheet1.getRow(0);
        Cell r0cc5_Salary = headerRow.getCell(5);
        System.out.println("r0cc5_Salary = " + r0cc5_Salary);

        //Task: Locate and print 'QA' from the EmployeeList.xlsx (In one line)
        Cell r1c4 = sheet1.getRow(1).getCell(4);
        System.out.println("r1c4 = " + r1c4);
        System.out.println("r1c4 Data type " + sheet1.getRow(1).getCell(4).getCellType());

        //task: Get all Rows & Columns

        System.out.println("========iterate through all Rows & Columns=====================");
        //Before we start looping , we need identify total number of the rows and columns
        int rows = sheet1.getPhysicalNumberOfRows();
        //Next, Lets get total number of the columns
        short cols = sheet1.getRow(0).getLastCellNum();
        System.out.println("rows = " + rows);
        System.out.println("cols = " + cols);

        for (int i = 0; i < rows; i++) {                     //outer loop -- always count the number of rows
            for (int j = 0; j < cols; j++) {                //inner loop --always count the number of columns
                Cell cellValues = sheet1.getRow(i).getCell(j);
                System.out.print(cellValues + ",");
            }
            System.out.println();
        }

    }

}
