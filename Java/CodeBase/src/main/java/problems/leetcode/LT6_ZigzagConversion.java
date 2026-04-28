package problems.leetcode;


import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/zigzag-conversion/
public class LT6_ZigzagConversion {

    public String convert(String s, int numRows) {
        List<ArrayList<Character>> columns = new ArrayList<>();
        int currentChar = 0;
        int currentSpacesOnTop = 0;
        int prevSpacesOnTop;

        while (true) {
            ArrayList<Character> column = new ArrayList<>(numRows);
            int currentRow = 0;

            if (currentSpacesOnTop == 0) {
                // Fill the entire column
                for (int i = 0; i < numRows; ++i) {
                    if (currentChar == s.length()) {
                        break;
                    }

                    Character c = s.charAt(currentChar);
                    column.add(c);
                    ++currentRow;
                    ++currentChar;
                }

                currentSpacesOnTop = numRows - 2;
            } else {
                int spacesToFill = currentSpacesOnTop;

                // Fill the column spaces
                for (int i = 0; i < currentSpacesOnTop; ++i) {
                    column.add(' ');
                    ++currentRow;
                }

                if (currentChar == s.length()) {
                    break;
                }

                Character c = s.charAt(currentChar);
                column.add(c);
                ++currentRow;
                ++currentChar;

                // Fill rest of the spaces
                for (int j = currentRow; j < numRows; ++j) {
                    column.add(' ');
                    ++currentRow;
                }

                prevSpacesOnTop = currentSpacesOnTop;
                currentSpacesOnTop = numRows - prevSpacesOnTop - 2;
            }

            if (currentChar == s.length()) {
                // Fill rest of the spaces
                for (int j = currentRow; j < numRows; ++j) {
                    column.add(' ');
                }
                break;
            }
        }

        return "";
    }

    public LT6_ZigzagConversion() {
        convert("PAHNAPLSIIGYIR", 4);
    }

    public static void main(String[] args) {
        new LT6_ZigzagConversion();
    }
}
