package Hashing;

import java.util.*;

public class highestOccurence {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,2,2,1};
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int maxCount = 0;
        int ans = -1;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if(value > maxCount) {
                maxCount = value;
                ans = key;
            } else if(value == maxCount) {
                ans = Math.min(ans, key);
            }
        }
        System.out.println("The element with highest occurrence is: " + ans + " with frequecy: " + maxCount);
    }
}