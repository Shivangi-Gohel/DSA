package Arrays.Medium;

import java.util.*;

class TwoSum {
    static public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++) {
            int comp = target - nums[i];
            if(map.containsKey(comp)) {
                return new int[] {map.get(comp), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }  

    // optimal solution for another case that returns "yes" if target match else "no"
    // static String twoSum1(int[] nums, int target) {
    //     int left = 0; 
    //     int right = nums.length-1;
    //     Arrays.sort(nums);
    //     while(left < right) {
    //         int sum = nums[left] + nums[right];
    //         if(sum == target) {
    //             return "YES";
    //         } else if(sum < target) {
    //             left++;
    //         } else {
    //             right--;    
    //         }
    //     }
    //     return "NO";
    // }
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int ans[] = twoSum(arr, 9);
        System.out.println(Arrays.toString(ans));
    }
}