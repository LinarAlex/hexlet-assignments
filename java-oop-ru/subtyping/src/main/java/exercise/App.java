package exercise;

import java.util.Map;
import java.util.Map.Entry;


// BEGIN
public class App {
    public static void main(String[] args) {

    }

    public static void swapKeyValue(KeyValueStorage storageMap) {
        for (Map.Entry<String, String> swapMap : storageMap.toMap().entrySet()) {
            storageMap.unset(swapMap.getKey());
            storageMap.set(swapMap.getValue(), swapMap.getKey());
        }
    }

}
// END
