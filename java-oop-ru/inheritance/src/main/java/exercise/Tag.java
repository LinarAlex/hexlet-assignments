package exercise;


import java.util.Map;

// BEGIN
public class Tag {
    private String tagName;
    private Map<String, String> attribute;

    public Tag(String tagName, Map<String, String> attribute) {
        this.tagName = tagName;
        this.attribute = attribute;
    }

    public String getTagName() {
        return tagName;
    }

    public Map<String, String> getAttribute() {
        return attribute;
    }

    public String toString() {
        StringBuilder tagConcat = new StringBuilder();
        tagConcat.append("<" + tagName);
        for (Map.Entry<String, String> entry : attribute.entrySet()) {
            tagConcat.append(" " + entry.getKey() + "=\"" + entry.getValue() + "\"");
        }
        tagConcat.append(">");
        return tagConcat.toString();
    }
}
// END
