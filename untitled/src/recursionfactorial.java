public class recursionfactorial {
    static int fact(int n){
        if(n==0){
            return 1;

        }
        else{
            return n*fact(n-1);
        }

    }
    public static void main(String[] args) {
        int n=2;
        int result=fact(n);
        System.out.println(result);
    }
}