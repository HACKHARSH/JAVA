package CBJAVA;

import java.util.Scanner;

public class inverse_of_number {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int n= sc.nextInt();
    System.out.println(Number(n));
		

    }
    public static int Number(int n){
      int sum = 0;
      int pos = 1;
      while(n>0){
        int rem = n%10;
        sum = (int)(sum + pos * Math.pow(10,rem-1));
        n=n/10;
        pos++;
      }
      return sum;

    }
}
