package sorting;

public class selection_sort {
    // for sorting elements of array in ascending order we need to find the minimum element in the unsorted array and swap it with the first element of the unsorted array.

    // ex. arr[] = {64, 25, 12, 22, 11}
    // after 1st iteration -> {11, 25, 12, 22, 64}
    // after 2nd iteration -> {11, 12, 25, 22, 64}
    // after 3rd iteration -> {11, 12, 22, 25, 64}
    // after 4th iteration -> {11, 12, 22, 25, 64}
    // iteration runs till n-2 because at last 2 elements will be sorted automatically

    // Time complexity -> O(n^2)
    // Inner loop runs n times - (n) + (n-1) + (n-2) + ... + 1 = n(n+1)/2 = n^2/2 + n/2 = O(n^2)

    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        for(int i=0; i<=arr.length-2; i++) {
            int minIndex = i;
            for(int j=i+1; j<=arr.length-1; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
