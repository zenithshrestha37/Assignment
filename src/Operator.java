import java.util.Scanner;

public class Operator {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a choice");
        int n= sc.nextInt();
        System.out.println("enter number 1");
        int first= sc.nextInt();
        System.out.println("enter number 2");
        int second= sc.nextInt();

        double result = 0;
        switch(n)
        {
            case 1:
                result= first+second;
                break;
            case 2:
                result= first-second;
                break;
            case 3:
                result= first*second;
                break;
            case 4:
                result= first/second;
                break;
            case 5:
                System.out.println("enter number 3");
                int first1= sc.nextInt();

                System.out.println("enter number 4");
                int second1= sc.nextInt();

                result= (first+second+first1+second1)/4.0;
        }
        if (result<0) {
            System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
        }
        else
        {
            System.out.println("answer is" +result);
        }
    }


}
