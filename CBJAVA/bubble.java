package CBJAVA;

public class bubble {
   public static void main(String[] args) {
    int [] arr = {1,3,5,2,4,6};


    System.out.println(min(2, arr));
    insertion(arr);
   }

   
   public static void bubble (int []arr){
    for(int turn = 1;turn<arr.length;turn++){
        for(int i =0;i<arr.length-turn;i++){
            if (arr[i]>arr[i+1]){

                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;

            }
        }
    }
    for(int j=0;j<arr.length;j++){
        System.out.println(arr[j]);
    }
   }


   public static int min(int id, int [] arr){
    int min = arr[id];
    for(int i= id+1;i<arr.length;i++){
        if (arr[i]<min) {
            id=i;
            min = arr[i];
        }
    }
    return id;

   }


   public static void insertion(int [] arr){
    for(int x=0;x<arr.length;x++){
        int swap = min(x, arr);

        int temp = arr[x];
        arr[x] = arr[swap];
        arr[swap] = temp;
        

    }
    for(int j=0;j<arr.length;j++){
        System.out.println(arr[j]);
    }
   }
}
