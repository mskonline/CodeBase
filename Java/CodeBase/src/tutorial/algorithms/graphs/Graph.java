package tutorial.algorithms.graphs;

public class Graph {

	private int numNodes;

	private int[][] adjMatrix;

	public Graph(int numNodes){
		this.numNodes = numNodes;

		adjMatrix = new int[numNodes][numNodes];
	}

	public void addEdge(int u, int v){
		this.adjMatrix[u][v] = 1;
		this.adjMatrix[v][u] = 1;
	}

	public void removeEdge(int u, int v){
		this.adjMatrix[u][v] = 0;
		this.adjMatrix[v][u] = 0;
	}

	public void printAdjMatrix(){
		for(int i = 0; i < numNodes; ++i){
			for(int j = 0; j < numNodes; ++j)
				System.out.print(this.adjMatrix[i][j] + " ");
			System.out.println();
		}
	}
}
