package contest.leetcode.c25;


// Accepted
public class PerfectNumber {

	public static void main(String[] args) {
		new PerfectNumber();

	}

	public PerfectNumber(){
		System.out.println(checkPerfectNumber(28));
	}

	public boolean checkPerfectNumber(int num) {
        int sum = 1, div = 0;
        int sqrt = (int) java.lang.Math.sqrt(num);

        for(int i = 2; i <= sqrt; ++i){
        	if(num % i == 0){
        		sum += i;
        		div = num / i;
                if(div != i)
                   sum += div;
        	}
        }
		return (sum == num && sum != 1) ? true : false;
    }
}
