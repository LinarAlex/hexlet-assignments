package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
public class AppTest {
    @Test
    void enlargeArrayImageTest1() {
        String[][] image = {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"},
        };
        String[][] actual = App.enlargeArrayImage(image);
        String[][] expected = {
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
        };
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void enlargeArrayImageTest2() {
        String[][] image = {
                {"*", "*"},
                {"*", " "},
                {"*", "*"},
        };
        String[][] actual = App.enlargeArrayImage(image);
        String[][] expected = {
                {"*", "*", "*", "*"},
                {"*", "*", "*", "*"},
                {"*", "*", " ", " "},
                {"*", "*", " ", " "},
                {"*", "*", "*", "*"},
                {"*", "*", "*", "*"},
        };
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void enlargeArrayImageTestEmpty() {
        String[][] image = new String[0][];
        String[][] actual = App.enlargeArrayImage(image);
        String[][] expected = new String[0][];
        assertThat(actual).isEqualTo(expected);
    }
}
// END
