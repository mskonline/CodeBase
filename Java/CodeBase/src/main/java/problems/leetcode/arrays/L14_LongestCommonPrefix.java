package problems.leetcode.arrays;

public class L14_LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder lcprefix = new StringBuilder();

        for (int i = 0; i < strs[0].length(); ++i) {
            int matchCount = 0;
            for (String s: strs) {
                if (i < s.length() && strs[0].charAt(i) == s.charAt(i)) {
                    ++matchCount;
                }
            }

            if (matchCount == strs.length) {
                lcprefix.append(strs[0].charAt(i));
            } else {
                break;
            }
        }

        return lcprefix.toString();
    }

    public String findPrefix(String str1, String str2) {
        final StringBuilder lcprefix = new StringBuilder();
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        int loopLength = Math.min(chars1.length, chars2.length);

        for (int i = 0; i < loopLength; ++i) {
            if (chars1[i] == chars2[i]) {
                lcprefix.append(chars1[i]);
            }
        }

        return lcprefix.toString();
    }

    public L14_LongestCommonPrefix() {
        String[] strs = new String[]{"cir", "car"};
        String result = longestCommonPrefix(strs);

        System.out.println(result);
    }

    public static void main(String[] args) {
        new L14_LongestCommonPrefix();
    }
}
