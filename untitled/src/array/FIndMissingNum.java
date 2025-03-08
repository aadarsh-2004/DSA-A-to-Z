package array;

public class FIndMissingNum {
    public static void main(String[] args) {
        int[] arr= {1,2,4,5};
        int n =5;
        int sum = 0;
        int osum= (n*(n+1))/2;
        int missingnum=osum-sum;

        for (int i = 0; i <arr.length ; i++) {
            sum=sum+arr[i];
        }
        System.out.print("Missing Number is "+ missingnum);
    }
}
