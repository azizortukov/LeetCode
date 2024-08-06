import arrays.Solutions;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Solutions solution = new Solutions();
        System.out.println(solution.garbageCollection(
                new String[]{"G", "P", "GP", "GG"},
                new int[]{2, 4, 3}
        ));
    }

}