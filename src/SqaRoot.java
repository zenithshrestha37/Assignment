import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.IntStream;

public class SqaRoot {
    public static void main(String[] args) throws IOException {

        int[] arr = {10,20,30};
        try (PrintWriter pt = new PrintWriter(Files.newBufferedWriter(Paths.get("test.txt")))) {

            IntStream.of(2, 3, 4).map(n -> n * n).forEach(pt::println);
        }
    }
}
