public class reversenum {
    public static void main(String[] args) {
        int n=12345;
        int reversenum=0;
        while(n>0){
            int lastnum=n%10;
            n=n/10;
            reversenum=(reversenum*10)+lastnum;

        }
        System.out.println(reversenum);
    }
}
