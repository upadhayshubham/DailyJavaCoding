package NumberOfGoodPairs;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    System.out.println("i="+nums[i]+"; j="+nums[j]+"; count= "+count);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOfGoodPairs numberOfGoodPairs = new NumberOfGoodPairs();
        int[] nums = new int[] {1,2,3};
        int output = numberOfGoodPairs.numIdenticalPairs(nums);
       System.out.println(output);
    }
}
