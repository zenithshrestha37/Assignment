import java.util.Scanner;

public class MonthAndDaysEX2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the month number");
        int a= sc.nextInt();
        int arr[]= {31,28,30,31,30,31,30,31,30,31,30,31};

        if (a>=13 || a<=0) {
            System.out.println("invalid input");
        }
        else
        {
            System.out.println("days" +arr[a-1]);}
	switch(a) {
		case 1:
			System.out.println("jan has " +arr[0] +" days");
			break;
		case 2:
			System.out.println("feb has " +arr[1] +" days");
			break;
		case 3:
			System.out.println("march has " +arr[2] +" days");
			break;
		case 4:
			System.out.println("april has " +arr[3] +" days");
			break;
		case 5:
			System.out.println("may has " +arr[4] +" days");
			break;
		case 6:
			System.out.println("june has " +arr[5] +" days");
			break;
		case 7:
			System.out.println("july has " +arr[6] +" days");
			break;
		case 8:
			System.out.println("august has " +arr[7] +" days");
			break;
		case 9:
			System.out.println(" september has " +arr[8] +" days");
			break;
		case 10:
			System.out.println("october has " +arr[9] +" days");
			break;
		case 11:
			System.out.println("nov has " +arr[10] +" days");
			break;
		case 12:
			System.out.println("dec has " +arr[11] +" days");
			break;
		default:
			System.out.println("invalid month nummber entered");
				break;


		}


    }
}
