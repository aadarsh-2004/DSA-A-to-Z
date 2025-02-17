package array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,67,2,5,47,9,5,32,5,56,3,2,66678,6,2,4,6,333,4,5,44};

        int ele =333;
        int n = arr.length;
        boolean found = false;


        for (int i = 0; i <n ; i++) {
            if(arr[i] == ele){
                System.out.println("Element found at index: " + i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found in array");
        }

    }
}
