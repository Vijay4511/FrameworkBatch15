package basics;

interface Webdriverinterface
{
	public static final int srt = 0;
	
	public void Close();  //Abstract methods have only Initialization but no implementation
	public void FindElement();
	public void Navigate();
	public void getTitle();
	
	
}

public class Sampclassinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public class Chromedriverex implements Webdriverinterface {

		@Override
		public void Close() {
			// Actual code
			
		}

		@Override
		public void FindElement() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void Navigate() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void getTitle() {
			// TODO Auto-generated method stub
			
		}
		
		
		public void chromespecificmethod1()
		{
			
		}
		
		public void chromespecificmethod2()
		{
			
		}
		
		
	}

}
