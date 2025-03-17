package array;
import java.util.HashMap;
public class two_sum_problem {
//    [ BRUTE FORCE APPROCH ]
//    public static void main(String[] args) {
//        int[] arr = {1,2,6,5,8,11};
//        int target =  7;
//        int n = arr.length;
//        for (int i = 0; i <n ; i++) {
//            for (int j = i+1; j <n ; j++) {
//                if(arr[i] + arr[j] == target){
//                    System.out.println("Numbers are at position"+ i + j );
//                }
//
//            }
//        }
//    }
//    [ OPTIMAL APPROCH ]
//    public static void main(String[] args) {
//        int[] arr = {2, 5, 6, 8, 11}; // Sorted array
//        int target = 14;
//        int n = arr.length;
//
//        int start = 0;
//        int end = n-1;
//
//        while (start < end) {
//            int sum = arr[start] + arr[end];
//
//            if (sum == target) {
//                System.out.println("Pair found: (" + arr[start] + ", " + arr[end] + ")");
//                return;
//            } else if (sum < target) {
//                start++;
//            } else {
//                end--;
//            }
//        }
//
//        System.out.println("No valid pair found.");
//    }
// [BETTER APPPROCH ]
    public static void main(String[] args) {
        int[] arr ={2,5,6,8,11};
        int target =14;
        int n = arr.length;
        HashMap<Integer , Integer> map =new HashMap<>();

        for (int i = 0; i < n ; i++) {
            int requiredNum = target-arr[i];
            if(map.containsKey(requiredNum)){
                System.out.println("Pair found: (" + map.get(requiredNum)+ ", " + i + ")");
                return;
            }
            map.put(arr[i],i);
        }

        System.out.println("no valid pair found");

    }
}


