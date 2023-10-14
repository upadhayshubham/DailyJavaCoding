package BuildArrayFromPermutation;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        BuildArrayFromPermutation bafp = new BuildArrayFromPermutation();
        int[] nums = new int[]{5,0,1,2,3,4};
        Arrays.stream(bafp.buildArray(nums)).forEach(System.out::println);
    }
}
