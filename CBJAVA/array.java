package CBJAVA;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int [] arr = new int[5];
        System.out.println(arr);
        //arr[1] = 3;
        for(int i=0;i<arr.length;i++){
            Scanner sc = new Scanner(System.in);
            
            arr[i] = sc.nextInt();

           
        }

        for(int i=0;i<arr.length;i++){
            
            System.out.println(arr[i]);
        }
        
    }
}
