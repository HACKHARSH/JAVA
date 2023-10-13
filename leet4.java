public class leet4 {
    public static void main(String[] args) {
        String s= "abcd";
        int k = 2;


        String [] arr  = new String [1+s.length()/k];
        int j=0;
        int m=0;

        for (m=0;m<s.length()-k+1;m+=k){
            arr[j] = s.substring(m,m+k);
            j++;

        }
        if (m+k != s.length()){
            arr[j] = s.substring(m,s.length());
            j++;

        }
        
        for(int i=0;i<arr.length-1;i+=2){
            StringBuilder sb=new StringBuilder(arr[i]);  
            sb.reverse();
            arr[i] = sb.toString();

        }

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        String str = sb.toString();


        System.out.println(str);
    }
    
}
