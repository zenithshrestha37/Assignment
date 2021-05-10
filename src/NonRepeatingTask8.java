import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingTask8 {
    public static void main(String[] args) {

        System.out.println("Please  enter  the  input  string  :");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Character firstNonRepeatedChar = logic(input);
        System.out.println("The  first  non -repeated  character  is  :    " + firstNonRepeatedChar);
        in.close();
    }

    private static Character logic(String input) {
        Character result =  input.chars()
                .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst().get();

        return result;
    }
}
