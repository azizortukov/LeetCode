package arrays.easy;

public class ValidMountainArray {

    /**
     * 941. Valid Mountain Array
     * <a href="https://leetcode.com/problems/valid-mountain-array/description/">Fore more info</a>
     */
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        boolean levelUp = false;
        boolean foundMountain = false;
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            if (levelUp || arr[i] < arr[i + 1]) {
                levelUp = true;
            }
            if (arr[i] == arr[i + 1]) {
                return false;
            } else if (arr[i] > arr[i + 1]) {
                foundMountain = true;
            } else if (foundMountain){
                return false;
            }
        }
        return foundMountain && levelUp;
    }

}
