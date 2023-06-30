class Human{
    private int age = 0;
    private String name = "Null";


    

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
        return name;
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
        obj.getAge();
        obj.getName();



    }
    
}
