package codingpractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DetectCycleUsingColor {

	private LinkedList<Integer>[] arr;
	
	
	@SuppressWarnings("unchecked")
	public DetectCycleUsingColor(int v) {
		arr =  new LinkedList[v];
		for(int i=0;i<v;i++) {
			arr[i] =  new LinkedList<Integer>();
		}
		// TODO Auto-generated constructor stub
	}
	private void addEdges(int source, int destincation) {
		arr[source].add(destincation);
		arr[destincation].add(source);
		
		
	}
	
	public void traverseGraph(){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
	private boolean isCycle(int v) {
		
		boolean[] vis =  new boolean[v];
		for(int i=0;i<v;i++) {
			if(BfsCheckForCycle(i,vis,-1,v))
				return true;
						
		}
		return false;
		
	}
	


	private boolean BfsCheckForCycle(int i, boolean[] vis, int parent, int v) {
		int[] Parr =  new int[v];
		Queue<Integer> q=  new LinkedList<>();
		vis[i]= true;
		Parr[i]= parent;
		q.add(i);
		
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of vetices and edges in the graph");
		Scanner sc  =  new Scanner (System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		
		DetectCycleUsingColor graph =  new DetectCycleUsingColor(v);
		
		System.out.println("Enter " +e+ " edges");
		
		for(int i=0;i<e;i++) {
			int source = sc.nextInt();
			int destincation = sc.nextInt();
			
			graph.addEdges(source,destincation);
		}
		graph.traverseGraph();
		
		graph.isCycle(v);
		

		sc.close();
	}
	



	

}
