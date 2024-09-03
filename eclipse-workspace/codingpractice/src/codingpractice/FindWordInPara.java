package codingpractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindWordInPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Sanity checks, also known as sanity testing or sanity verification, are a set of basic tests performed on a software application or system to quickly verify that it is fundamentally functional and reasonable to proceed with more comprehensive testing.";
		
		String str1 = str.toLowerCase();
		String[] stringArr = str1.split(" ");
		
		//List<Integer> list=  new ArrayList<>();
		HashMap<Integer, Integer> map =  new HashMap<Integer,Integer>();
		for(int i=0;i<stringArr.length;i++)
		{
			if(stringArr[i].equals("sanity"))
			{ 
				 
				for(int j=i+1; j<stringArr.length; j++)
				{
					
					if(!stringArr[j].equals("testing") && stringArr[j] != " ")
					{
						
					}
					else {
						
							map.put(i, j);
							
						}
					
					
				}
			}
			
		}
		
		System.out.println(map);
		//System.out.println(count);

	}

}

/*
 * if(stringArr[i].equals("sanity")) count++;
 * 
 * if(!stringArr[i].equals("sanity") && stringArr[i] != " ") wordDistance++;
 * else { list.add(wordDistance); wordDistance =0; }
 */
