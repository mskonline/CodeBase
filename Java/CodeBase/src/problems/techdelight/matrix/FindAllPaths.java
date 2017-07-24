package problems.techdelight.matrix;

import java.util.ArrayList;
import java.util.List;

// http://www.techiedelight.com/find-all-paths-from-source-to-destination-in-matrix/
public class FindAllPaths {

	public static void main(String[] args) {
		int[][] m = {{1,2,3},{4,5,6},{7,8,9}};

		List<Integer> path = new ArrayList<Integer>();
		findAllPaths(m, path, 0, 0);
	}

	public static void findAllPaths(int[][] m, List<Integer> path, int i, int j){

		//Reached last cell
		if(i == m.length - 1 && j == m[0].length - 1){
			printPath(path, m[i][j]);
			return;
		}

		//Add it to list
		//System.out.println(i + " " + j);
		path.add(m[i][j]);

		//Move right
		if(isValid(i, j + 1, m))
		findAllPaths(m, path, i, j + 1);

		//Move down
		if(isValid(i + 1, j, m))
		findAllPaths(m, path, i + 1, j);
	}

	public static void printPath(List<Integer> path, int last){
		for (Integer integer : path) {
			System.out.print(integer);
		}
		System.out.print(last);
		System.out.println();
	}

	public static boolean isValid(int i, int j, int[][] m){
		return (i >= 0 && i < m.length && j >= 0 && j < m[0].length);
	}

}
