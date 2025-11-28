package contest.indeed;

public class MaxTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MaxTime();
	}

	public MaxTime(){
		System.out.println(solution(2,4,0,0));
		System.out.println(solution(1,8,3,2));
		System.out.println(solution(3,0,7,0));
		System.out.println(solution(9,1,9,7));
	}

	public String solution(int A, int B, int C, int D) {
        // write your code in Java SE 8
		int[] array = {A, B, C, D};

		// HH:MM
		int h1 = checkForValue(2, array);
		int h2 = 0, m1 = 0, m2 = 0;

		if(h1 == -1)
			return "NOT POSSIBLE";

		if(h1 == 2){
			h2 = checkForValue(3, array);
			m1 = checkForValue(5, array);
			m2 = checkForValue(9, array);

			if(h2 == -1 || m1 == -1 || m2 == -1)
				return "NOT POSSIBLE";
		}

		if(h1 == 1){
			h2 = checkForValue(9, array);
			m1 = checkForValue(5, array);
			m2 = checkForValue(9, array);

			if(h2 == -1 || m1 == -1 || m2 == -1)
				return "NOT POSSIBLE";
		}

		if(h1 == 0){
			h2 = checkForValue(9, array);
			m1 = checkForValue(5, array);
			m2 = checkForValue(9, array);

			if(h2 == -1 || m1 == -1 || m2 == -1)
				return "NOT POSSIBLE";
		}

		return "" + h1 + h2 + ":" + m1 + m2;
    }

	public int checkForValue(int value, int[] array){
		for(; value >= 0; --value){

			for(int i = 0; i < array.length; ++i){
				if(array[i] == -1)
					continue;

				if(value == array[i]){
					array[i] = -1;
					return value;
				}
			}
		}

		return value;
	}
}
