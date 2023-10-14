package ConcatenationOfArray;

import java.util.Arrays;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];

        for(int i = 0; i< n; i++) {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        ConcatenationOfArray concatenationOfArray = new ConcatenationOfArray();
        int[] nums = new int[] {1,2,1};
        int[] ans = concatenationOfArray.getConcatenation(nums);

        Arrays.stream(ans).forEach(System.out::println);
    }
}
