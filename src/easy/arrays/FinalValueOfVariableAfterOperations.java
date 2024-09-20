package easy.arrays;

public class FinalValueOfVariableAfterOperations {

    /**
     2011. Final Value of Variable After Performing Operations
     <a href="https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description">LeetCode description</a>
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

}
