public class leet6 {
    public static void main(String[] args) {
        
        int [] arr = new int [10];

        for(int i=0;i<=arr.length -1;i++){
            arr[i] = 2*(i+1);

        }
        for(int i=0;i<=arr.length -1;i++){
            System.out.println(arr[i]);
            
        }


        // printing the array in reverse
        
        for(int i=arr.length -1;i>=0;i--){
            System.out.println(arr[i]);
            
        }



        int min = 100, max =0;

        for(int i=0;i<=arr.length -1;i++){
            //System.out.println(arr[i]);
            if (min> arr[i]){
                min = arr[i];
            }

            if (max < arr[i]){
                max= arr[i];
            }
        }

        System.out.println("min is " + min);
        System.out.println("max is " + max);







        

        
        
    }
}