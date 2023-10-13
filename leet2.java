

public class leet2 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";


        s.strip();
        String[] str = s.split(" "); 
        String[] res  = new String[str.length];

        for (int i=0;i<str.length;i++){
            int val = str[i].length();
            char pos = str[i].charAt(val-1);
            int fpos = Character.getNumericValue(pos);

            res[fpos-1] = str[i].substring(0, val-1);


        }

        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }

        

       
        
        
    }
    
}
