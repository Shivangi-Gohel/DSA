package sorting;

public class QuickSort {
    
    // quick sort is a divide and conquer algorithm
    // in quick sort we select a pivot element and partition the array around the pivot element such
    // that all elements smaller than the pivot are on the left side and all elements greater than the pivot are on the right side
    
    // so, in quick sort we need to partition the array logn times
    // and in each partition step we need to do n comparisons, so time complexity of quick sort is O(nlogn) in average case
    // but in worst case when the array is already sorted or reverse sorted, we need to do n partitions and in each partition step we need to do n comparisons, so time complexity is O(n^2) in worst case

    static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j) {
            while(arr[i] <= pivot && i<=high-1) {
                i++;
            }
            while(arr[j] > pivot && j>=low+1) {
                j--;
            }
            if(i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap pivot with arr[j]
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    static void quick_sort(int arr[], int low, int high) {
        if(low < high) {
            int pivotIndex = partition(arr, low, high);
            quick_sort(arr, low, pivotIndex - 1);
            quick_sort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        quick_sort(arr, 0, arr.length - 1);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
