package CBJAVA;

import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        //int n,m= 0,0;
        int [][] arr = 
        {{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}};
        

        for(int i=0;i<arr.length;i++){
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i]+" ");
                
            }
            i++;
            for (int j = arr.length-1; j >=0; j--) {
                System.out.print(arr[j][i]+" ");
                
            }

            
        }

        





        
    }
}
