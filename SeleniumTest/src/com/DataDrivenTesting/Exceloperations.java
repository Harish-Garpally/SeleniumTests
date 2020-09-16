package com.DataDrivenTesting;

import com.excel.utility.Xls_Reader;

public class Exceloperations {

	public static void main(String[] args) {
		Xls_Reader reader = new Xls_Reader("D:\\workspace\\SeleniumTest\\src\\com\\testData\\YahooTestData.xlsx");
		//reader.addSheet("RegData2");
		//reader.addSheet("Harish1");
		//reader.addColumn("Harish1", "ID NO");
		//reader.setCellData("Harish1", "ID NO", "Harish20", "hari");
		//reader.isSheetExist("Harish1");
		int colcount=reader.getColumnCount("RegData");
		System.out.println("the total no of columns in the sheet:"+(colcount));
		System.out.println(reader.getCellRowNum("RegData", "Surname", "Hari2"));
		

	}

}
