/*
    Given a string of words, you need to find the highest scoring word.
Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
You need to return the highest scoring word as a string.
If two words score the same, return the word that appears earliest in the original string.
All letters will be lowercase and all inputs will be valid.
 */
package Strings;

public class HighestScoringWord {
    static String[] alphabet = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                                            "l", "m", "n", "o", "p", "q", "r", "s", "t", "u",
                                            "v", "w", "x", "y", "z"};

    public static String high(String s) {
        int maxScore = 0;
        String highestScoringWord = "";
        String[] words = s.split("\\s");

        for (String word : words) {
            if (highestScoringWord(word) > maxScore) {
                maxScore = highestScoringWord(word);
                highestScoringWord = word;
            }
        }
        return highestScoringWord;
    }

    private static int highestScoringWord(String word) {
        int maxScore = 0;
        String[] word1 = word.split("");

        for (String s : word1) {
            for (int j = 0; j < alphabet.length; j++) {
                if (s.equals(alphabet[j])) {
                    maxScore += (j + 1);
                }
            }
        }
        return maxScore;
    }
}
