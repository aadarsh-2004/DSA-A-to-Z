package array;
//FINDING ELEMENT WHICH IS ACCRUING MORE THAN N/2 TIMES
public class majority_element_n2 {
//        public static void main(String[] args) {
//            int[] arr = {2, 2,1,1,1,1,1,1,1,1,1,1,1,1,11,1,1,1,1,1,1,1,1,1, 3, 3, 1, 2, 2, 3, 3, 3 ,3,3,3,3,3};
//            int n = arr.length;
//            boolean found = false;
//
//            for (int i = 0; i < arr.length; i++) {
//                int count = 0;
//                for (int j = 0; j < arr.length; j++) {
//                    if (arr[i] == arr[j]) {
//                        count++;
//                    }
//                }
//                if (count > n / 2) {
//                    System.out.println("Most occurring element found: " + arr[i] + " (Occurred " + count + " times)");
//                    found = true;
//                    break;
//                }
//            }
//
//            if (!found) {
//                System.out.println("No majority element found.");
//            }
//        }
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,2,1,3,1,4,2,2,2,4,1,1,5,1,};
        int n = arr.length;
        int ele=0;
        int count=0 ;
        for (int i = 0; i <n ; i++) {
            if (count==0){
                count++;
                ele=arr[i];
            } else if (arr[i]== ele) {
                count++;
            }
            else {
                count--;
            }
        }
        int check =0;
        for (int i = 0; i <n ; i++) {
            if (arr[i]==ele){
                check++;
            }
        }
        if(check > n/2){
            System.out.println("Majority ele is " + ele);
        }
        else {
            System.out.println("No Majority ele found");
        }
    }

    }

