package array;
import java.util.*;
public class MoveAlllZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        int j = -1;
        int n = arr.length;
        
//        for finding J
        for (int i = 0; i <n; i++) {
            if(arr[i]==0){
                j=i;
                break;
                
            }
        }

        for (int i = j+1; i <n ; i++) {
            if(arr[i] !=0){
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;

                j++;
            }
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]);

        }
        
    }
}
