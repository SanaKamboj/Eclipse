package Solutions;

import java.util.*;

public class TopoSort {
	
	private int V;   // No. of vertices
    private LinkedList<Integer> adjVer[]; //Adjacency Lists
 
    TopoSort(int v){
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
	void toposort(){
		Stack<Integer> stack = new Stack<Integer>();
		boolean[] visited = new boolean[V];
		for(int i = 0; i < V; i++){
			if(visited[i] == false){
				tsutil(i, visited, stack);
			}
		}
		
		while (stack.empty()==false)
            System.out.print(stack.pop() + " ");
		
	}
	
	void tsutil(int i, boolean[] visited, Stack<Integer> stack){
		visited[i] = true;
			
		Iterator<Integer> itr = adjVer[i].listIterator();
		while(itr.hasNext()){
			int n = itr.next();
			if(!visited[n]){
					tsutil(n, visited, stack);
			}
		}
		
		stack.push(i);
	}
 
    // Driver method to
    public static void main(String args[])
    {
    	TopoSort g = new TopoSort(6);
		
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
		
        System.out.println("DFS for a graph:");
        g.toposort();
    }

}
