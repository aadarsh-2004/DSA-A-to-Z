public class armstrong {
    public static void main(String[] args) {
        int actualnum=371;
        int temp=actualnum;
        int armstrong=0;

        while(actualnum>0){
            int lastnum=(actualnum%10);
            actualnum=actualnum/10;
            int num=lastnum * lastnum *lastnum;

            armstrong=armstrong+num;
        }
        System.out.println(armstrong);

        if(temp==armstrong){
            System.out.println("its a armstrong");
        }
        else{
            System.out.println("not a armstrong");
        }
    }
}
