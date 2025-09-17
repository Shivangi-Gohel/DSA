package Arrays.Medium;
import java.util.*;

public class SortColors {
    static public void sortColors(int[] nums) {
        int temp = 0;
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while(mid<=high) {
            if(nums[mid] == 0) {
                temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp; 
                mid++;
                low++;
            } else if(nums[mid] == 1) {
                mid++;
            } else {
                temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }   
}
