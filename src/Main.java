import arrays.Solutions;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Solutions solution = new Solutions();
        System.out.println(Arrays.toString(solution.pivotArray(
                new int[]{9, 12, 5, 10, 14, 3, 10}, 10
        )));
    }

}