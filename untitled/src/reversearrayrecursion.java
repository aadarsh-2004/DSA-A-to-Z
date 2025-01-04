public class reversearrayrecursion {

    static void reversearray(int[] arr ,int start ,int end){
        if(start>=end){
            return;
        }
        else {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            reversearray(arr ,start+1 ,end-1);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int start=0;
        int end= arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        reversearray(arr,start,end);
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }
}
