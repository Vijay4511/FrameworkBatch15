package demo;

public class StringOperations {
	
	
	public static void main(String[] args) {
		
		String str1 = "Vijay";  // Literal
		
		String str2;
		
		str2 = "Vijay";
		
		String s1 = new String("Kumar"); // New Keyword
		
		String s2 = new String("Kumar");
		
		String[] strArr;
		String contactinfo = "24/7 Customer Support 0866 2570005";
		
		strArr = contactinfo.split("Support");
		
				
		for(String s:strArr)
			System.out.println(s);
		
		String custcare = strArr[1];
		
		custcare = custcare.trim();
		
		System.out.println("Customer Care Number: "+custcare);
		
		String str22 = "Vijay Kumar";
		
	
		String str44="vijay kumar";
		String nstr = "";
				char ch;
				
				for (int i=0; i<str44.length() ;i++) 
				{
				ch= str44.charAt(i);
				
				nstr=ch+nstr;
				
				}
				
				// 1st Iteration i =0
				//ch = v
				//nstr = v
				
				//2nd Iteration i =1
				//ch = i
				//nstr = i+v = iv
				
				//3rd Iteration i =2
				//ch = j
				//nstr = j+iv = jiv

				System.out.println(nstr);

	
	}
	
	public void read() {
		System.out.println("Read method from Strignoperation class");
	}

}
