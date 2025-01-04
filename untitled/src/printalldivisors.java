public class printalldivisors {
    public static void main(String[] args) {
        int num=888;
        for (int i = 1; i <= num ; i++) {
            if(num%i==0){
                System.out.printf("%d is a divisor of %d\n",i,num);
            }



        }
    }
}
