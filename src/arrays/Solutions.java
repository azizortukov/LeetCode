package arrays;

public class Solutions {

    /*
    1929. Concatenation of Array
    For more info: https://leetcode.com/problems/concatenation-of-array/description
     */

    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] result = new int[length * 2];
        System.arraycopy(nums, 0, result, 0, length);
        System.arraycopy(nums, 0, result, length, length);
        return result;
    }

}
