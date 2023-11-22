package homework;

//3. Write a Java program to create a new array list, add some colours(string) and
//printout the collection using for each loop.

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Pink");
        list.add("Purple");
        list.add("Black");
        list.add("Pink");
        list.add("Violin");
        list.add("White");
        list.add("Yellow");
        list.add("Red");
        System.out.println("Output :");

        for (String Colour: list){
            System.out.println(Colour);
        }
    }
}
