import java.util.Arrays;

public class bubblesort {
    public static void swap(int[] arr , int i ,int j){
        int temp;
        temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr={5,14,63,8,12,42,2};
        int n= arr.length;
        for (int i = 0; i <n-1 ; i++) {
            for (int j = 0; j <n-i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }

            }

        }
        System.out.println("Array is :"+ Arrays.toString(arr));

        }
    }
