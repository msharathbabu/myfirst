package com.actiTIME.genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getkeyPropValue(String proppath, String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(proppath);
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(key);
		
	}  
	
	public String getcelldata(String excelpath,String sheet,int r,int c) throws Throwable
	{
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook wb= WorkbookFactory.create(fis);
		 String excelvalue = wb.getSheet(sheet).getRow(r).getCell(c).toString();
		return excelvalue;
		
	}
	    public  int getRowcellCount(String excelpath,String sheet)throws Throwable
	    {
	    FileInputStream fis = new FileInputStream(excelpath);
	    Workbook wb=WorkbookFactory.create(fis);
	    int rowCount=wb.getSheet(sheet).getLastRowNum();
	    return rowCount;
	   
	}
	    public void setCelldata(String excelpath,String sheet,int r,int c,String data) throws Throwable {
	    	//Open the excel sheet in read mode
	    	FileInputStream fis=new FileInputStream(excelpath);
	    	Workbook wb= WorkbookFactory.create(fis);
	    	wb.getSheet(sheet).getRow(r).createCell(c).setCellValue(data);
	    	
	    	//Open the excel sheet in write mode
	    	
	        FileOutputStream fos=new FileOutputStream(excelpath);
	        wb.write(fos);
	        wb.close();

	}   

}



