package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static void main(String[] args) {

    }

    public static Map getWordCount(String sentence) {
        Map<String, Integer> textMap = new HashMap<>();
        if (sentence.isEmpty()) {
            return textMap;
        }
        String[] splitSentence = sentence.split(" ");
        for (String key : splitSentence) {
            if (textMap.containsKey(key)) {
                textMap.put(key, textMap.get(key) + 1);
            } else {
                textMap.put(key, 1);
            }
        } return textMap;
    }

    public static String toString(Map wordsCount) {
        StringBuilder result = new StringBuilder();
        result.append("{\n");
        for (Object key : wordsCount.keySet()) {
            result.append("  ").append(key).append(":").append(" ").append(wordsCount.get(key)).append("\n");
        }
        result.append("}");
        if (wordsCount.isEmpty()) {
            return "{}";
        } else {
            return result.toString();
        }
    }
}
//END
