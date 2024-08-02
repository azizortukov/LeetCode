import arrays.Solutions;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Solutions solution = new Solutions();
        System.out.println(solution.countMatches(
                List.of(
                        List.of("phone", "blue", "pixel"),
                        List.of("computer", "silver", "lenovo"),
                        List.of("phone", "gold", "iphone")
                ), "color", "silver"
        ));
    }

}