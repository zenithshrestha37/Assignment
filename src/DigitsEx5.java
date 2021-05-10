import java.util.Scanner;

public class DigitsEx5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        long a= sc.nextLong();
        int r;
        int sum = 0;
        int count =0;
        while (a!=0)
        {
            r=(int) (a%10);
            count++;
            a= a/10;
            sum=(sum+r);

        }
        System.out.println("the sum of all the digits is "+sum);
        System.out.println("the number of all the digits is "+count);
    }

}
