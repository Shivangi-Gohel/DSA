package Arrays.Medium;
import java.util.*;

public class MajorityElement {
    // optimal solution
    static int majorityElement(int []nums) {
        int count = 0;
        int el = 0;
        for(int i = 0; i<nums.length; i++) {
            if(count == 0) {
                count = 1;
                el = nums[i];
            } else if(nums[i] == el) {
                count++;
            } else {
                count--;
            }
        }
        int count1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == el) {
                count1++;
            }
        }
        if(count1 > nums.length/2) {
            return el;
        }
        return -1;
    }


    // Better solution
    // static public int majorityElement(int[] nums) {
    //     double n = nums.length;
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     for (int i = 0; i < n; i++) {
    //         if(map.containsKey(nums[i])) {
    //             map.replace(nums[i], map.get(nums[i])+1);
    //         } else {
    //             map.put(nums[i], 1);
    //         }
    //     }
    //     for (Map.Entry<Integer, Integer> i : map.entrySet()) {
    //         if(i.getValue() > nums.length/2) {
    //             return i.getKey();
    //         }
    //     }
    //     return 0;
    // }

    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
}
