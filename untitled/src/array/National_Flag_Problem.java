package array;

import java.util.Arrays;

public class National_Flag_Problem {
//    OPTIMAL APPROCH
   public static void main(String[] args) {
        int[] arr = {0,0,1,0,2,1,2,0,0,0};
        int n = arr.length;
        int low = 0;
        int mid= 0;
        int high = n-1;

        while (mid <= high){
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                mid++;
                low++;
            } else if (arr[mid]==1) {
                mid++;

            }
            else {
                int temp = arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;

            }

        }
        System.out.print("Sorted Array is "+ Arrays.toString(arr));
    }

//    BETTER APPROCH
//      public static void main(String[] args) {
//    int[] arr = {0, 0, 1, 0, 2, 1, 2, 0, 0, 0};
//    int count0 = 0;
//    int count1 = 0;
//    int count2 = 0;
//
//
//    for (int i = 0; i < arr.length; i++) {
//        if (arr[i] == 0) {
//            count0++;
//        }
//        else if (arr[i] == 1) {
//            count1++;
//        }
//        else {
//            count2++;
//        }
//    }
//
//
//    for (int i = 0; i < count0; i++) {
//        arr[i] = 0;
//    }
//
//
//    for (int i = count0; i < count0 + count1; i++) {
//        arr[i] = 1;
//    }
//
//
//    for (int i = count0 + count1; i < arr.length; i++) {
//        arr[i] = 2;
//    }
//
//
//    System.out.println("Sorted: " + Arrays.toString(arr));
//}
}

