import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any words : ");
        String str = sc.nextLine();
        String[] ch = str.split(" ");
        long count = Stream.of(str.split(" ")).collect(Collectors.counting());
        System.out.printf("There are total " + count + " characters in this string.");

    }
}
