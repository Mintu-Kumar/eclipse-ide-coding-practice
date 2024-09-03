package codingpractice;

public class SpaceReservedReverseString {

	
	public static void main(String[] args) {
		reversString("I Am Not String");
	}
	
	
	static void reversString(String str)
	{
		char[] inputString = str.toCharArray();
		char[] resultString = new char[inputString.length];
		
		for(int i=0;i<inputString.length;i++)
		{
			if(inputString[i] == ' ')
				resultString[i] = ' ';
		}
		
		int j=inputString.length-1;
		
		for(int k=0;k<inputString.length;k++)
		{
			if(inputString[k] != ' ')
			{
				if(resultString[j] == ' ') {
					j--;
				}
				resultString[j] = inputString[k];
				j--;
			}
				
		}
		
		System.out.println(resultString);
	}
}
