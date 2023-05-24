package basics;

import java.util.ArrayList;

public class ArrayLoop15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String std = "Kumar";
		
		//maths, scince, social ,
		
		
		int[] submarks = new int[5]; 
		
		ArrayList arlstobj = new ArrayList();
		
		arlstobj.add("Vijay");
		arlstobj.add("2");
		arlstobj.add("Nihanth");
		
		arlstobj.add("Siva");
		
		for(Object s:arlstobj)
			System.out.println(s);
		
		
		int[] snum1 = {23,45,67};
		
		submarks[0] = 24;
		submarks[1] = 89;
		submarks[2] = 95;
		submarks[3] = 32;
		submarks[4] = 75;
		
		//Create a arralylist object ... Add values "Siva" , KUmar, Sankar, Rethanya
		
		//CHeck whether "Vizak" is present in arraylist or not .. print all the values

		
	int len =	submarks.length;
	
	//System.out.println(len);
		
		//for(initialization;condition;increment)  old new way
	
	//if(condition)
	//{
		//line of code
	//}
		
		for(int i=0;i<len;i++)
		{
			
			System.out.println("Subject"+i+": "+submarks[i]);
			if(submarks[i]>35)
			{
		
				System.out.println("Pass");
			}
			
			else
			{

				System.out.println("FAIL");
			}
			
		}
	
		System.out.println("End of loop");
		
		
		String[] StrArray = {"Vijay","Reddy","Siva","Rethu"};
		
		//for(<data type><Variable name> : <ArrayName>)
		
		for(String s : StrArray)
			System.out.println(s);
		
		/*
		i=0;
		0<4  --> True
		1 st execution --> 65
		
	2nd loop
		i =1
		1<4 --> True
		2nd execution --> 65
	3rd loop	
		i=2
		2<4 --> True
		3rd Execution --> 65
	4th loop
		i=3
		3<4 --> True
		4th execution --> 65
	5th loop	
		i=4
		4<4 --> False
		
		
		
		
		
		
		
		
		
		
		
		
			
	
*/
	}

}
