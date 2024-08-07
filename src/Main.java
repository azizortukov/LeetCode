import arrays.Solutions;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Solutions solution = new Solutions();
        System.out.println(Arrays.toString(solution.findIntersectionValues(
                new int[]{4,3,2,3,1}, new int[]{2,2,5,2,3,6})));
    }

}