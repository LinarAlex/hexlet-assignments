package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


// BEGIN
public class App {
    public static void main(String[] args) {

    }

    public static LinkedHashMap<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        LinkedHashMap<String, String> result = new LinkedHashMap<>();
        Set<String> set = new TreeSet<>(data1.keySet());
        set.addAll(data2.keySet());
        for (String key : set) {
            if (data1.containsKey(key)) {
                result.put(key, "deleted");
            }
            if (data2.containsKey(key)) {
                result.put(key, "added");
            }
            if (data1.containsKey(key) & data2.containsKey(key)) {
                if (data1.get(key).equals(data2.get(key))) {
                    result.put(key, "unchanged");
                } else {
                    result.put(key, "changed");
                }
            }
        } return result;
    }
}
//END
