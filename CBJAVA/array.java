package CBJAVA;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int [] arr = new int[5];
        int [] arr2 = {1,2,3,4,5,6};
        System.out.println(arr);
        //arr[1] = 3;
        // for(int i=0;i<arr.length;i++){
        //     Scanner sc = new Scanner(System.in);
            
        //     arr[i] = sc.nextInt();


           
        // }

        

        swap(arr2, 0, 1);

        for(int i=0;i<arr2.length;i++){
            
            System.out.println(arr2[i]);
            System.out.println(arr2[-1]);
        }
        
        
    }
    public static void swap (int[] arr, int i,int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    
    
    }
}
