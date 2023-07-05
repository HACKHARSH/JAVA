import java.util.HashMap;
import java.util.Map;

public class mapinJ {
    public static void main(String args[]){

        Map<String, Integer> students  = new HashMap<>();
        students.put("Harsh0", 80);
        students.put("Harsh1", 82);
        students.put("Harsh2", 30);
        students.put("Harsh3", 84);
        students.put("Harsh2", 89);

        System.out.println(students);
        System.out.println(students.get("Harsh2"));
        System.out.println(students.values());
        System.out.println(students.keySet());

        for(String name : students.keySet()){
            System.out.println(name +" : "+ students.get(name) );

        }

    }
    
}
