package codingpractice;

public class ReverseSubString {

    public static void main(String[] args) {
		String str = "abc{def}ghijkl{mnop}qrst";
		String result ="";
		boolean status = true;
		char[] charArr =  str.toCharArray();
		/*
		 * char[] resultArr = new char[charArr.length]; int status = 0; for(Character c
		 * : charArr)) {
		 * 
		 * if(c.equals("{")) { resultArr[status] = "{"; } else if(c.equals("}"))
		 * resultArr[status] = "{"; }
		 */
			
		String bracketString = "";
//====================================================		
		for(Character  c : charArr)
		{
			
			if(Character.isAlphabetic(c) && status)
			{
				result =  result+c;
			}
			
			if(c.equals('{')) {
				status = false;
				
				
			}
			if(!status && !c.equals('{'))
			  bracketString = bracketString+c;
			
			if(c.equals('}'))
			{
				
				char[] bracketArray =  bracketString.toCharArray();
				result = result+"{";
				for(int j=bracketArray.length-1;j>=0;j--)
				{
					if(bracketArray[j] != '}')
					  result = result+bracketArray[j];
					
				}
				result =  result+"}";
					
				bracketString= "";
				status = true;
			}
			
		}
		System.out.println(result);
	}
    
}
