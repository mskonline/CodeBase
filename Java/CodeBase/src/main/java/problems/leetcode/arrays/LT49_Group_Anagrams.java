package problems.leetcode.arrays;

import java.util.*;

public class LT49_Group_Anagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> grpAnagrams = new ArrayList<>();
        Map<String, List<String>> anagramsMap = new HashMap<>();

        for (String s : strs) {
            int[] chars = new int[26];
            Arrays.fill(chars, 0);
            StringBuilder key = new StringBuilder();

            for (int i = 0; i < s.length(); ++i) {
                chars['z' - s.charAt(i)] += 1;
            }

            for(int j = 0; j < chars.length; ++j) {
                if (chars[j] != 0) {
                    int cnt = chars[j];
                    char c = (char) ('a' + j);
                    String s1 = cnt + "";
                    String s2 = c + s1;
                    key.append(s2);
                }
            }

            if (anagramsMap.containsKey(key.toString())) {
                anagramsMap.get(key.toString()).add(s);
            } else {
                List<String> anagramList = new ArrayList<>();
                anagramList.add(s);
                anagramsMap.put(key.toString(), anagramList);
            }
        }

        for (String key : anagramsMap.keySet()) {
            grpAnagrams.add(anagramsMap.get(key));
        }

        return grpAnagrams;
    }


    public LT49_Group_Anagrams() {
        List<List<String>> grpAnagrams = groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});

        for (List<String> l : grpAnagrams) {
            System.out.print("[");

            for (String str : l) {
                System.out.print(str);
                System.out.print(",");
            }

            System.out.print("]");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new LT49_Group_Anagrams();
    }
}
