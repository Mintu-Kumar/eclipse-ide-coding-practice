package codingpractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LinkedListExample {

	Node head = null;
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			this.data = d;
			
		}
	}
	
	public static boolean checkListPalindrom(LinkedListExample list)
	{
		Node start =  list.head;
		ArrayList<Integer> arr =  new ArrayList<Integer>();
		
		while(start != null)
		{
			arr.add(start.data);
			start= start.next;
		}
		for(int i=0;i<arr.size()/2;i++)
		{
			if(arr.get(i) != arr.get(arr.size()-i-1))
				return false;
		}
	
		return true;
	}
	public static LinkedListExample insert(LinkedListExample list, int data)
	{
		Node new_node =  new Node(data);
		new_node.next=null;
		
		if(list.head == null)
		{
           list.head =  new_node;
		}
		else {
			
			Node last =  list.head;
			while(last.next != null)
			{
				last = last.next;
			}
			
			last.next = new_node;
			
		}
		
		return list;
		
	}
	// insert at any position 
	public static LinkedListExample insertAtPos(LinkedListExample list, int elm, int pos)
	{
		Node newnode = new Node(elm);
		
	   if(pos == 0)	
	   {
		 newnode.next=list.head;
		 list.head = newnode;
		 return list;
		 
	   }
	   int count =0;
	   Node start =  list.head;
	   
	   for(int i=0; i<pos-1;i++)
	   {
		   start = start.next;
	   }
	   newnode.next = start.next;
	   start.next = newnode;
		
		return list;
	}
	// reverse linked list
	public static LinkedListExample reverseLinkedList(LinkedListExample list) 
	{
	   Node t1=null, t2=null;
	   Node start =  list.head;
	   
	   while(start != null)
	   {
		   t2 = start.next;
		   start.next=t1;
		   t1= start;
		   start =t2;
	   }  
	   list.head =t1;
	   
	  return list;
		
	}
	
	// print linked list
	public static void printlist(LinkedListExample list)
	{
		Node start = list.head;
		
		while(start != null)
		{
			System.out.print(start.data+"->");
			start = start.next;
		}
	}
	
	
	
	public static void main(String[] args) {
		/*
		 * Map<String,String> hm=new HashMap<>(); hm.put(null,"abc");
		 * hm.put(null,"pqr"); System.out.println(hm);
		 */
		List list = new ArrayList();
		list.add("Mintu");
		list.add(123);
		
		System.out.println(list);
		
		print("mintu");
		
		
		
		
		/*
		 * LinkedListExample list = new LinkedListExample();
		 * 
		 * list = insert(list,1); list = insert(list,2); list = insert(list,3); list =
		 * insert(list,2); list = insert(list,1); printlist(list);
		 * 
		 * //insertAtPos(list,1222,3); System.out.println(); //reverseLinkedList(list);
		 * //printlist(list);
		 * 
		 * if(checkListPalindrom(list)) System.out.println("List is Palindrom"); else
		 * System.out.println("List is not Palindrom");
		 */

	}
	public static void print(Object str){
		System.out.println("Object");
	}

	public static void print(String str){
		System.out.println("String");
	}
	
	
}

