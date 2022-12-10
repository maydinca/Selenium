package C012;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class _04_ExcelToMap {
    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir") + "/testData/EmployeeList.xlsx";
        FileInputStream fis = new FileInputStream(filePath);

        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet1 = workbook.getSheet("sheet1");

        //Before I start looping data(cells) first I need to identify total number of ROW & COLUMNS

        int rows = sheet1.getPhysicalNumberOfRows();               //Retrieve total number of the ROWS in a given sheet
        short columns = sheet1.getRow(0).getLastCellNum();      //Retrieve total number of the COLUMNS in a given sheet


        Map<String, String> map = new LinkedHashMap<>();  //LinkedHashMAp preserves the order.

        for (int i = 0; i < rows; i++) {                 //Must start from row 1, because row 0 is for Header which we get it manually
            for (int j = 0; j < columns; j++) {
                String key = sheet1.getRow(0).getCell(j).toString();  //toString      //map.put(key,value);
                String value = sheet1.getRow(i).getCell(j).toString();
                map.put(key, value);
//                System.out.println("value = " + value);                   //todo 2nd way
//                System.out.print(sheet1.getRow(i).getCell(j)+ " ");
            }
//            System.out.println();                                           //todo 2nd way

            System.out.println(map);                                         //todo 1st way

            Set<Map.Entry<String, String>> entries = map.entrySet();
            for (Map.Entry entry : entries) {
                //System.out.println(entry0);
                System.out.println("entry.getvalue = " + entry.getValue());             //todo 3 rd way
            }
            System.out.println();                                                       //todo 3 rd way
        }
    }
}
