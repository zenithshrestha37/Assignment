import java.util.Scanner;

public class IncreasingDecreasing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        if (a<b && b<c) {
            System.out.println("INCRESING");

        }
        else if (a>b && b>c)
        {
            System.out.println("DECresing");
        }
        else
        {
            System.out.println("not inc nor dec");
        }
    }
}
