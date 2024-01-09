package exercise;

import java.util.Map;
import java.util.List;

// BEGIN
public class PairedTag extends Tag {
    private String tagBody;
    private List<Tag> inheritor;

    public PairedTag(String tagName, Map<String, String> attribute, String tagBody, List<Tag> inheritor) {
        super(tagName, attribute);
        this.tagBody = tagBody;
        this.inheritor = inheritor;
    }

    @Override
    public String toString() {
        StringBuilder tagConcat = new StringBuilder();
        tagConcat.append("<" + getTagName());
        for (Map.Entry<String, String> entry : getAttribute().entrySet()) {
            tagConcat.append(" " + entry.getKey() + "=\"" + entry.getValue() + "\"");
        }
        tagConcat.append(">");
        for (Tag element : inheritor) {
            tagConcat.append(element.toString());
        }
        tagConcat.append(tagBody)
                .append("</" + getTagName() + ">");
        return tagConcat.toString();
    }
}
// END
