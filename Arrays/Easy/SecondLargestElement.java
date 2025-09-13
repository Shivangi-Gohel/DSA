package Arrays.Easy;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {5, 5, 3, 2};
        int largest = arr[0];
        int secondLargest = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } 
            else if(arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest element of an array is:- "+ secondLargest);
    }
}
