package tutorial.algorithms.graphs;

import java.util.ArrayList;

public class DepthFirstSearch {

	public static void main(String[] args) {
		new DepthFirstSearch();
	}

	public DepthFirstSearch() {
		Graph g = new Graph(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(2, 3);

		boolean[] visited = new boolean[g.getNumVertices()];
		ArrayList<Integer> result = new ArrayList<>();

		DFS(0, g, visited, result);

		for (int res : result) {
			System.out.println(res);
		}
	}

	public void DFS(int currentVertex, Graph g, boolean[] visited, ArrayList<Integer> result) {
		visited[currentVertex] = true;
		result.add(currentVertex);
		int[][] adjMatrix = g.getAdjMatrix();

		for (int i = 0; i < g.getNumVertices(); ++i) {
			if (adjMatrix[currentVertex][i] == 1 && !visited[i]) {
				DFS(i, g, visited, result);
			}
		}
	}
}
