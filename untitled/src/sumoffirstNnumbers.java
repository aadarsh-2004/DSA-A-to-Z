public class sumoffirstNnumbers {
     static int sum(int n){
         if(n==0){
             return 0;
         }
         else {
             return n+sum(n-1);
         }



    }
    public static void main(String[] args) {
        int num=5542;
        int ans= sum(num);
        System.out.println(ans);
    }
}
