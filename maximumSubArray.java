package learning;

public class maximumSubArray {
    public static void main(String[] args){
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int currentSum = 0;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            currentSum = currentSum + num;
            max = Math.max(currentSum, max);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return max;
    }
}
