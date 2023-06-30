class Human2{
    private int age = 0;
    private String name = "Null";

    public Human2(){
        System.out.println("in constructor");
    }

    
   

    public Human2(int a, String n) {
        age = a;
        name  = n;
    }




    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        System.out.println(age);
        return age;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void getData(){
        System.out.println("Name : "+ name + " Age : "+ age);
    }
}

public class constructors {

    public static void main (String args[]){

        Human2 obj = new Human2();

        //obj.setAge(20);
        //obj.setName("Harsh");

        obj.getData();
        obj.getAge();
        obj.getName();



    }
    
}
