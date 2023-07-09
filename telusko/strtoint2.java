public class strtoint2 {
    public static void main(String args[]){
        String s= "-91283472332";
        s= s.strip();
        
        int negval = 0;

        if (s.charAt(0) == '-') negval = 1;


        char [] digitstr = {'0','1','2','3','4','5','6','7','8','9','+','-'};
        StringBuilder sb = new StringBuilder(s);
        if (sb.charAt(0) == '-') {
            negval = 1;
            sb.deleteCharAt(0);

        }
        int chk =0;

        for (int j=0;j<digitstr.length;j++){
                
            if(sb.charAt(0) == digitstr[j]){
                chk = 1;
            }
        }

        if (chk ==0){
            System.out.println("O in first char ");
        }
        
        
        for (int i=0;i<sb.length();i++){
            chk =0;
            
            for (int j=0;j<digitstr.length;j++){
                
                if(sb.charAt(i) == digitstr[j]){
                    chk = 1;
                }
            }
            if (chk !=1){
                sb.deleteCharAt(i);
                i--;

            }
        }
        

        String rawres = sb.toString();
        rawres = rawres.strip();


        long res = Long.parseLong(rawres);
        if (negval == 1){
            res = -res;
        }
        System.out.println(res);

        long z =2131;
        
        
        

        
        
        

    }
}
