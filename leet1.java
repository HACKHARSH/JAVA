

public class leet1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        int c=0;

        int n=0;
        for(int i=0;i<nums.length;i+=2){
            n= n+ nums[i];
        }
        
        int [] result = new int[n];

        for(int i=0;i<nums.length;i+=2){
            int freq = nums[i];
            int val = nums[i+1];

            for (int j=0;j<freq;j++){
                result[c] = val;
            }

        }

        for(int z=0;z<result.length;z++){
            System.out.println(result[z]);
        }

        

        
    }
    
}



int max = 0;
        

        for (int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){

                if((prices[j]-prices[i])> max ){
                    max = prices[j]-prices[i];
                    

                }

            }
        }
        return max;