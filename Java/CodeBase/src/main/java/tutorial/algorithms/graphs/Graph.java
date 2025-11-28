package tutorial.algorithms.graphs;

public class Graph {

	private int numVertices;

	private int[][] adjMatrix;

	public Graph(int numVertices){
		this.numVertices = numVertices;

		adjMatrix = new int[numVertices][numVertices];
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
		for(int i = 0; i < numVertices; ++i){
			for(int j = 0; j < numVertices; ++j)
				System.out.print(this.adjMatrix[i][j] + " ");
			System.out.println();
		}
	}

	public int getNumVertices() {
		return numVertices;
	}

	public int[][] getAdjMatrix() {
		return adjMatrix;
	}
}
