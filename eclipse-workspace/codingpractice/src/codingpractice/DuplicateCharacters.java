package codingpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicateCharachter("JavaJ2EE");
	}

	
	static void duplicateCharachter(String str)
	{
		Map<Character, Integer>  map =  new HashMap<>();
		
		char[] charArray =  str.toCharArray();
		
		for(char c:charArray)
		{
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c, 1);
		}
		
		Set<Character> charSet =  map.keySet();
		
		for(Character c: charSet)
		{
			if(map.get(c)>1)
				System.out.println("ch:"+c);
		}
		
		Set<Entry<Character,Integer>> entryset = map.entrySet();
		for(Entry<Character,Integer> set: entryset)
		{
			if(set.getValue()>1)
				System.out.println("cha="+set.getKey());
		}
		
		System.out.println(map);
		
	}
}
