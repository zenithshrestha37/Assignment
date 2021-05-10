
import java.util.Scanner;

public class AddEverythingOtherMinMax {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number od elements");
        int n=sc.nextInt();
        int array[]=new int [n];

        int min=array[0];
        int max=array[0];
        int sum=0;
        System.out.println("enter the elemnts of array");
        for(int i=0;i<n;i++)
        {

            array[i]=sc.nextInt();

            if(array[i]<min) {
                min=array[i];
            }
            if(array[i]>max) {
                max=array[i];
            }
            sum=sum+array[i];
        }
        System.out.println(min+" " +max+" "+sum);
        sum=sum-max-min;
        System.out.println("the sum is"+sum);
    }
}
