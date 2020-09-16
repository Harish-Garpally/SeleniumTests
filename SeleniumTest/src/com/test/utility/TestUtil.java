package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class TestUtil {
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> GetDatafromexcel() {
		
		ArrayList<Object[]> myData= new ArrayList<Object[]>();
		try {
			reader= new Xls_Reader("D:\\workspace\\SeleniumTest\\src\\com\\testData\\YahooTestData.xlsx");
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		for(int rownum=2;rownum<=reader.getRowCount("RegData");rownum++) {
			
			String Firstname = reader.getCellData("RegData", "Firstname", rownum);
			String Surname = reader.getCellData("RegData", "Surname", rownum);
			String Emailaddress = reader.getCellData("RegData", "Emailaddress", rownum);
			String Mobilenumber = reader.getCellData("RegData", "Mobilenumber", rownum);
			String Birthmonth = reader.getCellData("RegData", "Birthmonth", rownum);
			String Day = reader.getCellData("RegData", "Day", rownum);
			String Year = reader.getCellData("RegData", "Year", rownum);
			String Gender = reader.getCellData("RegData", "Gender", rownum);
			
			Object ob[]= {Firstname,Surname,Emailaddress,Mobilenumber,Birthmonth,Day,Year,Gender};
			
			myData.add(ob);
		}
		
		return myData;
		
	}

}
