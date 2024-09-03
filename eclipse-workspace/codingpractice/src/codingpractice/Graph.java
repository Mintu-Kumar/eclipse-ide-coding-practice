package codingpractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Graph {

	private ArrayList<ArrayList<Integer>> arr;
	   
    public Graph(int v){
        arr =  new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<v;i++){
            arr.add(new ArrayList<Integer>());
        }
        
    }
     public void addEdge(int source,int destination){
         arr.get(source).add(destination);
         arr.get(destination).add(source); //enable to make graph undirected
         
         
     }
     
     public void traverseGraph(){
         
         for(ArrayList<Integer> arrlist : arr){
            System.out.println(arrlist);
         }
     }
     
     public boolean isCycle(int V)
     {
         boolean[] vis = new boolean[V];
			
			  for(int i=0;i<V;i++)
			  { 
				  if(!vis[i])
				  { 
				  if(checkForCycle(i,vis,-1,V)) return true;
				  }
			  
			  }
			 
        /* for(int i=0;i<V;i++){
             if(!vis[i]){
             if(dfsCheckForcycle(i,vis,-1,V))
             return true;
             }*/
             
         
         return false;
     }
    // detecting cycle in graph using BFS 
     public boolean checkForCycle(int v, boolean[] vis, int parent, int V)
     {
        
         
         Queue<Integer> q = new LinkedList<>();
         int[] parentArr = new int[V];
          vis[v] = true;
        
          q.add(v);
          parentArr[v] = parent;
         while(!q.isEmpty())
         {
            int cur = q.poll();
             System.out.println("cur="+cur);
             for(int neig:arr.get(cur))
              
             {
                 System.out.println("neig "+neig);
                 if(!vis[neig]){
                     System.out.println("Inside if ");
                     vis[neig] = true;
                     q.add(neig);
                     parentArr[neig] =cur;
                     System.out.println("Paren of cur:"+parentArr[cur]);
                 }
                 else if(neig != parentArr[cur]){
                     System.out.println("else if neig ="+neig);
                     System.out.println("else if parentArr[cur] ="+parentArr[cur]);
                     return true;
                 }
             }
             
         }
         return false;
         
         
     }
     
     public boolean dfsCheckForcycle(int v, boolean vis[], int parent, int V) {
    	 
    	 vis[v] = true;
    	 Stack<Integer> s =  new Stack<Integer>();
    	 int[] Parr = new int[V];
    	 s.push(v);
    	 Parr[v]=-1;
    	 
    	 while(!s.isEmpty()) {
    		 int cur = s.pop();
    		 
    		 for(int neig: arr.get(cur)) {
    			 if(!vis[neig]) {
    				s.push(neig);
    				Parr[neig] = cur;
    			 }
    			 else if(neig != Parr[cur])
    				 return true;
    		 }
    		 
    	 }
    	 
    	 
    	 return false;
     }
    
   
        
	public static void main(String[] args) {
	    System.out.println("Enter the number of node and vertices persent in graph:");
	    Scanner sc =  new Scanner(System.in);
	    int v =  sc.nextInt();
	    int e =  sc.nextInt();
	    Graph graph = new Graph(v);
	    
	    System.out.println("Enter "+e+ " edges");
	    for(int i=0;i<e;i++){
	        int sou = sc.nextInt();
	        int des = sc.nextInt();
	        graph.addEdge(sou,des);
	    }
	    
	    graph.traverseGraph();
	    
	    boolean staus = graph.isCycle(v);
	    if(staus)
	    System.out.println("cycle found");
	    else
	    System.out.println("cycle not found");
	    
	}

}
