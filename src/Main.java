import arrays.Solutions;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Solutions solution = new Solutions();
        System.out.println(solution.sumIndicesWithKSetBits(
                List.of(5, 10, 1, 5, 2), 1
        ));
    }

}