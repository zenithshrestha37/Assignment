import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int a= sc.nextInt();
        int sum = 0;
        int count;
        System.out.println("the list of all the n numbers is ");
        for (count=1; count<=a; count++){
            sum=sum+count;
            System.out.println(count);

        }

        System.out.println("the sum of all the natural numbers is" +sum);


    }

}
