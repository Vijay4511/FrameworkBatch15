package execution;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeModule {
	
	
	
	@BeforeTest
	public void DriverInitialization()
	{
		System.out.println("DriverInitialization");
	}
	@AfterTest
	public void ClosedriverObject()
	{
		System.out.println("ClosedriverObject");
	}
	
	@Test(groups= {"smoke"})
	public void SearchBuses()
	{
		System.out.println("SearchBuses");
	}
	@Test(groups= {"regression"})
	public void Bookticket()
	{
		System.out.println("Bookticket");
	}

}
