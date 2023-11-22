package homework;

//9. Write program and add all group names in to array and iterates through for
//each loop.

public class Test9 {
    public static void main(String[] args) {
        String [] name = {"Java,Selenium,Code1,Code2,Agile,Restassured"};

        System.out.println(
                "iterating over an array using forEach() loop in Java:");
        for (String var : name) { // syntax forEach() loop
            // var is variable.
            System.out.println(var);
        }
    }
}
