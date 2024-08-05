import arrays.Solutions;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Solutions solution = new Solutions();
        System.out.println(solution.numberOfBeams(
                new String[]{"011001", "000000", "010100", "001000"}
        ));
    }

}