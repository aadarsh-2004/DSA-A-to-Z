package array;

public class FIndMissingNum {
    public static void main(String[] args) {
        int[] arr= {1,2,4,5};

        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i+1] != arr[i]+1){
                System.out.println("missing element is " + (arr[i]+1));

            }

        }
    }
}
