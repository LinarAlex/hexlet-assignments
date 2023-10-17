package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    public static void main(String[] args) {

    }

    public static int getCountOfFreeEmails(List<String> emailsList) {
        long result = emailsList.stream()
                .filter(email -> email.endsWith("@gmail.com") ||
                        email.endsWith("yandex.ru") ||
                        email.endsWith("@hotmail.com"))
                .count();
        return (int) result;
    }
}
// END
