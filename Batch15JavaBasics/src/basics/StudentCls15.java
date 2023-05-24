package basics;

public class StudentCls15 {
	
	int sid ;
	
	int sage;
	
	
	String sname;
	
	static String principal;
	
	
	//<Access modifier><return type><method name>
	
	protected  void  show()
	{
		System.out.println("Student Name: "+sname+"  Student Age: "+sage + "  Student id : "+sid + "  Student Principal : "+principal);
	}
	
	public static void Read()
	{
		int loc ;
		System.out.println("Read method was called");
		
	}
	
	public int Write()
	{
		int loc = 50;
				
		System.out.println("Write method" + sname);
		
		return loc;
	}
	
	public void Play()
	{
		System.out.println("Play method was called"+principal);
	}
	
	
	

}
