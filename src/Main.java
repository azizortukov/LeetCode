import arrays.Solutions;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Solutions solution = new Solutions();
        System.out.println(solution.mostWordsFound(
                new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}
        ));
    }

}