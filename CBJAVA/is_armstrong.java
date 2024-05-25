package CBJAVA;

import java.util.Scanner;

public class is_armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		int n= sc.nextInt();
        System.out.println(is_armstrong(n));
        //System.out.println(count(n));
    }
    public static int count(int n){
        int count =0;
        while(n>0){
            n=n/10;

            count+=1;

        }
        return count;

    }

    public static Boolean is_armstrong(int n){
        int val = n;
        int d = count(n);
        int sum = 0;
        while(n>0){
            int rem = n%10;

            sum = (int)(sum+ Math.pow(rem,d));

            n=n/10;


            
        }
        
        if(sum==val)  return true;

        else return false;
    }
}
