package Arrays.Medium;
import java.util.*;

public class MaximumSubarray {

    //kadane's algorithm
    static int maxSubArray(int []nums) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
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
    static List printMaxSubArray(int []nums) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        int start= 0;
        int ansStart = 0;
        int ansEnd = 0;
        List arr = new ArrayList<>(); 
        for (int i = 0; i < nums.length; i++) {
            if(sum == 0) {
                start = i;
            }
            sum += nums[i];
            if(sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }
            if(sum<0) {
                sum = 0;
            }
        }
        for (int i = ansStart; i <= ansEnd; i++) {
            arr.add(nums[i]);
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
        System.out.println(printMaxSubArray(arr));
    }
}
