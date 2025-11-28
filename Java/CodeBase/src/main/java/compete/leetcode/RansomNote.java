package compete.leetcode;

// Accepted
public class RansomNote {

	public static void main(String[] args) {
		new RansomNote();
	}

	public RansomNote(){
		System.out.println(canConstruct("abbc", "abbbc"));
	}

	public boolean canConstruct(String ransomNote, String magazine) {
        java.util.Map<Character, Integer> magazineCharCount = new java.util.HashMap<Character, Integer>();
		int v = 0;
		Character character;
		boolean canConstruct = true;

        for(int i = 0; i < magazine.length(); ++i){
        	char c = magazine.charAt(i);
        	character = new Character(c);

        	if(magazineCharCount.containsKey(character)){
        		v = magazineCharCount.get(character);
        		++v;
        		magazineCharCount.put(character, v);
        	} else
        		magazineCharCount.put(character, 1);
        }

        for(int i = 0; i < ransomNote.length(); ++i){
        	char c = ransomNote.charAt(i);
        	character = new Character(c);

        	if(magazineCharCount.containsKey(character)){
        		v = magazineCharCount.get(character);

        		if(v == 0){
        			canConstruct = false;
            		break;
        		}

        		--v;
        		magazineCharCount.put(character, v);
        	} else {
        		canConstruct = false;
        		break;
        	}
        }

		return canConstruct;
    }
}
