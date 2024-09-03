package codingpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class stack {
	
	
	public static void main(String[] args) {
		
		Stack<Integer>  stack =  new Stack<>();
		
		List<Integer> list =  new ArrayList<>();
		for(int i=0;i<5;i++)
			list.add(i);
		
		System.out.println(list);
		//utilityMethod utility =  new utilityMethod();
		
	
	}

}

class utilityMethod
{
	public void pop(List<Integer> list)
	{
		if(list.isEmpty())
			System.out.println("Stack is empty");
		else {
			int popElement =  list.get(list.size());
			System.out.print("Pop Element="+popElement);
			list.remove(list.size());
		}
	}
	
	public void push(List<Integer> list,int ele)
	{
		if(list.get(list.size()) == null)
			System.out.println("Stack is full you can not add the element");
		else
		   list.add(ele);
		
	}

}
