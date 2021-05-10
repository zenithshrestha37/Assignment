import java.util.Scanner;


public class FloatingPoint {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 2 floating point number");
        float a= sc.nextFloat();
        float b= sc.nextFloat();
        if((int)(a*100)==(int)(b*100))
        {
            System.out.println("the floating point number is same");
        }
        else
        {
            System.out.println("floating point numbers are different");
        }
    }

}
