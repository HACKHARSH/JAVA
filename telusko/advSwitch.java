public class advSwitch {
    public static void main (String args[]){
        String day = "Monday";

        switch(day){

            //This is the implimentation of advanced switch

            case "Saturday" , "Sunday" -> System.out.println("6am");
            case "Monday" , "Tuesday" -> System.out.println("7am");
            case "Wed" , "Thu" -> System.out.println("8am");
            default -> System.out.println("12pm");



        }
    }
    
}
