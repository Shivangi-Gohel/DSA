package Arrays.Medium;

public class RearrangeElementsBySign {
    static int[] rearrangeArray(int[] nums) {
        int pos = 0;
        int neg = 1;
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ans[pos] = nums[i];
                pos += 2;
            } else {
                ans[neg] = nums[i];
                neg += 2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};
        int ans[] = rearrangeArray(arr);
        for (int i : ans) {
            System.out.print(i+ " ");
        }
    }
}
