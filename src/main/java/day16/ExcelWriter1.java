package day16;

		import org.apache.poi.ss.usermodel.*;
		import org.apache.poi.xssf.usermodel.XSSFWorkbook;

		import java.io.FileOutputStream;
		import java.io.IOException;

		public class ExcelWriter1 {
		    public static void main(String[] args)
		    {
		        Workbook workbook = new XSSFWorkbook();

		        Sheet sheet = workbook.createSheet("Sheet1");

		        String[] columns = {"Name", "Age", "Email"};

		        Object[][] data = {
		            {"Vishal", 27, "vishal@test.com"},
		            {"Shanthosh", 26, "sandy@test.com"},
		            {"Arun", 26, "arun@example.com"}
		        };

		        Row headerRow = sheet.createRow(0);
		        for (int i = 0; i < columns.length; i++)
		        {
		            Cell cell = headerRow.createCell(i);
		            cell.setCellValue(columns[i]);
		        }

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

		        for (int i = 0; i < columns.length; i++)
		        {
		            sheet.autoSizeColumn(i);
		        }

		        try (FileOutputStream fileOut = new FileOutputStream("output.xlsx")) 
		        {
		            workbook.write(fileOut);
		            System.out.println("Excel file 'output.xlsx' created successfully.");
		        }
		        catch (IOException e)
		        {
		            System.err.println("Error writing Excel file: " + e.getMessage());
		        } 
		        finally 
		        {
		            try {
		                workbook.close();
		            }
		            catch (IOException e) 
		            {
		                System.err.println("Error closing workbook: " + e.getMessage());
		            }
		        }
		    }
	
	}


