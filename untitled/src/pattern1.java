public class pattern1 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < n; i++) { //for rows
            for (int j = 0; j < n; j++) {//for columns
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
