@FunctionalInterface
interface Z{
    void data(int i);
}

public class lambdainterface {
    public static void main(String args[]){

        // Z obj = new Z(){
        //     public void data(int i){
        //         System.out.println("in data anm" + i);
        //     }
        // };

        // All the above code is converted into 1 line through lambda expressions

        Z obj = (int i)-> System.out.println("in data anm " + i);

     
        obj.data(5);

    }
}
