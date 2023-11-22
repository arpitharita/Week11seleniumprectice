package homework;

//Write a Java program to iterate through all elements in an array list using
//Iterator.

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {

        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Java");
        list_Strings.add("Python");
        list_Strings.add("Ruby");
        list_Strings.add("c++");
        list_Strings.add("c#");

        for (String element : list_Strings){
            System.out.println(element);
        }
    }
}
