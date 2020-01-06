package com.Datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibs {
 
	public String getcelldata(String excelPath ,String sheet,int r,int c) throws Exception
	{
		FileInputStream fis= new FileInputStream(excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		String excelVal=wb.getSheet(sheet).getRow(r).getCell(c).toString();
		return excelVal;
		
	}
	public int getrowcount(String excelPath,String sheet) throws Exception
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		int rowcount=wb.getSheet(sheet).getLastRowNum(); 
		return rowcount;
		
	}
	public void setcelldata(String excelPath,String sheet,int r,int c,String data) throws Exception
	{
		FileInputStream fis= new FileInputStream(excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(r).createCell(c).setCellValue(data);
		
		FileOutputStream fos =new FileOutputStream(excelPath);
		wb.write(fos);
		wb.close();
		
		
		
		
	}
}
