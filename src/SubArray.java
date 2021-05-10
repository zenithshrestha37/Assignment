import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {

        int n, i, j = 0;
        int arr[] = {3,5,8,7,9,3,4,6,1,2,};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == n) {
                    System.out.println(" The numbers are: " + arr[i] + " and " + arr[j]);
                }
            }
        }
    }
}