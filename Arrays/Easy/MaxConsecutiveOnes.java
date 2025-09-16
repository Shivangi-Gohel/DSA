package Arrays.Easy;

public class MaxConsecutiveOnes {
    static public int findMaxConsecutiveOnes(int[] nums) {
        int maxi = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1) {
                count++;
                maxi = Math.max(maxi, count); 
            } else {
                count = 0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr[] = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }   
}
