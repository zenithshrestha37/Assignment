import java.util.Scanner;

public class CountNumberofCharacter {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        str = sc.next();

        String[] strArr = str.split(" ");
        System.out.println("The number of characters in this  string are: " + strArr.length);
    }
}
