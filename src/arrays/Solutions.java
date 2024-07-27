package arrays;

import java.util.ArrayList;
import java.util.List;

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

    /*
    1920. Build Array from Permutation
    For more info: https://leetcode.com/problems/build-array-from-permutation/description
     */

    public int[] buildArray(int[] nums) {
        recurseBuilder(nums, 0);
        return nums;
    }

    private void recurseBuilder(int[] nums, int i) {
        if (i < nums.length) {
            int temp = nums[i];
            int res = nums[temp];
            recurseBuilder(nums, i + 1);
            nums[i] = res;
        }
    }

    /*
    1512. Number of Good Pairs
    For more info: https://leetcode.com/problems/number-of-good-pairs/description
     */

    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count ++;
                }
            }
        }
        return count;
    }

    /*
    2011. Final Value of Variable After Performing Operations
    For more info: https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description
     */

    public int finalValueAfterOperations(String[] operations) {
        int sum = 0;
        for (String operation : operations) {
            if (operation.startsWith("+") || operation.endsWith("+")) {
                sum += 1;
            } else if (operation.startsWith("-") || operation.endsWith("-")) {
                sum -= 1;
            }
        }
        return sum;
    }

    /*
    1470. Shuffle the Array
    For more info: https://leetcode.com/problems/shuffle-the-array/description
     */

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int index = 0;
        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];
            result[index++] = nums[i + n];
        }
        return result;
    }

    /*
    2942. Find Words Containing Character
    For more info: https://leetcode.com/problems/find-words-containing-character/description
     */

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        String charAsString = String.valueOf(x);
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(charAsString)) {
                list.add(i);
            }
        }
        return list;
    }

}
