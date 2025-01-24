public class hashingstring {
    public static void main(String[] args) {
        String s="abcdabcjc";

        int[] hash = new int[26];

        for (int i = 0; i <s.length(); i++) {

            char element=s.charAt(i);
            int index= element-'a';

            hash[index]++;
        }
        for (int i = 0; i <hash.length; i++) {
            System.out.println( (char)(i+'a')+ ":"+ hash[i]);

        }
    }
}
