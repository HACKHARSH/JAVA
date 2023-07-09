
class Calc {

    //int a;
    //int b;
    public void multiply() {
        System.out.println("in multiply");
        
    }

    public int add(int a, int b) {
        System.out.println("in add 2");
        return a+b;
    }

    public int add(int a, int b, int c) {
        System.out.println("in add 3");
        return a+b+c;
    }
}

public class oops {
    public static void main(String args[]) {

         

        Calc c = new Calc();

        int result = c.add(1,3,2);

        c.multiply();

        System.out.println(result);


        
    }
}
