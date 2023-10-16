package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
    List<Integer> elements;

    @BeforeEach
    void initList() {
        this.elements = new ArrayList<>();
        this.elements.add(1);
        this.elements.add(2);
        this.elements.add(3);
        this.elements.add(4);
        this.elements.add(5);
    }

    @Test
    void takeTest1() {
        int count = 7;
        List<Integer> expected = elements;
        List<Integer> actual = App.take(elements, count);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void takeTest2() {
        int count = 0;
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = App.take(elements, count);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void takeTest3() {
       int count = 5;
       List<Integer> expected = elements;
       List<Integer> actual = App.take(elements, count);
       Assertions.assertEquals(expected, actual);
    }

    @Test
    void takeTest4() {
       int count = 2;
       List<Integer> expected = new ArrayList<>();
        expected.add(elements.get(0));
        expected.add(elements.get(1));
       List<Integer> actual = App.take(elements, count);
       Assertions.assertEquals(expected, actual);
    }
}
