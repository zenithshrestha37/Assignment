import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no of rows");
        int a= sc.nextInt();
        int arr[][]= new int[5][5];
        for(int i=0;i<a;i++) {
            for(int j=0;j<a;j++) {
                if(j==0) {
                    arr[i][j]=1;
                }
                else {
                    arr[i][j]=0;
                }
            }
        }
        for(int i=1;i<a;i++)
        {
            for(int j=1;j<a;j++)
            {
                arr[i][j]= arr[i-1][j]+arr[i-1][j-1];

            }

        }

        for(int i=0;i<a;i++) {
            for(int j=0;j<a;j++) {
                if(arr[i][j]!=0)
                    System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
