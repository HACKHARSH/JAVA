public class aisehi {

    public static void main(String args[]){

        String a = "ab";
        //System.out.println(a.length());
        //System.out.println(a.charAt(0));

        char[] ch = a.toCharArray();
        for(int i = 0; i<ch.length; i++){
            System.out.println(ch[i]);
        }

        

        if(a.charAt(0) == 'a'){
            System.out.println("worj=king");

        }
    }
    
}
