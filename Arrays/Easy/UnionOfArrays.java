package Arrays.Easy;
import java.util.*;

public class UnionOfArrays {
    static public List<Integer> unionArray(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<n1 && j<n2) {
            if (nums1[i] < nums2[j]) {
                addIfNotDuplicate(result, nums1[i]);
                i++;
            } else if (nums1[i] > nums2[j]) {
                addIfNotDuplicate(result, nums2[j]);
                j++;
            } else {  // both are equal
                addIfNotDuplicate(result, nums1[i]);
                i++;
                j++;
            }
        }

        while (i < n1) {
            addIfNotDuplicate(result, nums1[i]);
            i++;
        }
        while (j < n2) {
            addIfNotDuplicate(result, nums2[j]);
            j++;
        }

        return result;
    }

    static public void addIfNotDuplicate(List<Integer> result, int value) {
        if (result.isEmpty() || result.get(result.size() - 1) != value) {
            result.add(value);
        }
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 2, 2, 7};

        List<Integer> union = unionArray(a, b);
        System.out.println(union);
    }
}
