package compete.hackerrank;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/find-digits

public class Find_Digits {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] results = new int[t];

        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int count = 0, lastDigit = 0;
            int number = n;

            while(n > 0){
            	lastDigit = n % 10;

            	if(lastDigit != 0 && number % lastDigit == 0)
            		++count;

            	n = n / 10;
            }

            results[a0] = count;
        }

        for (int i : results) {
			System.out.println(i);
		}
    }
}
