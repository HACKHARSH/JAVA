import java.util.HashSet;

public class leet3 {
    public static void main(String[] args) {
        String[] words = {"gin","zen","gig","msg"};

        String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        
        HashSet<String> hset = new HashSet<>(); 

        for(int i=0;i<words.length;i++){
            String val ="";

            for(int j=0; j<words[i].length();j++){
                //System.out.println(words[i].charAt(j));

                int alpha = (int)words[i].charAt(j);
                //System.out.println(alpha);

                val = val + morse[alpha -97];               
            }

            hset.add(val);

        }

        System.out.println(hset.size());

 

    
         
           



        

        

         
        



    }
    
}
