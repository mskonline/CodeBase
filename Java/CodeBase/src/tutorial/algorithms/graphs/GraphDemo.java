package tutorial.algorithms.graphs;

public class GraphDemo {

	public static void main(String[] args) {
		new GraphDemo();
	}

	public GraphDemo(){
		Graph g = new Graph(3);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.printAdjMatrix();
	}
}
