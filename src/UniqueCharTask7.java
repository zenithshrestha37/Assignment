import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniqueCharTask7 {
    public static void main(String[] args) {

        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        str = sc.next();

        List<Character> unique = new ArrayList<Character>();
        boolean flag = true;

        for (char c : str.toCharArray()) {
            if (unique.contains(c)) {
                System.out.println("This string does not have all unique characters.");
                flag = false;
                break;
            } else {
                unique.add(c);
            }
        }
        if (flag)
            System.out.println("This String has all unique characters.");

    }
}
