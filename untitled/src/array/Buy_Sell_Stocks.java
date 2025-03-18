package array;
import java.math.*;
public class Buy_Sell_Stocks {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int min = arr[0];
        int profit = 0;

        for (int i = 0; i <arr.length ; i++) {
            int cost = arr[i] - min;
            profit = Math.max(cost,profit);
            min = Math.min(min,arr[i]);


        }
        System.out.println(profit);
    }


}
