package codingpractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindSubstring {

	
	public static void main(String[] args) {
		
		//If input is “abb”  then output should be “a”, “b”,”b”, “ab”, “bb”, “abb”
		
		
		 String input = "abb";
	        List<String> substrings = generateSubstrings(input);
	        
	        // Print the generated substrings
	        substrings.forEach(System.out::println);
		//===================================================
		
		  String str = "Hello world hello";
		  
		  
		  Map<String, Long> map1 = Arrays.asList(str.split(" ")) .stream()
		  .map(s->s.toLowerCase())
		  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		  
		  System.out.println(map1);
		 
		
        int[] arr =  {-40, -5, 1, 3, 6, 7, 8, 20};
        int givenNumber =  9;
        Map<Integer, Integer> map =  new HashMap<>();
        
        
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=1;j<arr.length;j++)
        	{
        		if(arr[i]+arr[j]== givenNumber)
        		{
        			System.out.println("("+arr[i]+","+arr[j]+")");
        		}
        	}
        }
        
        //-------------------------------------------------------------
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 int rem =  givenNumber-arr[i];
			 if(map.containsKey(rem))
			 {
				 int count = map.get(rem);
				 for(int j=0;j<count;j++)
				 {
					 System.out.println(rem+","+arr[i]);
				 }
			 }
			 if(map.containsKey(arr[i]))
				 map.put(arr[i],map.get(arr[i])+1);
			 else
				 map.put(arr[i], 1);
			 
			 
		 }
		 
		
	}
	 public static List<String> generateSubstrings(String input) {
	        return IntStream.range(0, input.length())
	                .mapToObj(startIndex ->
	                        IntStream.rangeClosed(startIndex + 1, input.length())
	                                .mapToObj(endIndex -> input.substring(startIndex, endIndex)))
	                .flatMap(substrings -> substrings)
	                .collect(Collectors.toList());
	    }
}
