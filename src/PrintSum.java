import java.util.Scanner;

public class PrintSum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter first number from 1-10:");
        int a = sc.nextInt();

        System.out.println("Enter second number from 1-10:");
        int b = sc.nextInt();

        int z;
        z= a+b;
        z= z+30;

        System.out.println("the sum" +z);


    }
}
