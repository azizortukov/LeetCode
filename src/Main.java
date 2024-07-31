import arrays.Solutions;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Solutions solution = new Solutions();
        System.out.println(solution.numberOfPairs(
                new int[]{1, 2, 4, 12}, new int[]{2, 4}, 3
        ));
    }

}