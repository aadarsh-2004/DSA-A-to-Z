public class recursion {
    static void printname(int n , String name){
        if(n==0){
            return;
        }
        else{
            System.out.println(n +" "+ name);
            printname(n-1,name);
        }
    }
    public static void main(String[] args) {
        int n=15;
        String name ="Aadarsh";
        printname(n,name);
    }
}
