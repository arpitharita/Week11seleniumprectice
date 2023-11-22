package homework;

//5. Write a Java program to test an array list is empty or not. Define array list with
//underground tube names

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<String>();
        array.add("Brampton");
        array.add("Mississauga");
        array.add("North york");
        array.add("Etobicoke");
        array.add("Scarborough");

        System.out.println(array);
        if (array.isEmpty()){
            System.out.println("ArrayList is empty");
        }else {
            System.out.println("ArrayList is not empty");
        }

    }
}
