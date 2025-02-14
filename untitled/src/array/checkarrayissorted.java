package array;

public class checkarrayissorted {
    public static void main(String[] args) {
        int[] arr= {3,6,2,8,44,5,99,222,34,1};
        boolean check =true;
        for (int i =0; i <arr.length-1 ; i++) {
            if(arr[i] > arr[i+1]){
                check=false;
                break;
            }
        }
        System.out.print("is arrary sorted :- "+ check);
    }
}
