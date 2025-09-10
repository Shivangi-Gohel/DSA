package sorting;

public class bubble_sort {
    // in bubble sort we repeatedly swap the adjacent elements if they are in wrong order
    // ex:- 5 1 4 2 8
    // In first pass: take 2-2 elements and compare them
    // 5 1 4 2 8 -> 1 5 4 2 8 -> 1 4 5 2 8 -> 1 4 2 5 8
    // In second pass: 1 4 2 5 8 -> 1 2 4 5 8
    // In third pass: 1 2 4 5 8 -> 1 2 4 5 8
    // In fourth pass: 1 2 4 5 8 -> 1 2 4 5 8
    // So, in bubble sort we need n-1 passes to sort n elements

    // in every loop observe that the largest element is at the end of the array
    // so, in every next pass we can ignore the last element as it is already sorted
    // so, in first pass we need to do n-1 comparisons, in second pass n-2 comparisons, in third pass n-3 comparisons and so on till 1 comparison 
    // so, total number of comparisons = (n-1) + (n-2) + (n-3) + ..... + 1 = n(n-1)/2 = O(n^2)
    // so, time complexity of bubble sort is O(n^2) in worst and average


    public static void main(String[] args) {
        int arr[] = {5,1,4,2,8};
        
        for(int i=arr.length-1; i>=0; i--){ // for n elements we need n-1 passes
            int didSwap = 0;
            for(int j=0; j<=i-1; j++){ // in every next pass we can ignore the last element as it is already sorted
                if(arr[j] > arr[j+1]){ // if the current element is greater than the next element, swap them
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0){ // if no swap happened in the inner loop, the array is already sorted
                break;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}       