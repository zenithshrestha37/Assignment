import java.util.Scanner;

public class FindCharacter{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character");
        char c=input.next().charAt(0);
        if(c=='r'||c=='a'||c=='n'||c=='d'||c=='o'||c=='m'||c=='R'||c=='A'||c=='N'||c=='D'||c=='O'||c=='M'){
            System.out.println("FOUND");
        }
	else{
            System.out.println("NOT FOUND");
        }
    }
}