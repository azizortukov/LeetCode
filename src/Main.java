import arrays.Solutions;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Solutions solution = new Solutions();
        System.out.println(solution.arrayStringsAreEqual(
                new String[]{"ab", "c"}, new String[]{"a", "b", "c"}
        ));
    }

}