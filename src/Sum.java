import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum=0;

        for (int i=0; i<10; i++)
        {

            System.out.println("enter the number");
            int n= sc.nextInt();
            sum= sum+n;

        }
        System.out.println("the sum is " +sum );
        System.out.println("the avg is" + (sum/10.00));
    }

}
