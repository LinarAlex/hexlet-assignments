package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
public class App {
    public static void main(String[] args) {

    }

    public static String getForwardedVariables(String content) {
        return Arrays.stream(content.split("\n"))
                .filter(a -> a.startsWith("environment"))
                .map(a -> a.replaceAll("environment=", "").replaceAll("\"", ""))
                .map(a -> a.split(","))
                .flatMap(Arrays::stream)
                .filter(s -> s.startsWith("X_FORWARDED_"))
                .map(s -> s.replaceAll("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));
    }
}
//END
