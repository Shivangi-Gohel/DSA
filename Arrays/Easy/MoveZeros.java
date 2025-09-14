package Arrays.Easy;

public class MoveZeros {
    static public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i<n) {
            if(nums[i] == 0) {
                for(int j = i; j<n-1; j++) {
                    nums[j] = nums[j+1];
                }
                nums[n-1] = 0;
                n--;
            }
            else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        moveZeroes(arr);
        for(int i: arr) {
            System.out.print(i+" ");
        }
    }
}
