package array;
// Brute Force Approach

public class RotateArrayByKElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int d= 3;
        int n = arr.length;
        int[] temparr=new int[d];

        for (int i = 0; i<d ; i++) {
            temparr[i]=arr[i];
        };

        for (int i = d; i <n; i++) {
            arr[i-d]=arr[i];
        }
        int j=0;
        for (int i =n-d ; i <n ; i++) {

            arr[i]=temparr[j];
            j++;

        }
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]);

        }

    }
}
