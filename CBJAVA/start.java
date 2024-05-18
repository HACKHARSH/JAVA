package CBJAVA;

public class start {
    public static void main(String[] args) {
        System.out.println("hello");
        // this is only applicabe when the value of source or dest is 10
        int src = 10;
        int dest =2;


        int sum =0;
        int mul=1;
        int n=1011110;
        int rem;

        while(n>0){
            rem=n%src;
            sum = sum + (rem*mul);
            mul= mul*dest;
            n=n/src;

        }
        System.out.println(sum);


    }
}
