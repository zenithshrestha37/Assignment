import java.util.Scanner;

public class BreakandContinue{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int no;
        do{
            no=input.nextInt();
            if(no>0){
                System.out.println("Good Going");
            }
            else{
                System.out.println("It's Over");
                break;
            }
        }while(true);
    }
}