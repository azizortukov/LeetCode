import arrays.Solutions;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Solutions solution = new Solutions();
        System.out.println(solution.largestAltitude(
                new int[]{28, 0, -8, -99, 11, 62, -35, 68, 2, 12, -71, 13, 66, -28}
        ));
    }

}