package CBJAVA;

public class insertion {
    public static void main(String[] args) {
        int [] arr = {1,3,5,2,4,6};
        //insert_last(arr,arr.length-1);


        for(int i=0;i<arr.length;i++){
            insert_last(arr, i);
        }

        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }

        
    }

    public static void insert_last(int [] arr, int i){
        int item  = arr[i];
        int j = i-1;
        while (j>=0 && arr[j]>item){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = item;
    }
}
