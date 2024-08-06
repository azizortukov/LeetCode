import arrays.Solutions;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Solutions solution = new Solutions();
        System.out.println(Arrays.deepToString(solution.sortTheStudents(
                new int[][]{{10, 6, 9, 1}, {7, 5, 11, 2}, {4, 8, 3, 15}}, 2
        )));
    }

}