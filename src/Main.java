import arrays.Solutions;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Solutions solution = new Solutions();
        System.out.println(solution.restoreString(
                "codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}
        ));
    }

}