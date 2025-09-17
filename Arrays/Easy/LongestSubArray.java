package Arrays.Easy;
import java.util.*;

public class LongestSubArray {
    static public int longestSubarrayWithSumK(int a[], long k) {
        int left = 0;
        int right = 0;
        long sum = a[0];
        int maxLen = 0;
        int n = a.length;
        while(right < n) {
            while(left <= right && sum > k) {
                sum -= a[left];
                left++;
            }
            if(sum == k) {
                maxLen = Math.max(maxLen, right-left+1);
            }
            right++;
            if(right<n) {
                sum += a[right];
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 1, 9};
        System.out.println(longestSubarrayWithSumK(arr, 15));
    }   
}
