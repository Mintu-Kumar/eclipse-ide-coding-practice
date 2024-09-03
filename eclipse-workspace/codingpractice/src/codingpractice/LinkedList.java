package codingpractice;

public class LinkedList {

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
	public static LinkedList insert(LinkedList list, int data)
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
	
	
	public static void printlist(LinkedList list)
	{
		Node start = list.head;
		System.out.println("mintu");
		while(start != null)
		{
			System.out.print(start.data+"->");
			start = start.next;
		}
	}
	
	
	
	public static void main(String[] args) {
		
		LinkedList list =  new LinkedList();
		
		list =  insert(list,1);
		list =  insert(list,2);
		list =  insert(list,3);
		list =  insert(list,4);
		list =  insert(list,5);
		
		printlist(list);

	}

}
