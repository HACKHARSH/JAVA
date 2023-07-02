
interface Y{
    void data();
}

interface X extends Y{

    int age = 20;     // final and static by default
    String name  = "Harsh";

    
    void show();  // public and abstract by default
    void config();

}



class B implements X{


    public void show() {
        System.out.println("in show");
    }


    public void config() {
        System.out.println("in config");
    }


    public void data() {
        System.out.println("in data");
    }
    
}

class A extends B{

    public A(){
        System.out.println("in A constructors");
    }

}



public class interfaceMe {
    public static void main(String args[]){

        X obj = new A();

        obj.config();
        obj.show();
        obj.data();

    }
    
}
