
package array;
public class findbiggestnum {
    public static void main(String[] args) {
        int[] arr= {1,23,43,2,9,56,6,63};
        int size = arr.length;
        int greatest = arr[0];

        for (int i = 0; i <size ; i++) {
            if(arr[i]>greatest){
                greatest=arr[i];

            }

        }
        System.out.println(greatest);



    }
}