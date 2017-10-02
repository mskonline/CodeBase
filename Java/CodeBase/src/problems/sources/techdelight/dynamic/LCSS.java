package problems.sources.techdelight.dynamic;

import java.util.HashMap;
import java.util.Map;

public class LCSS {

	public static void main(String[] args) {
		lcss_withoutdp("ABCBDAB","BDCABA");

		lcss_withdp("ABCBDAB","BDCABA");
	}

	public static void lcss_withoutdp(String A, String B){
		System.out.println(lcss_withoutdp(A, B, A.length(), B.length()));
	}

	public static int lcss_withoutdp(String A, String B, int m, int n){
		if(m == 0 || n == 0)
			return 0;

		if(A.charAt(m - 1) == B.charAt(n - 1))
			return lcss_withoutdp(A, B, m - 1, n - 1) + 1;

		return Math.max(lcss_withoutdp(A, B, m - 1, n), lcss_withoutdp(A, B, m, n - 1));
	}

	public static void lcss_withdp(String A, String B){
		Map<String, Integer> lookup = new HashMap<String, Integer>();
		System.out.println(lcss_withdp(A, B, A.length(), B.length(), lookup));
	}

	public static int lcss_withdp(String A, String B, int m, int n, Map<String, Integer> lookup){
		if(m == 0 || n == 0)
			return 0;

		String key = m + "_" + n;

		if(!lookup.containsKey(key)){
			if(A.charAt(m - 1) == B.charAt(n - 1))
				lookup.put(key, lcss_withdp(A, B, m - 1, n - 1, lookup) + 1);
			else
				lookup.put(key,Math.max(lcss_withdp(A, B, m - 1, n, lookup), lcss_withdp(A, B, m, n - 1, lookup)));
		}

		return lookup.get(key);
	}
}
