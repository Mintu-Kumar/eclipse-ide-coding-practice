package codingpractice;

public class FindPrimaryNumber {

	
	public static void main(String[] args) {
		
		int x =6;
		int flag = 0;
		if(x==1 || x==2)
		{
			System.out.println("Prime Numner");
		
			
		}
		else {
			
		
		
		for(int i=2;i<x-1;i++)
		{
			
			if(x%i == 0) {
				flag = 1;
				break;
			}	
           
		
		}
		}
		
		if(flag==0)
			System.out.println("prime number");
		else
			System.out.println(" Not a Prime number");
		
		
	}
}
