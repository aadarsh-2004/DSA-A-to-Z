package array;

public class findbiggestnum {
    public static void main(String[] args) {
            int[] arr = {5,33,88,89,19,88,4};
            int biggestNum=0;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]>arr[biggestNum]){
                biggestNum=i;
            }

        }
        System.out.println("biggest num is "+arr[biggestNum]);
        System.out.println(biggestNum);
    }
}
