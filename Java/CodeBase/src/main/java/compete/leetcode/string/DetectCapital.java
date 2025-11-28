package compete.leetcode.string;

public class DetectCapital {

	public static void main(String[] args) {
		new DetectCapital();
	}

	public DetectCapital(){
		System.out.println(detectCapitalUse("G"));
	}

	public boolean detectCapitalUse(String word) {
		int charCode, uLimit, lowLimit;

		if(word.length() == 1)
			return true;

		charCode = word.charAt(0);

		// First letter is lower
		if(charCode >= 97 && charCode <= 122)
		{
			uLimit = 90;
			lowLimit = 65;
			for(int i = 1; i < word.length(); ++i){
				charCode = word.charAt(i);

				if(charCode >= lowLimit && charCode <= uLimit)
					return false;
			}
		} else {
			// First letter is upper
			if(word.length() <= 2)
				return true;

			charCode = word.charAt(1);

			if(charCode >= 97 && charCode <= 122){
				uLimit = 90;
				lowLimit = 65;
			} else {
				uLimit = 122;
				lowLimit = 97;
			}

			for(int i = 2; i < word.length(); ++i){
				charCode = word.charAt(i);

				if(charCode >= lowLimit && charCode <= uLimit)
					return false;
			}
		}

		return true;
    }
}
