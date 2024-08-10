package arrays.medium;

import java.util.*;

public class ArraysSolutions {

    /*
    912. Sort an Array
    For more info: https://leetcode.com/problems/sort-an-array/description
     */
    public int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }

    /*
    2433. Find The Original Array of Prefix Xor
    For more info: https://leetcode.com/problems/find-the-original-array-of-prefix-xor/description
    */

    public int[] findArray(int[] pref) {
        int[] arr = new int[pref.length];
        arr[0] = pref[0];

        for (int i = 1; i < pref.length; i++) {
            arr[i] = pref[i - 1] ^ pref[i];
        }
        return arr;
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
    For more info: https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/description/
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

    /*
    2545. Sort the Students by Their Kth Score
    For more info: https://leetcode.com/problems/sort-the-students-by-their-kth-score/description
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

    /*
    2391. Minimum Amount of Time to Collect Garbage
    For more info: https://leetcode.com/problems/minimum-amount-of-time-to-collect-garbage/description
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

    /*
    2161. Partition Array According to Given Pivot
    For more info: https://leetcode.com/problems/partition-array-according-to-given-pivot/description
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

}
