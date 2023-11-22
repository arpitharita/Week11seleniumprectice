package homework;

//6. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
//Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
//and if else)

import java.util.HashSet;

public class Test6 {
    public static void main(String[] args) {

        HashSet<Integer> has = new HashSet<>();
        has.add(4);
        has.add(7);
        has.add(8);

        for (int i =1; i<13 ; i++){
            if (has.contains(i)){
                System.out.println("Found in to the set " +i);
            }else {
                System.out.println("Not found in to the set " +i);
            }
        }
    }
}
