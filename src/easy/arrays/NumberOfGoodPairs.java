package easy.arrays;

public class NumberOfGoodPairs {

    /**
     1512. Number of Good Pairs
     <a href="https://leetcode.com/problems/number-of-good-pairs/description">LeetCode description</a>
     */
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

}
