import arrays.Solutions;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        Solutions solution = new Solutions();
        System.out.println(Arrays.toString(
                solution.getConcatenation(new int[]{1, 2, 1})));
    }

}