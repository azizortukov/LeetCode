package medium.arrays;

import java.util.*;

public class MultipleAnswers {

    /**
    912. Sort an Array
    <a href="https://leetcode.com/problems/sort-an-array/description">LeetCode description</a>
     */
    public int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }

    /**
    2433. Find The Original Array of Prefix Xor
    <a href="https://leetcode.com/problems/find-the-original-array-of-prefix-xor/description">LeetCode description</a>
    */

    public int[] findArray(int[] pref) {
        int[] arr = new int[pref.length];
        arr[0] = pref[0];

        for (int i = 1; i < pref.length; i++) {
            arr[i] = pref[i - 1] ^ pref[i];
        }
        return arr;
    }

    /**
    1282. Group the People Given the Group Size They Belong To
    <a href="https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/description">LeetCode description</a>
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

    /**
    2610. Convert an Array Into a 2D Array With Conditions
    <a href="https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/description">LeetCode description</a>
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

    /**
    1769. Minimum Number of Operations to Move All Balls to Each Box
    <a href="https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/description">LeetCode description</a>
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

    /**
    2125. Number of Laser Beams in a Bank
    <a href="https://leetcode.com/problems/number-of-laser-beams-in-a-bank/description">LeetCode description</a>
     */

    public int numberOfBeams(String[] bank) {
        List<Integer> laserPoints = new ArrayList<>();
        for (String s : bank) {
            int count = countLaserPoints(s);
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

    /**
    2545. Sort the Students by Their Kth Score
    <a href="https://leetcode.com/problems/sort-the-students-by-their-kth-score/description">LeetCode description</a>
     */

    public int[][] sortTheStudents(int[][] score, int k) {
        Map<Integer, Integer> sorted = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < score.length; i++) {
            sorted.put(score[i][k], i);
        }
        int[][] res = new int[score.length][score[0].length];
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : sorted.entrySet()) {
            res[count] = score[entry.getValue()];
            count++;
        }
        return res;
    }

    /**
    2391. Minimum Amount of Time to Collect Garbage
    <a href="https://leetcode.com/problems/minimum-amount-of-time-to-collect-garbage/description">LeetCode description</a>
     */

    public int garbageCollection(String[] garbage, int[] travel) {
        int metalLatest = -1;
        int paperLatest = -1;
        int glassLatest = -1;
        int time = 0;
        for (String s : garbage) {
            time += s.length();
        }
        for (int i = garbage.length - 1; i > 0; i--) {
            if (garbage[i].contains("M")) {
                metalLatest = i;
                break;
            }
        }
        for (int i = garbage.length - 1; i > 0; i--) {
            if (garbage[i].contains("P")) {
                paperLatest = i;
                break;
            }
        }
        for (int i = garbage.length - 1; i > 0; i--) {
            if (garbage[i].contains("G")) {
                glassLatest = i;
                break;
            }
        }
        for (int i = 0; i < travel.length; i++) {
            if (metalLatest > i) {
                time += travel[i];
            }
            if (paperLatest > i) {
                time += travel[i];
            }
            if (glassLatest > i) {
                time += travel[i];
            }
        }
        return time;
    }

    /**
    2161. Partition Array According to Given Pivot
    <a href="https://leetcode.com/problems/partition-array-according-to-given-pivot/description">LeetCode description</a>
     */

    public int[] pivotArray(int[] nums, int pivot) {
        int counter = 0;
        int[] res = new int[nums.length];
        for (int num : nums) {
            if (num < pivot)
                res[counter++] = num;
        }
        for (int num : nums) {
            if (num == pivot)
                res[counter++] = num;
        }
        for (int num : nums) {
            if (num > pivot)
                res[counter++] = num;
        }
        return res;
    }

    /**
    1561. Maximum Number of Coins You Can Get
    <a href="https://leetcode.com/problems/maximum-number-of-coins-you-can-get/description">LeetCode description</a>
     */

    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int res = 0;
        int n = piles.length - 1;
        for (int i = 0; i < n; i++) {
            res += piles[n - 1];
            n -= 2;
        }
        return res;
    }

    /**
    1409. Queries on a Permutation With Key
    <a href="https://leetcode.com/problems/queries-on-a-permutation-with-key/description">LeetCode description</a>
     */

    public int[] processQueries(int[] queries, int m) {
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= m; i++) {
            queue.add(i);
        }
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int num = queries[i];
            int index = queue.indexOf(num);
            res[i] = index;
            queue.remove(index);
            queue.addFirst(num);
        }
        return res;
    }

    /**
    2149. Rearrange Array Elements by Sign
    <a href="https://leetcode.com/problems/rearrange-array-elements-by-sign/description">LeetCode description</a>
     */

    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = 1;
        for (int num : nums) {
            if (num > 0) {
                ans[evenIndex] = num;
                evenIndex += 2;
            } else {
                ans[oddIndex] = num;
                oddIndex += 2;
            }
        }
        return ans;
    }

}
