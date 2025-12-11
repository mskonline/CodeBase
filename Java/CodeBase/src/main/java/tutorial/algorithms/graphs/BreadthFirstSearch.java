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

    public void BFS(Graph g) {
        boolean[] visited = new boolean[g.getNumVertices()];
        Queue<Integer> queue = new LinkedList<Integer>();
        int[][] adjMatrix = g.getAdjMatrix();
        int currentVertex = 0;

        visited[currentVertex] = true;
        queue.add(currentVertex);

        while (!queue.isEmpty()) {
            currentVertex = queue.poll();

            for (int i = 0; i < g.getNumVertices(); ++i) {
                if (adjMatrix[currentVertex][i] == 1) {
                    if (!visited[i]) {
                        visited[i] = true;
                        System.out.println(i);
                        queue.add(i);
                    }
                }
            }
        }
    }
}
