package Hashing;
import java.util.*;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            System.out.println(i+ "th element");
            int ele = sc.nextInt();
            arr[i] = ele;
        }

        int hash[] = new int[n];
        for(int i=0; i<n; i++) {
            hash[arr[i]] += 1;
        }

        for(int i=0; i<hash.length; i++) {
            if(hash[i] != 0) {
                System.out.println(i+" "+hash[i]);
            }
        }
    }
}
