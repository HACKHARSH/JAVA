enum Status{
    Running, Failed, Pending, Success,Error;
}

public class enumJ {
     public static void main(String args[]){

       Status s= Status.Failed;
       System.out.println(s.ordinal());

       Status []ss= Status.values();

       for(Status show :ss){
        System.out.println(show);
       }

    }
}
