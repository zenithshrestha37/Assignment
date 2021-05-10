import java.util.Scanner;

public class NoSpace {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String n = sc.nextLine();
        n=n.replace(" ", "");
        System.out.println(n);


    }

}
}
