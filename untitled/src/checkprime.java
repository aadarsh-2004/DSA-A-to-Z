public class checkprime {
    public static void main(String[] args) {
        int n=9973;
        int count=0;
        for (int i = 1; i <=n; i++) {
            if(count<3){
                if(n%i==0){
                    count++;
                }
            }
        }
        if(count>2){
            System.out.println("not a prime number");
        }
        else{
            System.out.println(n+"is a prime number");
        }

    }
}
