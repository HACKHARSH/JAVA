import java.util.Arrays;

public class aisehi {

    public static void main(String args[]){

        String a = "abg  jg  jgj  ";
        String b = "ab";
        //System.out.println(a.length());
        //System.out.println(a.charAt(0));

        char[] ch = a.toCharArray();
        char[] res = new char[ch.length];
        


        for(int i = 0; i<ch.length; i++){
            if (ch[i] =='\0'){
                System.out.println("space");
            }
            else{
                System.out.println(ch[i]);
            }
        }

        
        System.out.println(Arrays.toString(ch));

        

        
    }
    
}
