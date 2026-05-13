package problems.leetcode.arrays;

import java.util.Arrays;

public class LT242_Valid_Anagram {

    public boolean isAnagram(String s, String t) {
        int[] charCount = new int[26];
        boolean isAnagram = true;
        Arrays.fill(charCount, 0);

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            ++charCount['z' - c];
        }

        for (int i = 0; i < t.length(); ++i) {
            char c = t.charAt(i);
            --charCount['z' - c];
        }

        for (int i = 0; i < charCount.length; ++i) {
            if (charCount[i] < 0) {
                isAnagram = false;
                break;
            }
        }

        return isAnagram;
    }


    public LT242_Valid_Anagram() {
        System.out.println(isAnagram("ana", "ana"));
    }

    public static void main(String[] args) {
        new LT242_Valid_Anagram();
    }
}
