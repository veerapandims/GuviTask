package day16;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	
		import org.apache.poi.ss.usermodel.*;
		import org.apache.poi.xssf.usermodel.XSSFWorkbook;

		import java.io.FileOutputStream;
		import java.io.IOException;

		@SuppressWarnings("unused")
		public class ExcelWriter {
		    public void main(String[] args) 
		    {
		        Workbook workbook = new XSSFWorkbook();

		        Sheet sheet = workbook.createSheet("Sheet1");

		        Row headerRow = sheet.createRow(0);
		        String[] headers = {"Name", "Age", "Email"};
		        for (int i = 0; i < headers.length; i++) 
		        {
		            Cell cell = headerRow.createCell(i);
		            cell.setCellValue(headers[i]);
		        }

		        Object[][] data = {
		            {"John Doe", 30, "john@test.com"},
		            {"John Doe", 28, "john@test.com"},
		            {"Bob Smith", 35, "jacky@example.com"},
		            {"Swapnil", 37, "swapnil@example.com"}
		        };

		        for (int i = 0; i < data.length; i++)
		        {
		            Row row = sheet.createRow(i + 1); 
		            for (int j = 0; j < data[i].length; j++) 
		            {
		                Cell cell = row.createCell(j);
		                if (data[i][j] instanceof String) 
		                {
		                    cell.setCellValue((String) data[i][j]);
		                } 
		                else if (data[i][j] instanceof Integer) 
		                {
		                    cell.setCellValue((Integer) data[i][j]);
		                }
		            }
		        }

		        for (int i = 0; i < headers.length; i++)
		        {
		            sheet.autoSizeColumn(i);
		        }

		        try (FileOutputStream fileOut = new FileOutputStream("UserData.xlsx")) 
		        {
		            workbook.write(fileOut);
		            System.out.println("Excel file 'UserData.xlsx' created successfully.");
		        }
		        catch (IOException e)
		        {
		            System.err.println("Error writing Excel file: " + e.getMessage());
		        } finally
		        {
		            try {
		                workbook.close();
		            } 
		            catch (IOException e) {
		                System.err.println("Error closing workbook: " + e.getMessage());
		            }
		        }
		    }	

	}


