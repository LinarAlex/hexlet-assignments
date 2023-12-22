package exercise;



import java.util.HashMap;
import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage {
    private Map<String, String> dataMap = new HashMap<>();
    private String path;

    public FileKV(String path, Map<String, String> dataMap) {
        this.path = path;
        this.dataMap.putAll(dataMap);
    }

    @Override
    public void set(String key, String value) {
        String readPath = Utils.readFile(path);
        Map<String, String> map = Utils.unserialize(readPath);
        map.put(key, value);
        Utils.writeFile(this.path, Utils.serialize(map));
    }

    @Override
    public void unset(String key) {
        String readPath = Utils.readFile(path);
        Map<String, String> map = Utils.unserialize(readPath);
        map.remove(key);
        Utils.writeFile(this.path, Utils.serialize(map));
    }

    @Override
    public String get(String key, String defaultValue) {
        String readPath = Utils.readFile(path);
        Map<String, String> map = Utils.unserialize(readPath);
        if (map.containsKey(key)) {
            return map.get(key);
        } else {
            return defaultValue;
        }
    }

    @Override
    public Map<String, String> toMap() {
        String readPath = Utils.readFile(path);
        Map<String, String> map = Utils.unserialize(readPath);
        return new HashMap<>(map);
    }
}
// END
