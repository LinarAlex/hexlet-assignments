package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    private final Map<String, String> storage = new HashMap<>();

    public InMemoryKV(Map<String, String> storage) {
        this.storage.putAll(storage);
    }

    @Override
    public void set(String key, String value) {
        storage.put(key, value);
    }

    @Override
    public void unset(String key) {
        storage.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        if (storage.containsKey(key)) {
            return storage.get(key);
        } else {
            return defaultValue;
        }
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(storage);
    }
}
// END
