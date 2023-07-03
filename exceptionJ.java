public class exceptionJ {
    public static void main(String args[]){
        int i =0 ;
        int j=0;
        

        try{
            j = 18/i;
            if (j==0){
                throw new ArithmeticException("Meri marzi");
            }
            
            

        }
        catch(ArithmeticException e){
            System.out.println("ERROR: "+e);
            j = 18/1;
        }
        catch(Exception e){
            System.out.println(e);

        }
        finally{
            System.out.println(j);

        }
        
        
        
        System.out.println("End of Code");
    }
}
