import java.util.Scanner;

public class inputinj {

    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter something: ");
            int num = sc.nextInt();
            System.out.println(num);
        }



    }
    
}
