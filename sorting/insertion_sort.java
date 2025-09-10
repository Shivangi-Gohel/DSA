package sorting;

public class insertion_sort {
    // in insertion sort we take one element at a time and insert it into its correct position in the sorted part of the array
    // ex:- 5 1 4 2 8
    // In first pass: take 1 and compare it with 5, as 1<5, insert 1 before 5 -> 1 5 4 2 8
    // In second pass: take 4 and compare it with 5, as 4<5, insert 4 before 5 -> 1 4 5 2 8
    // In third pass: take 2 and compare it with 5, as 2<5, compare it with 4, as 2<4, insert 2 before 4 -> 1 2 4 5 8
    // In fourth pass: take 8 and compare it with 5, as 8>5, insert 8 after 5 -> 1 2 4 5 8
    // So, in insertion sort we need n-1 passes to sort n elements

    // in every loop observe that the left part of the array is sorted and the right part is unsorted
    // so, in every next pass we need to insert the first element of the unsorted part into its correct position in the sorted part
    // so, time complexity of insertion sort is O(n^2) in worst and average case
    // but in best case when the array is already sorted, we need to do only n-1 comparisons and no swaps, so time complexity is O(n) in best case

    public static void main(String[] args) {
        int arr[] = {5,1,4,2,8};
        for(int i=0; i<arr.length; i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
