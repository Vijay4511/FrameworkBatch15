package execution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TicketStatus {
	
	@Test(dependsOnMethods={"TransactionStatus"})
	public void TicketEnquiry()
	{
		System.out.println("TicketEnquiryTcname");
	}
	
	@Test
	public void TransactionStatus()
	{
		System.out.println("TransactionStatusTcname");
		Assert.fail("Failed to understand the concept");
	}
	
	@Test(groups= {"smoke"})
	public void ServiceStatus()
	{
		System.out.println("ServiceStatus");
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("user.name"));
		
	
	}
}
