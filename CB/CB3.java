package CB;

public class CB3 {
    public static void main(String[] args) {
        int n= 6;
        int div = 1;
        int cnt=0;
        while(div <= n ){
            //System.out.println(div);
            int R = n%div;
            System.out.println(div + "-" +R);
            if (R==0) {
                System.out.println(div + " is a factor");
                cnt++;
            }
            div++;

        }
        System.out.println("total num of factors " + cnt);
    }
}
