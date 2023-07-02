
class A{
    public A(){
        System.out.println("in A");
    }


}

class B extends A{
    public B(){
        System.out.println("in B");
    }

    public void show(){
        System.out.println("in show");
    }

}

public class sup {
    public static void main(String args[]){

        B obj = new B();
        obj.show();


    }
    
}
