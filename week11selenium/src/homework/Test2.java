package homework;

//2. Rewrite the student mark sheet program using if else and while loop.

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Test2 t = new Test2();
        t.marks();
    }
    public void marks(){
        int math = 0;
        int science = 0;
        int english = 0;
        int marks = 100;
        float percentage ,total ;
        Scanner sc = new Scanner(System.in);
        System.out.println("|_____________________________________|");
        System.out.println("|              Marksheet              |");
        System.out.println("|_____________________________________|");
        System.out.println("|     Name   :                        |");
        String name = sc.next();
        System.out.println("|  Roll no                            |");
        int rollno = sc.nextInt();
        System.out.println("|_____________________________________|");
        System.out.println("|  Subject :                  Marks   |");
        System.out.println("|_____________________________________|");
        System.out.println("|  Math       :                       |");
        math = sc.nextInt();
        while (math>100 || math<0){
            System.out.println("Invalid input : Enter maths marks again :");
            math = sc.nextInt();
        }
        System.out.println("|  Science    :                       |");
        science = sc.nextInt();
        while (science>100 || science<0){
            System.out.println("Invalid input : Enter science marks again :");
            science= sc.nextInt();
        }
        System.out.println("|  English   :                        |");
        english = sc.nextInt();
        while (english>100 || english<0){
            System.out.println("Invalid input : Enter english marks again :");
            english = sc.nextInt();
        }
        System.out.println("|                                     |");
        System.out.println("| Enter your total :                  |");
        total = math +science +english;
        System.out.println("|_____________________________________|");
        System.out.println("|Percentage :                         |");
        percentage = total/3;
        System.out.println(percentage);
        System.out.println(" Result :                              ");

        if (math < 35 || science <35 || english <35){
            System.out.println("Fail");
        }else {
            if (percentage <35){
                System.out.println("Fail");
            } else if (percentage >35) {
                System.out.println("Pass");
                System.out.println("|Grade                             |");
                if (percentage >= 80){
                    System.out.println("A+");
                } else if (percentage >= 60) {
                    System.out.println("A");
                } else if (percentage >= 50) {
                    System.out.println("B");
                } else if (percentage >= 35) {
                    System.out.println("C");
                }
                System.out.println("|                                |");
            }
        }
    }
}
