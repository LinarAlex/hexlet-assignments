package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static void main(String[] args) {

    }

    public static boolean scrabble(String randomChars, String word) {
        if (randomChars.length() < word.length()) {
            return false;
        }
        word = word.toLowerCase();
        char[] arrayChars = randomChars.toCharArray();
        char[] arrayWord = word.toCharArray();
        List<Character> charsList = new ArrayList<>();
        List<Character> wordList = new ArrayList<>();
        for (char w : arrayWord) {
            wordList.add(w);
        }
        for (char l : arrayChars) {
            charsList.add(l);
        }
        for (Character i : wordList) {
            if (charsList.contains(i)) {
                charsList.remove(Character.valueOf(i));
            } else {
                return false;
            }
        } return true;
    }
}
//END
