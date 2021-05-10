import java.util.HashMap;
import java.util.Scanner;

public class COuntEachChar {

    public static void main(String[] args)
    {
        String str;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String");
        str = sc.next();
        characterCount(str);
    }

    private static void characterCount(String s)
    {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        char[] strArray = s.toCharArray();

        for (char c : strArray)
        {
            if(count.containsKey(c))
            {

                count.put(c, count.get(c)+1);
            }
            else
            {

                count.put(c, 1);
            }
        }


        System.out.println(s + " : " + count);
    }

}
