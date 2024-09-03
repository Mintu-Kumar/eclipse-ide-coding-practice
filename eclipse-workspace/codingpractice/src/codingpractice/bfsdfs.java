package codingpractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class bfsdfs {

	 private LinkedList<Integer> arr[];
	    
	    @SuppressWarnings("unchecked")
		public bfsdfs(int v){
	        arr =  new LinkedList[v];
	        for(int i=0;i<v;i++)
	        arr[i] =  new LinkedList<Integer>();
	    }
	    
	    public void addEdges(int source, int destination){
	        arr[source].add(destination);
	        arr[destination].add(source);
	    }
	    
	     public void traverseGraph(){
	        for(int i=0; i<arr.length;i++){
	            System.out.println(arr[i]);
	        }
	    }
	    
	    public void bfs(int source, int destination){
	        boolean vis[] =  new boolean[arr.length];
	        int par[] =  new int[arr.length];
	        Queue<Integer> q = new LinkedList<>();
	        
	        vis[source] = true;
	        par[source] = -1;
	        q.add(source);
	        
	        while(!q.isEmpty()){
	            int cur = q.poll();
	            
	            for(int neighbour : arr[cur]){
	                
	                if(!vis[neighbour])
	                {
	                    vis[neighbour]=true;
	                    q.add(neighbour);
	                    par[neighbour] = cur;
	                }
	            }
	        }
	        
	        int distance =0;
	        int cur = destination;
	        
	        while(par[cur] !=-1){
	            System.out.print(cur +"->");
	            cur = par[cur];
	            distance++;
	          
	            
	        }
	          System.out.println("distance is "+ distance);
	        
	        
	    }
	    
	    public boolean dfs(int source, int destination)
	    {
	        boolean vis[] = new boolean[arr.length];
	        Stack<Integer> s = new Stack<>();
	        
	        vis[source] =true;
	        s.push(source);
	        
	        while(!s.isEmpty()){
	            
	            int cur = s.pop();
	            
	            if(cur==destination)
	            return true;
	            
	            for(int neighbour : arr[cur])
	            {
	                if(!vis[neighbour]){
	                    vis[neighbour] =true;
	                    s.push(neighbour);
	                }
	            }
	           
	        }
	         return false;
	    }
	        
		public static void main(String[] args) {
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Please enter the number of vertices and edges in the graph");
				int v =  sc.nextInt();
				int e =  sc.nextInt();
				
				bfsdfs BfsDfs =  new bfsdfs(v);
				System.out.println("Enter "+e+ "edges of the graph");
				for(int i=0;i<e;i++){
				    int source = sc.nextInt();
				    int destination =  sc.nextInt();
				    BfsDfs.addEdges(source,destination);
				    
				}
				
				BfsDfs.traverseGraph();
				
				/*
				 * System.out.
				 * println("Enter the source and destination to find the minimum distance"); int
				 * sou = sc.nextInt(); int des = sc.nextInt(); //BfsDfs.bfs(sou,des); boolean
				 * status = BfsDfs.dfs(sou,des); if(status)
				 * System.out.println("Path available between source and destination"); else
				 * System.out.println("Path is not available between source and destination");
				 */
			}
		}


}
