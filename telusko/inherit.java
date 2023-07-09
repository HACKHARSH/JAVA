class Calcu{
    int a;
    int b;

    

    public int add(){
        return a+b;
    }

    public int sub(){
        return a-b;
    }

    public int mul(){
       
        System.out.println("in A");
        return a*b;
    }

    public int div() {
        return 0;
    }
    

    
}

class advCalcu extends Calcu {

    public advCalcu(int a, int b){
        this.a= a;
        this.b = b;
    }

    public int mul(){
        return a*b;
    }

    public int div(){
        return a/b;
    }



}


public class inherit {
    public static void main (String args[]){
        int res = 0;

        Calcu obj = new advCalcu(5,3);

        res= obj.add();
        System.out.println(res);

        res= obj.sub();   
        System.out.println(res);

        res= obj.mul();
        System.out.println(res);


        // implementing dynamic method dispatch
        res= obj.div();
        System.out.println(res);

    }
}
