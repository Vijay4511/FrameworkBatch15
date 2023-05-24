package basics;

public class InterviewQuestPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrobj = {23,4,6,8,23,4,12};
		
		int temp,temp1;
		
		for(int i=0;i<arrobj.length;i++)						//i = 2  temp = 6 temp1 = 6 j =2
		{
			temp = arrobj[i];									// 6 factorial 6*5*4*3*2*1 = 720
						
			for(int j =i+1;j<arrobj.length;j++)
			{
				temp1 = arrobj[j];
				
				if(temp == temp1)
				{
					System.out.println("Duplicate Value"+temp);
					break;
				}
				
			}
		
		}
		

	}

}
