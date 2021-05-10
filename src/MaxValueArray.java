import java.util.Arrays;

public class MaxValueArray {
    public static void main(String[] args) {
        int[] arr = {1,2,5,8,7,14,52,51};
        int max = Arrays.stream(arr).max().getAsInt();

        System.out.println("Maximum value is: " + max);
    }
}