package com.test.excel;

import java.io.FileOutputStream;

public class Test01 {
    public static void main(String[] args) {
        HssFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("sheet0");
        HSSFRow row = sheet.createRow(0);
        HSSFCell cell = row.createCell(0);
        cell.setCellValue("单元格中的中文");
        FileOutputStream output = new FileOutputStream("/Users/yinhaodong/Desktop");
    }
}
