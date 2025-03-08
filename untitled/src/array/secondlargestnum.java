package array;
public class secondlargestnum {
    public static void main(String[] args) {

        int[] arr = {3, 6, 2, 8, 44, 5, 99, 222, 34, 1};
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                second_largest = largest;
                largest = arr[i];

                System.out.println("largest " + largest);
                System.out.println("second_largest" + second_largest);


            }       

        }


    }
}
