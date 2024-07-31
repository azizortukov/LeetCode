import arrays.Solutions;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Solutions solution = new Solutions();
        System.out.println(Arrays.toString(solution.createTargetArray(
                new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1}
        )));
    }

}