package SemiStructuredDataExercise;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.File;
import java.io.FileInputStream;

//https://www.guru99.com/all-about-excel-in-selenium-poi-jxl.html (A reference example)
public class ReadExcel {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(new File("Data/data.xlsx"));
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            //creating a Sheet object to retrieve the object
            Sheet sheet = wb.getSheetAt(0);

            for (Row row : sheet)     //iteration over row using for each loop
            {
                for (Cell cell : row)    //iteration over cell using for each loop
                {
                    System.out.println(cell.getRow().getCell(cell.getColumnIndex()));
                }
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
