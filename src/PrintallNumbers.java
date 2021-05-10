import java.util.Scanner;

public class PrintallNumbers{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
		System.out.println("Enter Floating Number:");
    float a=input.nextFloat();
		if(a==0){
        System.out.println("zero");
    }
		else if (a>0){
        if(a<1){
            System.out.print("small");
        }
        else if(a>1000000){
            System.out.println("large");
        }
        System.out.println("positive");
    }
	else if(a<0){
        System.out.println("negative");
    }
}
         }