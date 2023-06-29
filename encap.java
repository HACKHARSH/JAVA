class Human{
    private int age = 0;
    private String name = "Null";


    public void setAge(int a){
        age = a;

    }
    public void setName(String a){
        name = a;

    }

    public void getData(){
        System.out.println("Name : "+ name + " Age : "+ age);
    }
}

public class encap {

    public static void main (String args[]){

        Human obj = new Human();

        obj.setAge(20);
        obj.setName("Harsh");

        obj.getData();


    }
    
}
