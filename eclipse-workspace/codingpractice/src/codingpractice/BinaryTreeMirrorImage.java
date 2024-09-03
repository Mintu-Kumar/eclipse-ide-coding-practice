package codingpractice;

import java.util.Scanner;

public class BinaryTreeMirrorImage {

	Node head;
	class Node
	{
		 int data;
		 Node left;
		 Node right;
		 
		 Node(int data)
		 {
			 this.data = data;
			 this.left  = null;
			 this.right = null;
			 
		 }
	}
	
	public static BinaryTreeMirrorImage inser(BinaryTreeMirrorImage list, int data)
	{
	    
		Node start = list.head;
		                          
		if(start == null)
		{
			return list;
		}
		else {
		 
			while(start.left!=null)
			{
				 int temp = start.right.data;
				  start.right.data = start.left.data;
				  start.left.data = temp;
				     
			}
			while(start.right!=null)
			{
				int temp1 = start.right.data;
				  start.right.data = start.left.data;
				  start.left.data = temp1;
			}
		  
		
		  
		}
		
		return list;
	}
	
	public static void main(String[] args) {
	
	
	 
	 
	}

}
