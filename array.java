public class array {
    public static void main(String args[]) {
        int num[] = {1,2,3,4};
        //System.out.println(num[1]);
        num[2] = 6;
        
        for(int i=0; i<4;i++){
            System.out.println(num[i]);
        }

        for(int ele: num){
            System.out.println(ele);
        }
        
    }
    
}
