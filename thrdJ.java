class T1 extends Thread{
    public void run(){
        for (int i =0; i<100;i++){
            System.out.println("in T1 *****");
        }
    }
}

class T2 extends Thread{
    public void run(){
        for (int i =0; i<100;i++){
            System.out.println("in T2 #####");
        }
    }
}

public class thrdJ {
    public static void main(String args[]){

        T1 obj1 = new T1();
        T2 obj2 = new T2();
  
        obj1.start();
        obj2.start();

    }
}
