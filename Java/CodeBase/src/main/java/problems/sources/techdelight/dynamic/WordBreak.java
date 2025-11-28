package problems.sources.techdelight.dynamic;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {

	public static void main(String[] args) {
		List<String> dict = new ArrayList<String>();

		dict.add("this");
		dict.add("th");
		dict.add("is");
		dict.add("famous");
		dict.add("Word");
		dict.add("break");
		dict.add("b");
		dict.add("r");
		dict.add("e");
		dict.add("a");
		dict.add("k");
		dict.add("br");
		dict.add("bre");
		dict.add("brea");
		dict.add("ak");
		dict.add("problem");

		String str = "Wordbreakproblem";

		wordBreak_withoutdp(str, dict, "");
	}

	public static void wordBreak_withoutdp(String str, List<String> dict, String out){
		if(str.length() == 0){
			System.out.println(out);
			return;
		}

		for (int i = 1; i <= str.length(); i++) {
			String prefix = str.substring(0, i);

			if(dict.contains(prefix)){
				wordBreak_withoutdp(str.substring(i), dict, out + " " + prefix);
			}
		}
	}

	public static void wordBreak_withdp(){

	}
}
