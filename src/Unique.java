import java.util.Scanner;

public class Unique {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String n=sc.nextLine();
        boolean a=isUnique(n);
        System.out.println(a);

    }



    static boolean isUnique(String n) {
        for(int i=0;i<n.length();i++) {
            for(int j=i+1;j<n.length();j++) {
                if(n.charAt(i)==n.charAt(j)) {
                    return false;
                }
            }
        }
        return true;

    }
}
