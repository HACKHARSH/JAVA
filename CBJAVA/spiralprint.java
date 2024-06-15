package CBJAVA;

public class spiralprint {
    public static void main(String[] args) {
        int [][] arr = 
        {{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}};
        printme(arr);
    }
    public static void printme(int [][]arr){
        int minc=0, minr=0, maxc=arr[0].length-1, maxr= arr.length-1;
        int total = arr.length*arr[0].length;
        int count =0;
        
        while(count<total){
            for(int i= minc;i<=maxc && count<total;i++) {
                System.out.println(arr[minr][i]+ " ");
            }
            minr++;
            for (int i = minr; i <=maxr && count<total; i++) {
                System.out.println(arr[i][maxc]+ " "); 
            }
            maxc--;
            for (int i = maxc; i >= minc && count<total; i--) {
                System.out.println(arr[maxr][i]+ " ");
            }
            maxr--;
            for (int i = maxr; i >= minr && count<total; i--) {
                System.out.println(arr[i][minc]+ " ");
            }
            minc++;

        }
        
    } 
}
