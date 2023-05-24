package execution;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Registration {

	@BeforeSuite
	public void ClearCache()
	{
		System.out.println("Clearing Cache files");
	}
	@AfterSuite
	public void CloseInstances()
	{
		System.out.println("CloseInstances");
	}
	
	@Test(groups= {"smoke"})
	public void SuccessfulRegis()
	{
		System.out.println("SuccessfulRegisTestcaseCode");
	}

	@Test(groups= {"regression"})
	public void NegativeValidLoginFullname()
	{
		System.out.println("NegativeValidLoginFullnameTestcaseCode");
	}
	@Test(groups= {"regression"})
	public void NegativeValidEmail()
	{
		System.out.println("NegariveValidEmailTestcaseCode");
	}
	@Test
	public void NegativeValidMobilenum()
	{
		System.out.println("NegativeValidMobilenumTestcaseCode");
	}
		


}
