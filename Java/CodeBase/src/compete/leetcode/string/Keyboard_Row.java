package compete.leetcode.string;

public class Keyboard_Row {

	public static void main(String[] args) {
		new Keyboard_Row();
	}

	public Keyboard_Row(){

		String[] words = {"Hello", "Alaska", "Dad", "Peace"};
		String[] srwords = findWords(words);

		for(String s : srwords)
			System.out.println(s);
	}

	public String[] findWords(String[] words) {
		String[] keyRows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
		java.util.ArrayList<String> srWords = new java.util.ArrayList<String>();

		for(int i = 0; i < words.length; ++i){
			String w = words[i].toLowerCase();
			String row = null;

			for(int r = 0; r < keyRows.length; ++r){
				row = keyRows[r];

				if(row.indexOf(w.charAt(0)) >= 0)
					break;
			}

			int cCount = 1;

			for(int c = 1; c < w.length(); ++c){
				if(row.indexOf(w.charAt(c)) < 0)
					break;

				++cCount;
			}


			if(cCount == w.length()){
				srWords.add(words[i]);
			}
		}

		return (String[]) srWords.toArray(new String[0]);
    }
}
