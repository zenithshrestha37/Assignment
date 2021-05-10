import java.util.Arrays;
import java.util.List;

public class AvgList {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(10,20,30,40,50);

        num.stream().mapToInt(i -> i).average()
                .ifPresent(avg -> System.out.println("Average is " + avg));

    }

}
