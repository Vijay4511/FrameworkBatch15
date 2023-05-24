package basics;

public class StringConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "a8b1c6";
		
		//0 1 2 3 4 5
		//a 3 b 2 c 4
		
		char c = 0;
		
		int num;
		
		String Str = "Abdul kalam";
																//1st iteration i =0 0<6
	for(int i=0;i<str.length();i++)	
	{																//Character.isAlphabetic('a')	 --> True		
		
		if(Character.isAlphabetic(str.charAt(i)))					//Character.isAlphabetic('3') --> false
		{
			c = str.charAt(i);											//c = a;
			
		}else															// 2nd iterataion i =1 ; 1<6
		{
			num = Character.getNumericValue(str.charAt(i));					//aaaaaaaab
			for(int j =0;j<num;j++)
				System.out.print(c);								// 3rd iteration i =2 2<6
			
		}															///4 th iteration i = 3 3<6
			
			
		
	}
	
		
		
		
		
	}

}
