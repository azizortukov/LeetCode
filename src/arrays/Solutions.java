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
    For more info: https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-i/description
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

    /*
    1773. Count Items Matching a Rule
    For more info: https://leetcode.com/problems/count-items-matching-a-rule/description
     */

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        switch (ruleKey) {
            case "type" -> {
                return getCount(0, items, ruleValue);
            }
            case "color" -> {
                return getCount(1, items, ruleValue);
            }
            case "name" -> {
                return getCount(2, items, ruleValue);
            }
        }
        return 0;
    }

    private int getCount(int index, List<List<String>> items, String ruleValue) {
        int count = 0;
        for (List<String> item : items) {
            if (ruleValue.equals(item.get(index))) {
                count++;
            }
        }
        return count;
    }

    /*
    1816. Truncate Sentence
    For more info: https://leetcode.com/problems/truncate-sentence/description
     */

    public String truncateSentence(String s, int k) {
        String out = "";
        int space_cnt = 0;
        int i = 0;

        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                space_cnt++;

            if (space_cnt == k)
                break;

        }
        if (i == s.length())
            return s;


        return s.substring(0, i);
    }

    /*
    2974. Minimum Number Game
    For more info: https://leetcode.com/problems/minimum-number-game/description/
     */

    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            int current = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = current;
        }
        return nums;
    }

    /*
    3194. Minimum Average of Smallest and Largest Elements
    For more info: https://leetcode.com/problems/minimum-average-of-smallest-and-largest-elements/description
     */

    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double res = 0;
        int i = 0, j = nums.length - 1;
        while (i < j) {
            double currentAverage = (nums[i++] + nums[j--]) / 2.0;
            if (res == 0 || res > currentAverage) {
                res = currentAverage;
            }
        }
        return res;
    }

    /*
    1662. Check If Two String Arrays are Equivalent
    For more info: https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description
     */

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder first = new StringBuilder();
        for (String s : word1) {
            first.append(s);
        }
        StringBuilder second = new StringBuilder();
        for (String s : word2) {
            second.append(s);
        }
        return first.toString().equals(second.toString());
    }

    /*
    1313. Decompress Run-Length Encoded List
    For more info: https://leetcode.com/problems/decompress-run-length-encoded-list/description
     */

    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i += 2)
            size += nums[i];
        int[] result = new int[size];
        for (int i = 0, j = 0; i < nums.length; i += 2) {
            while (nums[i]-- > 0) {
                result[j] = nums[i + 1];
                j++;
            }
        }
        return result;
    }

    /*
    1528. Shuffle String
    For more info: https://leetcode.com/problems/shuffle-string/description
     */

    public String restoreString(String s, int[] indices) {
        char[] res = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            res[indices[i]] = s.charAt(i);
        }
        return new String(res);
    }

    /*
    2535. Difference Between Element Sum and Digit Sum of an Array
    For more info: https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/submissions
     */

    public int differenceOfSum(int[] nums) {
        int overallSum = Arrays.stream(nums).sum();
        int digitSum = 0;
        for (int num : nums) {
            int j = num;
            while (j > 0) {
                digitSum += j % 10;
                j /= 10;
            }
        }
        return overallSum - digitSum;
    }

    /*
    1282. Group the People Given the Group Size They Belong To
    For more info: https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/description
     */

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int groupSize = groupSizes[i];
            List<Integer> list = map.getOrDefault(groupSize, new ArrayList<>());
            if (list.size() == groupSize) {
                res.add(list);
                list = new ArrayList<>();
                list.add(i);
                map.put(groupSize, list);
            } else {
                list.add(i);
                map.put(groupSize, list);
            }
        }
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            res.add(entry.getValue());
        }

        return res;
    }

    /*
    2367. Number of Arithmetic Triplets
    For more info: https://leetcode.com/problems/number-of-arithmetic-triplets/description
     */

    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int count = 0;
        for (Integer num : set) {
            if (set.contains(num + diff) && set.contains(num + (diff * 2))) {
                count++;
            }
        }
        return count;
    }

    /*
    2006. Count Number of Pairs With Absolute Difference K
    For more info: https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/description
     */

    public int countKDifference(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    count++;
                }
            }
        }
        return count;
    }

    /*
    2108. Find First Palindromic String in the Array
    For more info: https://leetcode.com/problems/find-first-palindromic-string-in-the-array
     */

    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }

    private boolean isPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    /*
    2610. Convert an Array Into a 2D Array With Conditions
    For more info: https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/description
     */

    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        addToMatrix(nums, res);
        return res;
    }

    private void addToMatrix(int[] nums, List<List<Integer>> res) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 || list.contains(nums[i])) {
                continue;
            }
            list.add(nums[i]);
            nums[i] = -1;
        }
        if (list.isEmpty()) {
            return;
        }
        Collections.sort(list);
        res.add(list);
        addToMatrix(nums, res);
    }

    /*
    1769. Minimum Number of Operations to Move All Balls to Each Box
    For more info:
     */

    public int[] minOperations(String boxes) {
        char[] allBoxes = boxes.toCharArray();
        int[] res = new int[allBoxes.length];
        for (int i = 0; i < allBoxes.length; i++) {
            int count = 0;
            for (int j = 0; j < allBoxes.length; j++) {
                if (i == j || allBoxes[j] == '0') {
                    continue;
                }
                count += Math.abs(i - j);
            }
            res[i] = count;
        }
        return res;
    }

    /*
    2125. Number of Laser Beams in a Bank
    For more info: https://leetcode.com/problems/number-of-laser-beams-in-a-bank/description
     */

    public int numberOfBeams(String[] bank) {
        List<Integer> laserPoints = new ArrayList<>();
        for (int i = 0; i < bank.length; i++) {
            int count = countLaserPoints(bank[i]);
            if (count == 0) {
                continue;
            }
            laserPoints.add(count);
        }
        int lasers = 0;
        for (int i = 0; i < laserPoints.size() - 1; i++) {
            lasers = lasers + (laserPoints.get(i) * laserPoints.get(i + 1));
        }
        return lasers;
    }

    private int countLaserPoints(String row) {
        int count = 0;
        for (char c : row.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }

        return count;
    }

}
