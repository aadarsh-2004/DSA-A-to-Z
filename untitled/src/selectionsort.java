import java.util.Arrays;

public class selectionsort {
    public static void swap(int[] arr , int smallest ,int i){
        int temp;
        temp=arr[i];
        arr[i]=arr[smallest];
        arr[smallest]=temp;
    }
    public static void main(String[] args) {
        int[] arr={4,6,12,9,14,1,5,2,3};
        int n =arr.length;
        int smallest;

        for (int i = 0; i <n-1 ; i++) {
            smallest=i;
            for (int j = i+1; j <n ; j++) {
                if(arr[j]<arr[smallest]){
                    smallest=j;
                }

            }
            swap(arr,smallest,i);

        }
        System.out.println("Sorted Array :- "+ Arrays.toString(arr));

    }
}
