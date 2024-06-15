package CBJAVA;

import java.util.Arrays;
import java.util.Scanner;

public class aggcow {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int nos = sc.nextInt();
            int noc = sc.nextInt();
            int[] stall = new int [nos];
            for (int i=0;i<stall.length;i++){
                stall[i] = sc.nextInt();
            }
            Arrays.sort(stall);
            System.out.println(minD(stall, noc));

        }
        
        //test case input
        //1
        //5 3
        //1 2 8 4 9 
    }


    public static int minD(int [] stall, int noc) {

        int lo = 0;
        int hi = stall[stall.length-1]-stall[0];
        int ans =0;
        while (lo<=hi){
            int mid = (lo+hi)/2;
            if (issafe(stall,noc,mid)==true){
                ans = mid;
                lo  = mid+1;
            }
            else{
                hi =mid-1;

            }
        }
        return ans;
        
    }

    public static boolean issafe(int [] stall, int noc, int mid){
        int pos=stall[0];
        int cow =1;
        for(int i=1;i<stall.length;i++){
            if(stall[i]-pos>=mid){
                cow++;
                pos=stall[i];
            }
            if(cow==noc){
                return true;
            }
        }
        return false;
    }
}
