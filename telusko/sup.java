
class Ab{
    public Ab(){
        System.out.println("in A");
    }


}

class Bb extends Ab{
    public Bb(){
        System.out.println("in B");
    }

    public void show(){
        System.out.println("in show");
    }

}

public class sup {
    public static void main(String args[]){

        Bb obj = new Bb();
        obj.show();


    }
    
}
