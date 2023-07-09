import java.util.Arrays;

public class aisehi2 {
    public static void main(String args[]){
        String s = "dvdf";

        if (s.length()==0){
            System.out.println(0);
        }

        int lent = 0;
        int ind= 0;
        //int count = 0;

        char[] ch = s.toCharArray();
        char[] res = new char[ch.length*2];

        for (int i=0;i<ch.length;i++){

            int chk = 0;
            for (int j =0; j< res.length;j++){
                if (ch[i] == res[j]){
                    chk = 1;
                    // res[ind] = '\0';
                    // ind++;
                    // res[ind] = ch[i];
                    // ind++;
                    //res[ind] = ch[i];
                    //ind++;
                    //res = new char[ch.length];
                    //i--;
                    ind=0;
                    res[ind] = ch[i];
                    ind++;

                    break;
                }
            }
            if(chk == 0){
                //lent = lent+1;
                res[ind] = ch[i];
                ind++;
                
            }
            //i--;

        }
        System.out.println(Arrays.toString(res));
        int high  = 0;
        for(int k =0; k<res.length;k++){
            
            

            if (res[k] != '\0') {
                
                lent = lent +1;
            }
            else{
                lent=0;

            }
            if (high<= lent) high = lent;
            System.out.println(high + " : " +lent);


        }
        System.out.println(high);
        
        
    }
}
