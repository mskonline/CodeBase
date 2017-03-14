package contest.leetcode.c23;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a list of 24-hour clock time points in "Hour:Minutes" format,
 * find the minimum minutes difference between any two time points in the list.
 *
 * @author SaiKumar
 *
 */

// Solved, Not submitted

public class Problem_2 {

	public static void main(String[] args) {
		List<String> timePoints = new ArrayList<String>();
		/*timePoints.add("00:00");
		timePoints.add("23:59");
		timePoints.add("00:00");*/
		timePoints.add("01:01");
		timePoints.add("02:01");
		System.out.println(findMinDifference(timePoints));

	}

	public static int findMinDifference(List<String> timePoints) {
		int min = 0, m = 0, pairs = 0;

		for(int i = 0; i < timePoints.size(); ++i){
			for(int j = i + 1; j < timePoints.size(); ++j){
				m = timeDiff(timePoints.get(i), timePoints.get(j));
				if(m <= min)
					min = m;

				++pairs;
			}
		}

		if(pairs == 1)
			min = m;

		return min;
    }

	public static int timeDiff(String s, String t){
		int hrs1 = Integer.parseInt(s.split(":")[0]);
		int mins1 = Integer.parseInt(s.split(":")[1]);

		int hrs2 = Integer.parseInt(t.split(":")[0]);
		int mins2 = Integer.parseInt(t.split(":")[1]);

		int diffmins = 0;

		if(hrs2 >= hrs1)
			diffmins = ((hrs2 * 60) + mins2) - ((hrs1 * 60) + mins1);
		else
			diffmins = (1440 - (hrs1 * 60) + mins1) + ((hrs2 * 60) + mins2);

		return diffmins;
	}
}
