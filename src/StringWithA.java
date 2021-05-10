import java.util.Arrays;

public class StringWithA {
    public static void main(String[] args) {
        String []arr = {"Dale", "Steyn","Zenith","Shrestha","Bijaya"};

        Arrays.stream(arr).filter(st->(st.endsWith("A"))||
                (st.endsWith("a"))).forEach(System.out::println);


    }
}