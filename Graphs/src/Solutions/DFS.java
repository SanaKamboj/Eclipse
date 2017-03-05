package Solutions;
import java.util.*;

public class DFS {
	
	private int V;   // No. of vertices
    private LinkedList<Integer> adjVer[]; //Adjacency Lists
 
    DFS(int v){
		V = v;
		adjVer = new LinkedList[V];
		for (int i = 0; i < V; i++){
			adjVer[i] = new LinkedList<Integer>();
		}
	}
 
    // Function to add an edge into the graph
	void addEdge(int s, int e){
		adjVer[s].add(e);
	}
 
    // prints BFS traversal from a given source s
	void dfs(int s){
		boolean[] visited = new boolean[V];
		
		dfsutil(s, visited);
	}
	
	void dfsutil(int v, boolean[] visited){
		visited[v] = true;
		
		System.out.print(v + " ");
			
		Iterator<Integer> itr = adjVer[v].listIterator();
		while(itr.hasNext()){
			int n = itr.next();
			if(!visited[n]){
					dfsutil(n, visited);
			}
		}
	}
 
    // Driver method to
    public static void main(String args[])
    {
		DFS graph = new DFS(4);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);
		
        System.out.println("DFS for a graph:");
        graph.dfs(2);
    }

}
