package basics;

import demo.StringOperations;

public class SampleJava15 {

	public static void main(String[] args) {
	
		int snum ; // Declaration
			
		
		//<Data type> <Variable name>
		
		snum = 20; // Initialization
		
		int snum1 = 40;
		
		int v3;
		int v4;
		
		char c ='V';
		
		String sname ;
		sname  = "Vijay kumar";
		
		double f = 2.45;
		
		f = 3456.45;
		
		boolean bln = true;
		
		int[] smarks = new int[5];
		
		int[] num1 = {1, 5,8};
		
		// <classname> <object name> = new <classname>
		
		StudentCls15 Rethu = new StudentCls15();
		
		StudentCls15 Nihanth = new StudentCls15();
		
		StudentCls15 Sneha = new StudentCls15();
		
		StudentCls15 Vamsi = new StudentCls15();
		
		
		StringOperations obj1 = new StringOperations();
		
		obj1.read();
		
		Rethu.sid = 11;
		
		Rethu.sage = 6;
		
		StudentCls15.principal = "Kumar";
		
		Rethu.sname = "Rethanya";
		
		Nihanth.sid = 22;
		
		Nihanth.sage = 5;
		Nihanth.principal = "Kumar";
		Nihanth.sname = "Nihanth Reddy";
		
		Nihanth.show();
		
		Rethu.show();
		
		int x = 3045;
		int y = 1067;
		
		CalculatorClss calobj = new CalculatorClss();
		
		int res = CalculatorClss.Add(x, y);
		
		System.out.println(res);
		
		System.out.println(calobj.Mult(x, y));	
		
		System.out.println(CalculatorClss.Sub(x, y));
		
		System.out.println(calobj.Div(x, y));
		
		
	}

}
