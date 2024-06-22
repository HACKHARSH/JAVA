package CBJAVA;

public class string2 {
    
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("NAMAN");
        String s4 = new String("Hello");


        System.out.println(Equal(s1, s2));
        System.out.println(Equal(s3, s4));

        System.out.println(compareme(s1, s2));

        System.out.println(strpalindrome(s3));

        substring(s1);
        System.out.println();
        lprint(s1);


        
    }
    public static boolean Equal(String s1, String s2){
        if(s1==s2) return true;

        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) return false;
            
        }
        return true;
    }

    public static int compareme(String s1, String s2){

        if (s1.length()!=s2.length()){
            return s1.length()-s2.length();
        }

        for (int i = 0; i< s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            }
            
        }
        return 0;

    }

    public static boolean strpalindrome(String s1){

        for (int i = 0; i < s1.length()/2; i++) {
            if(s1.charAt(i) != s1.charAt(s1.length()-1-i)) return false;
            
        }
        return true;

    }
    public static void substring(String s1){
        for (int i = 0; i < s1.length()+1; i++) {
            for (int j = i+1; j < s1.length()+1; j++) {
                System.out.println(s1.substring(i,j));

            }
            
        }
    }

    public static void lprint(String s1){
        for (int len = 1; len <= s1.length(); len++) {
            for (int j = len; j <= s1.length(); j++) {
                int i=j-len;

                System.out.println(s1.substring(i,j));

                
            }
        }
        
    }
}
