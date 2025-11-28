package tutorial.algorithms.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

	public static void main(String[] args) {
		new BreadthFirstSearch();
	}

	public BreadthFirstSearch() {
		Graph g = new Graph(3);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		//g.printAdjMatrix();

		BFS(g);
	}

	public void BFS(Graph g){
		boolean[] visited = new boolean[g.getNumVertices()];
		Queue<Integer> queue = new LinkedList<Integer>();
		int[][] adjMatrix = g.getAdjMatrix();
		int currentVertex;

		queue.add(0);

		while(!queue.isEmpty()){
			currentVertex = queue.remove();

			if(!visited[currentVertex]){
				visited[currentVertex] = true;
				System.out.println(currentVertex);

				for(int i = 0; i < g.getNumVertices(); ++i)
					if(adjMatrix[currentVertex][i] == 1)
						queue.add(i);
			}
		}
	}
}
