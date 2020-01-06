package com.TestNG.Tasks;


import org.testng.Reporter;
import org.testng.annotations.Test;

@Test(groups="AllTesting")
public class GroupingExe 
{
	@Test(groups="smoke")
	public  void Smoke1()
	{
		Reporter.log("Smoketesting", true);
			
	}
	@Test(groups="smoke")

	public  void Smoke2()
	{
		Reporter.log("Smoketesting", true);
			
	}
	@Test(groups="smoke")

	public  void Smoke3()
	{
		Reporter.log("Smoketesting", true);
			
	}
	@Test(groups="IT")

	public  void IT1()
	{
		Reporter.log("ITTesting", true);
			
	}
	@Test(groups="IT")

	public  void IT2()
	{
		Reporter.log("ITTesting", true);
			
	}
	@Test(groups="FT")

	public  void FT1()
	{
		Reporter.log("FTTesting", true);
			
	}
	@Test(groups="FT")

	public  void FT2()
	{
		Reporter.log("FTTesting", true);
			
	}
	@Test(groups="FT")

	public  void FT3()
	{
		Reporter.log("FTTesting", true);
			
	}
	@Test(groups="smoke")

	public  void Smoke4()
	{
		Reporter.log("SmokeTesting", true);
			
	}
	

}


