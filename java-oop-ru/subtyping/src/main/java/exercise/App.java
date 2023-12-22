package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void main(String[] args) {
        KeyValueStorage storage = new InMemoryKV(Map.of("key", "value", "key2", "value2"));
        swapKeyValue(storage);
        System.out.println(storage.toMap());
    }

    public static void swapKeyValue(KeyValueStorage storageMap) {
        for (Map.Entry<String, String> swapMap : storageMap.toMap().entrySet()) {
            storageMap.unset(swapMap.getKey());
            storageMap.set(swapMap.getValue(), swapMap.getKey());
        }
    }

}
// END
