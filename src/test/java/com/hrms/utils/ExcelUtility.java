package com.hrms.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	public static Workbook book;
	public static Sheet sheet;

	public static void openExcel(String filePath) {

		try {
			FileInputStream fileIS = new FileInputStream(filePath);
			book = new XSSFWorkbook(fileIS);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void loadSheet(String sheetName) {
		sheet = book.getSheet(sheetName);

	}

	public static int rowCount() {
		return sheet.getPhysicalNumberOfRows();

	}

	public static int colsCount(int rowIndex) {
		return sheet.getRow(rowIndex).getLastCellNum();
	}

	public static String cellData(int rowIndex, int colIndex) {
		return sheet.getRow(rowIndex).getCell(colIndex).toString();

	}

	public static Object[][] excelIntoArray(String filePath, String sheetName) {
		openExcel(filePath);
		loadSheet(sheetName);

		int rows = rowCount();
		int cols = colsCount(0);
		Object[][] data = new Object[rows - 1][cols];
		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				data[i - 1][j] = cellData(i, j);
			}

		}
		return data;

	}

	public static List<Map<String, String>> excelIntoListOfMaps(String filepath, String sheetName) {
		openExcel(filepath);
		loadSheet(sheetName);

		List<Map<String, String>> list = new ArrayList<>();
		Map<String, String> excelMap;
		for (int r = 1; r < rowCount(); r++) {
			excelMap = new LinkedHashMap<>();
			for (int c = 0; c < colsCount(r); c++) {
				excelMap.put(cellData(0, c), cellData(r, c));
			}
			list.add(excelMap);
		}
		return list;

	}
}
