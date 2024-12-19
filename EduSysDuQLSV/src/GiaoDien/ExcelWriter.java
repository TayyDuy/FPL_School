/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriter {
    public static void main(String[] args) {
        // Tạo một Workbook mới (đối với định dạng .xlsx)
        Workbook workbook = new XSSFWorkbook();

        // Tạo một trang Excel mới
        Sheet sheet = workbook.createSheet("Dữ liệu mẫu");

        // Tạo dòng và ô trong trang Excel
        Row headerRow = sheet.createRow(0);

        // Tạo tiêu đề cho các cột
        String[] columns = {"STT", "Tên", "Tuổi"};
        for (int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
        }

        // Thêm dữ liệu mẫu vào các dòng tiếp theo
        Object[][] data = {
            {1, "Nguyễn Văn A", 25},
            {2, "Trần Thị B", 30},
            {3, "Lê Văn C", 22},
        };

        int rowNum = 1;
        for (Object[] rowData : data) {
            Row row = sheet.createRow(rowNum++);

            int columnNum = 0;
            for (Object field : rowData) {
                Cell cell = row.createCell(columnNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }

        // Lưu tệp Excel vào ổ đĩa
        try (FileOutputStream fileOut = new FileOutputStream("C:\\Garena\\sample.xlsx")) {
            workbook.write(fileOut);
            System.out.println("Tệp Excel đã được tạo và lưu thành công!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


