package exercise;

// BEGIN
public class InputTag implements TagInterface {
    String value;
    String type;

    public InputTag(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public String render() {
        return "<input type=\"" + this.type + "\" value=\"" + this.value + "\">";
    }

    @Override
    public String toString() {
        return render();
    }
}
// END
