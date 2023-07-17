import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//import java.util.Collection;
import java.util.List;

public class collectionsAPI {
    public static void main(String args[]){

        List<Integer> nums = new ArrayList<Integer>();
        //this

        List<Integer> nums2 = Arrays.asList(1,2,3,4,5,6);
        System.out.println(nums2);



        nums.add(1);
        nums.add(7);
        nums.add(3);
        nums.add(9);
        nums.add(5);
        nums.add(6);
        System.out.println(nums);

        Collections.sort(nums);
        

        System.out.println(nums);

        System.out.println(nums.get(2));
        System.out.println(nums.indexOf(8));
        System.out.println(nums.size());

        
        
        Object []res = nums.toArray();

        for (Object i : res){
            System.out.println(i);
        }


        
    
        



    }

}
    
