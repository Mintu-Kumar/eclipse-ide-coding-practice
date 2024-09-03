package codingpractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BrillioInterview {

	public static void main(String[] args) {
		
		String str =  "hi my name is mintu";
		
		String[] words =  str.split(" ");
		
		
		String st = "";
		for(String word : words)
		{
			char[] charArr =  word.toCharArray();
			
			int i=0;
			if(word == " ")
				st = st+word;
			for(Character c: charArr)
			{
				if(i==0)
				{
					st = st+Character.toUpperCase(c);
					i++;
				}else {
				st= st+c;
				}
				
			}
			i=0;
				
		}
		
		System.out.println(st);
		
		String str1 = "hi my name is mintu";

		System.out.println(Arrays.asList(str1.split(" ")).stream().map(s -> s.substring(0, 1).toUpperCase() + s.substring(1)).collect(Collectors.toList()));
         List<Integer> list =  Arrays.asList(1,2,4,3,6,12,66,8);
         list.stream().filter(i->i%2==0).forEach(System.out::println);
         
         int arr[] = {1,2,3,4,5};
         int min = Arrays.stream(arr).min().getAsInt();
         
         System.out.println(min);
		Integer  m =   list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(m);
		
		List<Integer> myList = Arrays.asList(10,15,8,149,25,98,32);
		myList.stream().map(s-> s+"").filter(i->i.startsWith("1")).forEach(System.out::println);
		
		List<Integer> dupList = Arrays.asList(10,15,8,15,8,149,25,98,32,32);
		Set<Integer> set  = new HashSet<Integer>();
		dupList.stream().filter(s->!set.add(s)).forEach(System.out::println);
		
		List<Integer> myList1 = Arrays.asList(10,15,8,49,25,98,98,32,15);
		int  max = myList1.stream().max(Integer::compare).get();
		System.out.println(max);
		
		List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
		 Map<String,Long>  map = names.stream()
				 					     .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 System.out.println(map);
		 
		 
		
		
		 
	}
}
