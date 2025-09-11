package sorting;

public class MergeSort {
    // merge sort is a divide and merge algorithm
    // in merge sort we divide the array into two parts, sort the two parts and then merge the two sorted parts
    // ex:- 38 27 43 3 9 82 10
    // divide into two parts: 38 27 43 3 and 9 82 10
    // divide again: 38 27 and 43 3 and 9 82 10
    // divide again: 38 and 27 and 43 and 3 and 9 82 and 10
    // now we have single element arrays, so we can consider them as sorted
    // now we need to merge the sorted arrays
    // merge 38 and 27: compare 38 and 27, as 27<38, so 27 comes first, then 38 -> 27 38
    // merge 43 and 3: compare 43 and 3, as 3<43, so 3 comes first, then 43 -> 3 43
    // merge 9 and 82: compare 9 and 82, as 9<82, so 9 comes first, then 82 -> 9 82
    // now we have 27 38 and 3 43 and 9 82  and 10
    // merge 27 38 and 3 43: compare 27 and 3, as 3<27, so 3 comes first, then compare 27 and 43, as 27<43, so 27 comes next, then compare 38 and 43, as 38<43, so 38 comes next, then 43 -> 3 27 38 43
    // now we have 3 27 38 43 and 9 82 and 10
    // merge 9 82 and 10: compare 9 and 10, as 9<10, so 9 comes first, then compare 82 and 10, as 10<82, so 10 comes next, then 82 -> 9 10 82
    // now we have 3 27 38 43 and 9 10 82
    // merge 3 27 38 43 and 9 10 82: compare 3 and 9, as 3<9, so 3 comes first, then compare 27 and 9, as 9<27, so 9 comes next, then compare 27 and 10, as 10<27, so 10 comes next, then compare 27 and 82, as 27<82, so 27 comes next, then compare 38 and 82, as 38<82, so 38 comes next, then compare 43 and 82, as 43<82, so 43 comes next, then 82 -> 3 9 10 27 38 43 82
    // so, in merge sort we need to divide the array into two parts logn times
    // and in each merge step we need to do n comparisons, so time complexity of merge sort is O(nlogn) in all cases


    static void mergeSort(int arr[], int low, int high) {
        if(low == high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    static void merge(int arr[], int low, int mid, int high) {
       int n1 = mid - low + 1;
        int n2 = high - mid;

        // Create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data
        for (int i = 0; i < n1; i++) {
            L[i] = arr[low + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        // Merge the temp arrays back into nums
        int i = 0, j = 0, k = low;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    public static void main(String[] args) {
        int arr[] = {38,27,43,3,9,82,10};
        mergeSort(arr, 0, arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
