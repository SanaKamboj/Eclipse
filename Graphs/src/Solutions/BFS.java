package Solutions;
import java.util.*;

public class BFS {
	
	private int V;   // No. of vertices
    private LinkedList<Integer> adjVer[]; //Adjacency Lists
 
    BFS(int v){
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
	void bfs(int s){
		boolean[] visited = new boolean[V];
		Queue<Integer> q = new LinkedList<Integer>(); 
		
		visited[s] = true;
		q.add(s);
		
		while(!q.isEmpty()){
			s = q.poll();
			System.out.print( s + " ");
			
			Iterator<Integer> itr = adjVer[s].listIterator();
			while(itr.hasNext()){
				int n = itr.next();
				if(!visited[n]){
					visited[n] = true;
					q.add(n);
				}
			}
		}
	}
 
    // Driver method to
    public static void main(String args[])
    {
		BFS graph = new BFS(4);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);
		
        System.out.println("BFS for a graph:");
        graph.bfs(2);
    }

}
