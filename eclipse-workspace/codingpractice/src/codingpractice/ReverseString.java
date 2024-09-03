package codingpractice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Mintu";
		System.out.println(recursiveMethod(str));

	}
	
	
  static String recursiveMethod(String str)
	{
	  System.out.println(str);
		if(str ==null || str.length()<=1)
			return str;
		
		return recursiveMethod(str.substring(1))+str.charAt(0);
	}

}
