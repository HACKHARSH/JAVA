enum Status{
    Running, Failed, Pending, Success,Error;
}

enum Laptop{
    Macbook(2000),Dell(1500),ASUS(1800);

    private int price;

    private Laptop(int price){
        this.price = price;


    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
  
}

public class enumJ {
     public static void main(String args[]){

       Status s= Status.Failed;
       System.out.println(s.ordinal());

    //    Status []ss= Status.values();

       for(Laptop show : Laptop.values()){
        System.out.println(show + " : "+show.getPrice() );
       }

    }
}
