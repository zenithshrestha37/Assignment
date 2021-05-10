import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String n=sc.nextLine();
        String[] arr=n.split(" ");
        for(int i=0; i<arr.length;i++)
        {
            StringBuffer s= new StringBuffer(arr[i]);
            System.out.print(s.reverse()+ " ");
        }

    }

}
}
