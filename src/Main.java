import arrays.Solutions;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Solutions solution = new Solutions();
        System.out.println(solution.findMatrix(
                new int[]{1, 3, 4, 1, 2, 3, 1}
        ));
    }

}