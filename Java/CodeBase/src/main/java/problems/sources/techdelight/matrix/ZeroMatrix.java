package problems.sources.techdelight.matrix;

public class ZeroMatrix {

	public static void main(String[] args) {
		int[][] m = {{1,1,0,1,1},{1,1,1,1,1},{1,1,1,0,1},{1,1,1,1,1},{0,1,1,1,1}};

		fillZeros(m);
	}

	public static void fillZeros(int[][] m){
		boolean rowHasZeros = false, colHasZeros = false;

		for (int i = 0; i < m[0].length; i++) {
			if(m[0][i] == 0){
				rowHasZeros = true;
				break;
			}
		}

		for (int i = 0; i < m.length; i++) {
			if(m[i][0] == 0){
				colHasZeros = true;
				break;
			}
		}

		for (int i = 0; i < m[0].length; i++) {
			for (int j = 0; j < m.length; j++) {
				if(m[i][j] == 0)
					m[0][i] = m[j][0] = 0;
			}
		}

		for (int i = 0; i < m[0].length; i++) {
			for (int j = 0; j < m.length; j++) {
				if(m[0][i] == 0 || m[j][0] == 0)
					m[i][j] = 0;
			}
		}

		for (int i = 0; rowHasZeros && i < m[0].length; i++) {
			m[0][i] = 0;
		}

		for (int i = 0; colHasZeros && i < m.length; i++) {
			m[i][0] = 0;
		}

		//print
		for (int i = 0; i < m[0].length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
	}
}
