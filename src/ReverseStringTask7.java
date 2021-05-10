import java.util.Scanner;

public class ReverseStringTask7 {
    public static void main(String[] args) {

        String str;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string you want reversed: ");
        str = sc.next();

        StringBuilder sb = new StringBuilder(str);
        sb= sb.reverse();
        System.out.println("the reversed string is " + sb);
    }
}

