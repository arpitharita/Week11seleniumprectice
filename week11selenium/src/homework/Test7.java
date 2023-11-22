package homework;

//7. Create a HashMap object called people that will store String keys and Integer
//values: And use for each loop to iterate the value from Map.

import java.util.HashMap;

public class Test7 {
    public static void main(String[] args) {

        HashMap<String,Integer> name = new HashMap<>();
        name.put("Harita" ,32);
        name.put("Preksha" ,40);
        name.put("Divya" ,30);
        name.put("Priynka",35);
        name.put("Khushbu" ,33);
        System.out.println("Output : ");
        for (String i : name.keySet()){
            System.out.println(i+ " " +name.get(i));
        }
    }
}
