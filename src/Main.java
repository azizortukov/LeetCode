import arrays.Solutions;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Solutions solution = new Solutions();
        System.out.println(Arrays.toString(solution.sortPeople(
                new String[]{"Mary", "John", "Emma"}, new int[]{180, 165, 170}
        )));
    }

}