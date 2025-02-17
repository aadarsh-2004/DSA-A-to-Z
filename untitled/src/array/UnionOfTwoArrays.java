package array;
import java.util.*;
public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i <arr1.length ; i++) {
                set.add(arr1[i]);
        }
        for (int i = 0; i <arr2.length ; i++) {
            set.add(arr2[i]);
        }

        List<Integer> resultList = new ArrayList<>(set);
        System.out.println("Union of Arrays: " + resultList);

    }
}
