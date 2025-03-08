package array;

public class find_max_consicutive_ones {
    public static void main(String[] args) {
        int[] arr =  {1,1,0,0,1,1,1,1,1,1,1,0,1};
        int count =0;
        int max =0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==1){
                count++;
                if(count>max){
                    max=count;

                }
            } else if (arr[i]==0) {
                count=0;


            }

        }
        System.out.println(count);
        System.out.println(max);
    }
}
