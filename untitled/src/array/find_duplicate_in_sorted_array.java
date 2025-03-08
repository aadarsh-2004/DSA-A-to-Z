package array;
import java.util.Arrays;

public class find_duplicate_in_sorted_array {
    public static int removeduplicates(int[] arr){
        int i=0 ;
        for (int j = 1; j <arr.length ; j++) {
            if(arr[i] != arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;

    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 6, 6};
        int newlength= removeduplicates(arr);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newlength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
