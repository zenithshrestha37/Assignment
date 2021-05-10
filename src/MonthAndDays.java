import java.util.Scanner;

public class MonthAndDays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the month");
        int m= sc.nextInt();
        System.out.println("enter the year");
        int y= sc.nextInt();
        switch(m)
        {
            case 1:
                System.out.println("the no of days in jan is 31");
                break;
            case 2:
                if((y%4==0 && y%100!=0) || y%400==0) {
                    System.out.println("the no of days in feb is 29");
                }
                else
                {
                    System.out.println("the no of days in feb is 28");
                }

                break;
            case 3:
                System.out.println("the no of days in march is 31");
                break;
            case 4:
                System.out.println("the no of days in april is 30");
                break;
            case 5:
                System.out.println("the no of days in may is 31");
                break;
            case 6:
                System.out.println("the no of days in june is 30");
                break;
            case 7:
                System.out.println("the no of days in july is 31");
                break;
            case 8:
                System.out.println("the no of days in august is 31");
                break;
            case 9:
                System.out.println("the no of days in sep is 30");
                break;
            case 10:
                System.out.println("the no of days in oct is 31");
                break;
            case 11:
                System.out.println("the no of days in nov is 30");
                break;
            case 12:
                System.out.println("the no of days in dec is 31");
                break;
        }

    }
}
