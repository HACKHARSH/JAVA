import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;

public class collectionsAPI {
    public static void main(String args[]){

        List<Integer> nums = new ArrayList<Integer>();

        nums.add(1);
        nums.add(7);
        nums.add(3);
        nums.add(9);
        nums.add(5);
        nums.add(6);
        System.out.println(nums);

        System.out.println(nums.get(2));
        System.out.println(nums.indexOf(8));
        System.out.println(nums.toArray());

        
        
        Object []res = nums.toArray();

        for (Object i : res){
            System.out.println(i);
        }


        
    
        



    }

}
    
