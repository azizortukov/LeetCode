import arrays.Solutions;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Solutions solution = new Solutions();
        System.out.println(solution.canAliceWin(
                new int[]{1, 2, 3, 4, 5, 14}
        ));
    }

}