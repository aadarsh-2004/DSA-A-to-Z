public class palindrome {
    public static void main(String[] args) {
        int actualnum=111;
        int tempnum=actualnum;
        int reversenum=0;

        while(actualnum>0){
            int lastnum=actualnum%10;
            actualnum=actualnum/10;

            reversenum=(reversenum*10)+lastnum;

        }
        System.out.println(reversenum);

        if(tempnum==reversenum){
            System.out.println("its a palindrome");
        }
        else {
            System.out.println("its not a palindrome");
        }
    }
}
