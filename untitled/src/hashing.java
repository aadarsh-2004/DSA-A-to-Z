public class hashing {
    public static void main(String[] args) {
        // given array
        int[] arr = {1,2,1,3,4};

        // hash array
        int[] hash =new int[13];
        int count=0;

        for (int i = 0; i < arr.length ; i++) {
            int element=arr[i];
            hash[element]++;
        }
        for (int i = 0; i <hash.length; i++) {
            System.out.println(hash[i]);

        }

    }
}
