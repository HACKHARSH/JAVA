package CBJAVA;

import java.util.Scanner;

public class maxvowel {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String s= sc.next();

        String s="haello";

        int Max=0;
        int count=0;

        for(int i=0;i<s.length()-1;i++){
            char ch = s.charAt(i);
            if (vchk(ch)== true) count++;
            else {
                Max = Math.max(Max, count);
                count=0;
            }
        }
        Max = Math.max(Max, count);
        System.out.println(Max);
    }

    public static boolean vchk(char ch){
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
    
}
