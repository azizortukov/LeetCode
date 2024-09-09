package arrays.easy;

public class BuildArray {

    /**
     1920. Build Array from Permutation
     <a href="https://leetcode.com/problems/build-array-from-permutation/description">For more info</a>
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

}
