package Arrays.Easy;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 1, 3, 3, 4, 5, 2};
        int i = 0;
        for(int j=1; j<arr.length; j++) {
            if(arr[i] != arr[j]) {
                arr[i+1] = arr[j];
                i++;
            }
        }
        System.out.println(i+1);
        for(int k=0; k<=i; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
