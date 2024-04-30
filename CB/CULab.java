package CB;
import java.util.*;

public class CULab {

    public static void main(String[] args) {
        
        Set<String> uniqueSymbols = new HashSet<>();

        
        String[] cards = {"Diamond", "Heart", "Club", "Spade", "Diamond", "Heart", "Club"};

        
        for (String card : cards) {
            uniqueSymbols.add(card);
        }

       
        System.out.println("Unique symbols from the set of cards:");
        for (String symbol : uniqueSymbols) {
            System.out.println(symbol);
        }
    }


    
}
