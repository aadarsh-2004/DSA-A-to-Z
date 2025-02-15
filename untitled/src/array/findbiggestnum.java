package array;

public class findbiggestnum {
    public static void main(String[] args) {
        int[] arr= {1,23,43,2,349,56,6,63};
        int n= arr.length;
        int greatest=arr[0];

        for (int i = 0; i < n ; i++) {
            if(arr[i]>greatest){
                greatest=arr[i];
            }
        }
        System.out.println("biggest number is :"+ arr[greatest]);

    }



}
