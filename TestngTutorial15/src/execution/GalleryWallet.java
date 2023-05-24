package execution;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GalleryWallet {
	
	int a;
	WebDriver driver;
	
	
	@Test(groups= {"smoke"})
	public void ViewGallery()
	{
		System.out.println("ViewGallery");
	}
	

	@Test(groups= {"regression"})
	public void ViewWalletinfo()
	{
		System.out.println("ViewWalletinfo");
	}
	
	//smoke suite ---> 
	//regression suite-->
	//module 

}
