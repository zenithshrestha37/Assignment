import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseTask8 {
    public static void main(String[] args) {

        List<String> friends = Arrays.asList("hello", "welcome", "to", "programming");

        friends.stream().map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name + " "));

    }
}