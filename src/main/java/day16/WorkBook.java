package day16;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WorkBook {

    public static void main(String[] args) {
        Workbook workbook = new XSSFWorkbook();

        Sheet sheet = workbook.createSheet("Sample Sheet");

        Row row = sheet.createRow(0);

        Cell cell1 = row.createCell(0);
        cell1.setCellValue("Name");

        Cell cell2 = row.createCell(1);
        cell2.setCellValue("Age");

        Row row1 = sheet.createRow(1);
        row1.createCell(0).setCellValue("Jayaram");
        row1.createCell(1).setCellValue(26);

        Row row2 = sheet.createRow(2);
        row2.createCell(0).setCellValue("Madhan");
        row2.createCell(1).setCellValue(25);

        sheet.autoSizeColumn(0);
        sheet.autoSizeColumn(1);

        try (FileOutputStream fileOut = new FileOutputStream("example.xlsx")) 
        {
            workbook.write(fileOut);
            System.out.println("Excel file 'example1.xlsx' created successfully.");
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        finally
        {
            try 
            {
                workbook.close();
            } 
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}

