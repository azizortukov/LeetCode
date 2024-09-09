package arrays.easy;

import java.util.*;

public class GetConcatenation {

    /**
     1929. Concatenation of Array
     <a href="https://leetcode.com/problems/concatenation-of-array/description">For more info</a>
     */

    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] result = new int[length * 2];
        System.arraycopy(nums, 0, result, 0, length);
        System.arraycopy(nums, 0, result, length, length);
        return result;
    }

    /**
    1512. Number of Good Pairs
    https://leetcode.com/problems/number-of-good-pairs/description
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

    /**
    2011. Final Value of Variable After Performing Operations
    https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description
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

    /**
    1470. Shuffle the Array
    https://leetcode.com/problems/shuffle-the-array/description
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

    /**
    2942. Find Words Containing Character
    https://leetcode.com/problems/find-words-containing-character/description
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

    /**
    1672. Richest Customer Wealth
    https://leetcode.com/problems/richest-customer-wealth/description
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

    /**
    2037. Minimum Number of Moves to Seat Everyone
    https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/description
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

    /**
    2798. Number of Employees Who Met the Target
    https://leetcode.com/problems/number-of-employees-who-met-the-target/description
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

    /**
    1431. Kids With the Greatest Number of Candies
    https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description
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

    /**
    1. Two Sum
    https://leetcode.com/problems/two-sum/description
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

    /**
    9. Palindrome Number
    https://leetcode.com/problems/palindrome-number/description
     */

    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) return false;
        }
        return true;
    }

    /**
    1637. Widest Vertical Area Between Two Points Containing No Points
    https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/description
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

    /**
    2824. Count Pairs Whose Sum is Less than Target
    https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description
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

    /**
    1365. How Many Numbers Are Smaller Than the Current Number
    https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description
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

    /**
    1480. Running Sum of 1d Array
    https://leetcode.com/problems/running-sum-of-1d-array/description
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

    /**
    2574. Left and Right Sum Differences
    https://leetcode.com/problems/left-and-right-sum-differences/description
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

    /**
    2859. Sum of Values at Indices With K Set Bits
    https://leetcode.com/problems/sum-of-values-at-indices-with-k-set-bits/description
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

    /**
    2114. Maximum Number of Words Found in Sentences
    https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description
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

    /**
    3162. Find the Number of Good Pairs I
    https://leetcode.com/problems/find-the-number-of-good-pairs-i/description
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

    /**
    3065. Minimum Operations to Exceed Threshold Value I
    https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-i/description
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

    /**
    1389. Create Target Array in the Given Order
    https://leetcode.com/problems/create-target-array-in-the-given-order/description
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

    /**
    747. Largest Number At Least Twice of Others
    https://leetcode.com/problems/largest-number-at-least-twice-of-others/description
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

    /**
    2418. Sort the People
    https://leetcode.com/problems/sort-the-people/description/
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

    /**
    1773. Count Items Matching a Rule
    https://leetcode.com/problems/count-items-matching-a-rule/description
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

    /**
    1816. Truncate Sentence
    https://leetcode.com/problems/truncate-sentence/description
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

    /**
    2974. Minimum Number Game
    https://leetcode.com/problems/minimum-number-game/description/
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

    /**
    3194. Minimum Average of Smallest and Largest Elements
    https://leetcode.com/problems/minimum-average-of-smallest-and-largest-elements/description
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

    /**
    1662. Check If Two String Arrays are Equivalent
    https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description
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
        return first.toString().contentEquals(second);
    }

    /**
    1313. Decompress Run-Length Encoded List
    https://leetcode.com/problems/decompress-run-length-encoded-list/description
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

    /**
    1528. Shuffle String
    https://leetcode.com/problems/shuffle-string/description
     */

    public String restoreString(String s, int[] indices) {
        char[] res = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            res[indices[i]] = s.charAt(i);
        }
        return new String(res);
    }

    /**
    2535. Difference Between Element Sum and Digit Sum of an Array
    https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/description
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

    /**
    2367. Number of Arithmetic Triplets
    https://leetcode.com/problems/number-of-arithmetic-triplets/description
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

    /**
    2006. Count Number of Pairs With Absolute Difference K
    https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/description
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

    /**
    2108. Find First Palindromic String in the Array
    https://leetcode.com/problems/find-first-palindromic-string-in-the-array
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

    /**
    1496. Path Crossing
    https://leetcode.com/problems/path-crossing/description/
     */
    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        List<String> pathsVisited = new ArrayList<>();
        pathsVisited.add(String.format("(%s,%s)", x, y));
        for (int i = 0; i < path.length(); i++) {
            char c = path.charAt(i);
            switch (c) {
                case 'N' -> y++;
                case 'S' -> y--;
                case 'E' -> x++;
                case 'W' -> x--;
            }
            String currentLocation = String.format("(%s,%s)", x, y);
            if (pathsVisited.contains(currentLocation)) {
                return true;
            }
            pathsVisited.add(currentLocation);
        }
        return false;
    }

    /**
    2956. Find Common Elements Between Two Arrays
    https://leetcode.com/problems/find-common-elements-between-two-arrays/description/
     */

    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int count1 = 0;
        int count2 = 0;
        for (int value : nums1) {
            for (int k : nums2) {
                if (value == k) {
                    count1++;
                    break;
                }
            }
        }
        for (int k : nums2) {
            for (int i : nums1) {
                if (k == i) {
                    count2++;
                    break;
                }
            }
        }
        return new int[]{count1, count2};

    }

    /**
    1684. Count the Number of Consistent Strings
    https://leetcode.com/problems/count-the-number-of-consistent-strings/description/
     */

    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedLetters = new HashSet<>();
        for (char ch : allowed.toCharArray()) {
            allowedLetters.add(ch);
        }

        int count = 0;
        for (String word : words) {
            boolean found = false;
            for (char c : word.toCharArray()) {
                if (!allowedLetters.contains(c)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                count++;
            }
        }
        return count;
    }

    /**
    1732. Find the Highest Altitude
    https://leetcode.com/problems/find-the-highest-altitude/description/
     */

    public int largestAltitude(int[] gain) {
        int max = 0;
        int overallGain = 0;
        for (int m : gain) {
            overallGain += m;
            if (max < overallGain) {
                max = overallGain;
            }
        }
        return max;
    }

    /**
    1572. Matrix Diagonal Sum
    https://leetcode.com/problems/matrix-diagonal-sum/description/
     */

    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j || i + j == mat.length - 1) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }

    /**
    2828. Check if a String Is an Acronym of Words
    https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/description/
     */

    public boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) {
            return false;
        }
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).charAt(0) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    /**
    3232. Find if Digit Game Can Be Won
    https://leetcode.com/problems/find-if-digit-game-can-be-won/description
     */

    public boolean canAliceWin(int[] nums) {
        int singleDigitSum = 0;
        int doubleDigitSum = 0;
        for (int num : nums) {
            if (num / 10 == 0) {
                singleDigitSum += num;
            } else {
                doubleDigitSum += num;
            }
        }
        return singleDigitSum != doubleDigitSum;
    }

    /**
    804. Unique Morse Code Words
    https://leetcode.com/problems/unique-morse-code-words/description
     */

    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--", "--.."};

        Set<String> res = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            for (char c : word.toCharArray()) {
                int i = c - 'a';
                sb.append(morseCode[i]);
            }
            res.add(sb.toString());
            sb.setLength(0);
        }
        return res.size();
    }

    /**
    1913. Maximum Product Difference Between Two Pairs
    https://leetcode.com/problems/maximum-product-difference-between-two-pairs/description
     */

    public int maxProductDifference(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }
        return (max1 * max2) - (min1 * min2);
    }

    /**
    1464. Maximum Product of Two Elements in an Array
    https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array
     */

    public int maxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        return (max1 - 1) * (max2 - 1);
    }

    /**
    1266. Minimum Time Visiting All Points
    https://leetcode.com/problems/minimum-time-visiting-all-points/description/
     */

    public int minTimeToVisitAllPoints(int[][] points) {
        int count = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int firstRes = Math.abs(points[i][0] - points[i + 1][0]);
            int secondRes = Math.abs(points[i][1] - points[i + 1][1]);
            count += Math.max(firstRes, secondRes);
        }
        return count;
    }

}
