package codingpractice;

public class SubArrayWhoseSumIsNumber {
	
	public static void main(String[] args) {
		
		findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);
	}
	
	
	static void findSubArray(int[] inputArray, int inputNumber)
	{
		int sum = inputArray[0];
		int start=0;
		
		for(int i=1;i<inputArray.length;i++) {
			
			sum = sum+inputArray[i];
			
			while(sum>inputNumber && start<=i-1)
			{
				sum =  sum-inputArray[start];
				start++;
			}
			
			if(sum== inputNumber)
			{
				for(int j=start;j<=i;j++)
				{
					System.out.println(inputArray[j]);
				}
			}
		}
		
	}

}
