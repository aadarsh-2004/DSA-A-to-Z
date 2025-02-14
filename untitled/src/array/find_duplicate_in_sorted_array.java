package array;

import java.util.Arrays;

public class find_duplicate_in_sorted_array {
    public static void main(String[] args) {
        int[] arr ={1,1,2,2,2,3,3};
        int[] arr2 = new int[arr.length];

        for (int i = 1; i <arr.length-1; i++) {
            if(arr2[i-1]!=arr[i]){
                arr2[i]=arr[i];
            }

        }

    }
}
