package RunningSumOfIDArray;

import java.util.Arrays;

public class RunningSumOf1DArray {

    public int[] runningSumExplained(int[] runs) {
        int[] result = new int[runs.length];
        result[0] = runs[0];

        for (int i = 1; i < runs.length; i++) {
            result[i] = result[i - 1] + runs[i];
        }
        return result;
    }

    public int[] runningSum(int[] runs) {
        for (int i = 1; i < runs.length; i++) {
            runs[i] += runs[i - 1];
        }
        return runs;
    }

    public static void main(String[] args) {
        int[] runs = new int[]{1,2,3,4};
        RunningSumOf1DArray runningSumOf1DArray = new RunningSumOf1DArray();
        int[] result = runningSumOf1DArray.runningSum(runs);
        Arrays.stream(result).forEach(System.out::println);

    }
}

//Time Complexity : O(n)
/**
 * We are not creating a separate DS.
 */
// Space Complexity : O(1)

