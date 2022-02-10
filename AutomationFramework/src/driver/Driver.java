package driver;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import configuration.Configuration;
import functionLibrary.ApplicationLibrary;
import functionLibrary.ExcelFunctionLibrary;

public class Driver {
	
	public ApplicationLibrary lib;
	public ExcelFunctionLibrary xlLib;
	
	@BeforeSuite  //it will executed very first in the execution
	public void oneTimeSetUp() throws IOException
	{
		lib=new ApplicationLibrary();
		xlLib= new ExcelFunctionLibrary(Configuration.testDataPath);
		
		//Login to dependent machines
		
		//Clear database
		
		//delete log files
		
		//update flags in web.Config files
	}

	@AfterSuite
	public void oneTimeTearDown()
	{
		//Close all the connections
		
	}
}
