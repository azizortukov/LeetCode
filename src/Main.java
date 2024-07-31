import arrays.Solutions;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Solutions solution = new Solutions();
        System.out.println(solution.minOperations(
                new int[]{2, 11, 10, 1, 3}, 10
        ));
    }

}