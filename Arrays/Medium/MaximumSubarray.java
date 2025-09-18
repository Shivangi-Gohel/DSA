package Arrays.Medium;

public class MaximumSubarray {
    
    //kadane's algorithm
    static long maxSubArray(int []nums) {
        long sum = 0;
        long maxi = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum > maxi) {
                maxi = sum;
            }
            if(sum<0) {
                sum = 0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
