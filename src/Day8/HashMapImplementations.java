package Day8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapImplementations {

    public static void main(String[] args) {

        Map<String , Integer> cricketSquad = new HashMap<>();   // Doesn't maintain insertion order

        cricketSquad.put("Asalanka " , 0);
        cricketSquad.put("Nissanka " , 80);
        cricketSquad.put("mendis " , 20);

        System.out.println(cricketSquad);


        Map<String , Integer> cricketSquadLinked = new LinkedHashMap<>();     // maintain the insertion order

        cricketSquadLinked.put("Asalanka " , 0);
        cricketSquadLinked.put("Nissanka " , 80);
        cricketSquadLinked.put("mendis " , 20);

        System.out.println(cricketSquadLinked);


        Map<Integer , String> students = new TreeMap<>();     // sorts the keys alphabetical or numerical

        students.put(11 , "maths");
        students.put(53 , "english");
        students.put(33 , "science");

        System.out.println(students);

        for (String name : cricketSquadLinked.keySet()) {
            System.out.println("Key - " + name + "Value - " + cricketSquadLinked.get(name));
        }

        System.out.println("-------------------------------------------");

        for (Map.Entry<String , Integer> entry : cricketSquad.entrySet()) {
            System.out.println("Key - " + entry.getKey() + "value - " + entry.getValue());
        }
    }
}