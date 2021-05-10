import java.util.Scanner;

public class LengthOfShortestSWord {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String s = sc.nextLine();


        String[] words = s.split(" ");
        int min= words[0].length();
        for( int i=0; i<words.length; i++)
        {
            if(words[i].length()<min)
            {
                min=words[i].length();
            }
        }
        System.out.println(min);


    }

}
