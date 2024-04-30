package CB;

public class APLab {

    public static void main(String[] args)
    {
        
        int A[] = { 1,2,3,4,5,6 };
        int sum = 9;
        int arr_size = A.length;
        int chk = 0;
 
        for (int i = 0; i < arr_size - 2; i++) {
 
            
            for (int j = i + 1; j < arr_size - 1; j++) {
 
                
                for (int k = j + 1; k < arr_size; k++) {
                    if (A[i] + A[j] + A[k] == sum) {
                        System.out.println(A[i] + " , " + A[j] + " , " + A[k]);
                        chk=1;
                        
                    }
                }
            }
        }
        if (chk==0) System.out.println("No Triplet Found");
    }
    
}
