package CBJAVA;

public class search {
    public static void main(String[] args) {
        int [] arr = {2,4,5,6,8,9,12,14,15,17,18,19};

        System.out.println(binary(arr, 18));
    }

    public static int binary(int [] arr, int val) {

        int low = 0;
        int high = arr.length-1;
        

        while(low<=high){
            int mid =  (low+high)/2;

            if (arr[mid] == val) return mid;

            else if (val>arr[mid])low = mid+1;

            else if ( val< arr[mid]) high = mid-1;

        }
        return -1;
    }
}
