package arrays;

import java.util.*;

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
                    count++;
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

    /*
    1672. Richest Customer Wealth
    For more info: https://leetcode.com/problems/richest-customer-wealth/description
     */

    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int amount : account) {
                sum += amount;
            }
            maxWealth = Math.max(maxWealth, sum);
        }
        return maxWealth;
    }

    /*
    2037. Minimum Number of Moves to Seat Everyone
    For more info: https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/description
     */

    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int count = 0;
        for (int i = 0; i < seats.length; i++) {
            count += Math.abs(seats[i] - students[i]);
        }
        return count;
    }

    /*
    2798. Number of Employees Who Met the Target
    For more info: https://leetcode.com/problems/number-of-employees-who-met-the-target/description
     */

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int hour : hours) {
            if (hour >= target) {
                count++;
            }
        }
        return count;
    }

    /*
    1431. Kids With the Greatest Number of Candies
    For more info: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description
     */

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        List<Boolean> list = new ArrayList<>();
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }

    /*
    1. Two Sum
    For more info: https://leetcode.com/problems/two-sum/submissions
     */

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < n; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    /*
    9. Palindrome Number
    For more info: https://leetcode.com/problems/palindrome-number/description
     */

    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) return false;
        }
        return true;
    }

    /*
    1637. Widest Vertical Area Between Two Points Containing No Points
    For more info: https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/description
     */

    public int maxWidthOfVerticalArea(int[][] points) {
        int n = points.length;
        int[] xValues = new int[n];

        for (int i = 0; i < n; i++) {
            xValues[i] = points[i][0];
        }

        Arrays.sort(xValues);

        int maxWidth = 0;
        for (int i = 1; i < n; i++) {
            maxWidth = Math.max(maxWidth, xValues[i] - xValues[i - 1]);
        }

        return maxWidth;
    }

    /*
    2824. Count Pairs Whose Sum is Less than Target
    For more info: https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description
     */

    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }
        return count;
    }

    /*
    1365. How Many Numbers Are Smaller Than the Current Number
    For more info: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description
     */

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int num : nums) {
                if (nums[i] > num) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }

    /*
    1480. Running Sum of 1d Array
    For more info: https://leetcode.com/problems/running-sum-of-1d-array/description
     */

    public int[] runningSum(int[] nums) {
        int lastSum = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            lastSum += nums[i];
            result[i] = lastSum;
        }
        return result;
    }

    /*
    2574. Left and Right Sum Differences
    For more info: https://leetcode.com/problems/left-and-right-sum-differences/description
     */

    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSide = new int[n];
        int[] rightSide = new int[n];
        int[] result = new int[n];

        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            leftSide[i] = leftSum;
            leftSum += nums[i];
        }

        int rightSum = 0;
        for (int i = n - 1; i >= 0; i--) {
            rightSide[i] = rightSum;
            rightSum += nums[i];
        }

        for (int i = 0; i < n; i++) {
            result[i] = Math.abs(leftSide[i] - rightSide[i]);
        }
        return result;
    }

    /*
    2859. Sum of Values at Indices With K Set Bits
    For more info: https://leetcode.com/problems/sum-of-values-at-indices-with-k-set-bits/description
     */
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (Integer.bitCount(i) == k) {
                sum += nums.get(i);
            }
        }
        return sum;
    }

    /*
    2114. Maximum Number of Words Found in Sentences
    For more info: https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description
     */

    public int mostWordsFound(String[] sentences) {
        int biggest = 0;
        for (String sentence : sentences) {
            String[] split = sentence.split(" ");
            if (split.length > biggest) {
                biggest = split.length;
            }
        }
        return biggest;
    }

    /*
    3162. Find the Number of Good Pairs I
    For more info: https://leetcode.com/problems/find-the-number-of-good-pairs-i/description
     */

    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;
        for (int j : nums1) {
            for (int value : nums2) {
                if (j % (value * k) == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    /*
    912. Sort an Array
    For more info: https://leetcode.com/problems/sort-an-array/description
     */
    public int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }

    /*
    3065. Minimum Operations to Exceed Threshold Value I
    For more information: https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-i/description
     */

    public int minOperations(int[] nums, int k) {
        int count = 0;
        for (int num : nums) {
            if (num < k) {
                count++;
            }
        }
        return count;
    }

    /*
    1389. Create Target Array in the Given Order
    For more info: https://leetcode.com/problems/create-target-array-in-the-given-order/description
     */

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> targetList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            targetList.add(index[i], nums[i]);
        }

        int[] targetArray = new int[targetList.size()];
        for (int i = 0; i < targetList.size(); i++) {
            targetArray[i] = targetList.get(i);
        }

        return targetArray;
    }

    /*
    2433. Find The Original Array of Prefix Xor
    For more info: https://leetcode.com/problems/find-the-original-array-of-prefix-xor/description
    */

    public int[] findArray(int[] pref) {
        int[] arr = new int[pref.length];
        arr[0] = pref[0];

        for(int i = 1; i < pref.length; i++) {
            arr[i] = pref[i - 1] ^ pref[i];
        }
        return arr;
    }

    /*
    747. Largest Number At Least Twice of Others
    For more info: https://leetcode.com/problems/largest-number-at-least-twice-of-others/description
     */

    public int dominantIndex(int[] nums) {
        int max = 0;
        int previousMax = 0;
        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                previousMax = max;
                max = nums[i];
                ans = i;
            } else if (nums[i] > previousMax) {
                previousMax = nums[i];
            }
        }
        if (max >= previousMax * 2) {
            return ans;
        } else {
            return -1;
        }
    }

    /*
    2418. Sort the People
    For more info: https://leetcode.com/problems/sort-the-people/description/
     */

    public String[] sortPeople(String[] names, int[] heights) {
        SortedMap<Integer, String> map = new TreeMap<>((o1, o2) -> o2 - o1);
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        int i = 0;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            names[i++] = entry.getValue();
        }
        return names;
    }

}
