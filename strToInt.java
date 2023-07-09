public class strToInt {
    public static void main(String args[]){
        String s= "4193abcdef";

        
        char [] digitstr = {'0','1','2','3','4','5','6','7','8','9','+','-'};
        StringBuilder sb = new StringBuilder(s);
        for (int i=0;i<sb.length();i++){
            int chk =0;
            
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


        // int negval = 0;
        // for(int k = 0; k< sb.length();k++){

        //     if (sb.charAt(k) == '-'){
        //         negval = 1;
        //         sb.deleteCharAt(k);


        //     }
        // }

        String rawres = sb.toString();
        System.out.println("this is rawres : " + rawres);
        rawres = rawres.strip();

        // int res = Integer.parseInt(rawres);
        System.out.println(rawres);
        
    }
    
}
