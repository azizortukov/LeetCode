import arrays.medium.ArraysSolutions;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArraysSolutions solution = new ArraysSolutions();
        System.out.println(Arrays.toString(solution.processQueries(
                new int[]{3, 1, 2, 1}, 5
        )));
    }

}