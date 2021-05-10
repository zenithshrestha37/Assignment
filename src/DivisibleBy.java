import java.util.Scanner;

public class DivisibleBy {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();





        if(n%15==0)
        {
            System.out.println("JAVA Training consultadd");
        }
        else if(n%5==0)
        {
            System.out.println("JAVA Training");
        }
        else if(n%3==0)
        {
            System.out.println(" cosultadd");
        }
        else
        {
            System.out.println("not divisible by 3 or 5");
        }

    }

}
