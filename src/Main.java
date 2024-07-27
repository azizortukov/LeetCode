import arrays.Solutions;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        Solutions solution = new Solutions();
        System.out.println(solution.minMovesToSeat(
                new int[]{3,1,5}, new int[]{2,7,4}
        ));
    }

}