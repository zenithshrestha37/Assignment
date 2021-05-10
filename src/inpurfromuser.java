import java.util.Scanner;

public class inpurfromuser {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value");
        String str= sc.nextLine();
        System.out.println("Entered value" +str);
    }
}
