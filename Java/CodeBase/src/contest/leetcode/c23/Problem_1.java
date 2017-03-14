package contest.leetcode.c23;

/**
Given a string and an integer k, you need to reverse the first k characters for every 2k characters
counting from the start of the string. If there are less than k characters left,
reverse all of them. If there are less than 2k but greater than or equal to k characters,
then reverse the first k characters and left the other as original.
*/

/**
 * Input: s = "abcdefg", k = 2
   Output: "bacdfeg"
 */

// Accepted (51mins to solve)

public class Problem_1 {

	public static void main(String[] args) {
		//System.out.println(reverseStr("abcdefg", 2));
		System.out.println(reverseStr("abcd", 3));
	}

	public static String reverseStr(String s, int k) {
		StringBuffer finalStr = new StringBuffer();

		int chunkSize = 2 * k;

		if(s.length() < k){
			finalStr.append(s);
			finalStr.reverse();
			return finalStr.toString();
		}

		if(s.length() < chunkSize && s.length() >= k){
			String temp = s.substring(0, k);
			finalStr.append(temp);
			finalStr.reverse();
			temp = s.substring(k, s.length());
			finalStr.append(temp);
			return finalStr.toString();
		}

		int rounds = (int) java.lang.Math.ceil(s.length() / (chunkSize * 1.0));
		int startIndex =  0;
		int endIndex = chunkSize;

		StringBuffer reverser = new StringBuffer();

		String rtemp;
		String ntemp;
		String temp;
		for(int i = 0; i < rounds; ++i){
			temp = s.substring(startIndex, endIndex);

			if(temp.length() < k){
				rtemp = temp.substring(0, temp.length());
				ntemp = "";
			} else {
				rtemp = temp.substring(0, k);

				if(temp.length() < chunkSize)
					ntemp = temp.substring(k, temp.length());
				else
					ntemp = temp.substring(k, chunkSize);
			}

			reverser.append(rtemp);
			reverser.reverse();
			finalStr.append(reverser.toString() + ntemp);

			startIndex += chunkSize;
			endIndex += chunkSize;

			if(endIndex > s.length())
				endIndex = s.length();

			reverser.delete(0, reverser.length());
		}

		return finalStr.toString();
    }

}
