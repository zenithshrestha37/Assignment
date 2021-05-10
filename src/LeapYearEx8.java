import java.util.Scanner;

public class LeapYearEx8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the year");
        int y= sc.nextInt();
        if ((y%4==00 && y%100!=0) || y%400==0)
        {
            System.out.println("its a leap year");

        }
        else
        {
            System.out.println("its not a leap year");
        }

    }
}
