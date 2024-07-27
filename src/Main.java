import arrays.Solutions;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        Solutions solution = new Solutions();
        System.out.println(solution.numberOfEmployeesWhoMetTarget(
                new int[]{0, 1, 2, 3, 4}, 2
        ));
    }

}