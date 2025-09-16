package Arrays.Easy;

public class MissingNumber {
    // if a number is present twice it cancels out.
    // if a number is present once it remains.

    static public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;

        // XOR all numbers from 0..n
        for (int i = 0; i <= n; i++) {
            xor ^= i;
        }

        // XOR all numbers in the array
        for (int num : nums) {
            xor ^= num;
        }

        return xor;
    }


    public static void main(String[] args) {
        int arr[] = {3,0,1,4,5};
        System.out.println(missingNumber(arr));
    }
}
