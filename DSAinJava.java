public class DSAinJava {
    public static void main(String[] args) {

        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        String res[]  = new String[indices.length];

        for(int i=0;i<indices.length;i++){

            res[indices[i]] = ""+s.charAt(i);

        }

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < res.length; i++) {
            sb.append(res[i]);
        }
        String str = sb.toString();
        System.out.println(str);


    }
}
