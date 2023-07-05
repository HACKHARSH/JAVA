import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;

public class collectionsAPI {
    public static void main(String args[]){

        // List<Integer> nums = new ArrayList<Integer>();

        // nums.add(1);
        // nums.add(2);
        // nums.add(3);
        // nums.add(0,2);
        // nums.add(5);
        // nums.add(6);
        // System.out.println(nums);

        // System.out.println(nums.get(2));
        // System.out.println(nums.indexOf(8));
        // System.out.println(nums.toArray());

        
        
        // Object []res = nums.toArray();

        // for (Object i : res){
        //     System.out.println(i);
        // }


        int nums[] = {0,1,2,2,3,0,4,2};
        int val = 2;

        int l = 0;

        List<Integer> res = new ArrayList<Integer>();
        System.out.println(res);

        for (int i=0;i<nums.length;i++){
            if (nums[i] != val){
                res.add(nums[i]);
                l = l+1;

            }
        }
        for(int j=0;j<l;j++){

            nums[j] = res.get(j); 
        }

        System.out.println("-------"+l);


        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);
        System.out.println(res);

    
        



    }

}
    
