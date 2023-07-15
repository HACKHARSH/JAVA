public class A1bubblesort {
    public static void main(String[] args) {
        
        int [] a= new int [7];
        a[0] =20;
        a[1]= 35;
        a[2]= -15;
        a[3] = 7;
        a[4] = 55;
        a[5] = 1;
        a[6] = -22;

        for( int i = a.length -1; i>0;i--){
            for(int j =0;j<i;j++){
                if (a[j]>a[j+1]) {
                    swap(a,j,j+1);
                }
            }
        }

        for (int i= 0; i<a.length;i++) System.out.println(a[i]);
        
    }

    public static void swap(int[] array, int i, int j){

        if(i==j){
            return;
        }
        int temp = array[i];

        array[i] = array[j];

        array[j]  = temp;



    }

    
    
}
