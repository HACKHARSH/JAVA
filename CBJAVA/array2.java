package CBJAVA;

public class array2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int item = 9;
        
        System.out.println(search(arr,item));
        System.out.println(max(arr));
        reverse(arr);
        rev2(arr);

        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }

        

    }
    public static int search(int [] arr, int i){
        for(int j=0;j<arr.length;j++){
            if (arr[j]==i) return j;
        }
        return -1;
    }

    public static int max(int [] arr){
        int max = arr[0];
        for (int i=1 ;i<arr.length;i++){
            if(arr[i]>max) max= arr[i];
        }
        return max;
    }
    public static void reverse(int[] arr){
        for(int i =0; i< (arr.length/2);i++){
            //System.out.println(arr[i]+" "+arr[arr.length-i]);
            int temp = arr[i];
            arr[i]= arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }

        

    }
    public static void rev2(int [] arr){
        int i = 0;
        int j = arr.length-1;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public void rotate(int[] nums, int k) {
        //leetcode 189
        k=k%nums.length;
        for(int i =0;i<k;i++){
            int temp = nums[nums.length-1];
            for(int j=nums.length-1;j>0;j--){
                nums[j] = nums[j-1];

            }
            nums[0] = temp;
        } 
    }
}
