public class print_1_to_n_recursion {
    static void print(int count ,int n){
        if(count<1){
            return;
        }
        else{
            System.out.println(count);
            print(count-1 ,n);


        }
    }

    public static void main(String[] args) {
        int n=15;
        int count=n;
        print(count,n);
    }
}
