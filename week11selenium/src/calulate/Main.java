package calulate;

import java.util.Scanner;

public class Main extends Calculator {

    public static void main(String[] args) {
        char c1 ;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number");
            int a = sc.nextInt();
            System.out.println("Enter the symbol(+,-,/,*)");
            char c = sc.next().charAt(0);
            System.out.println("Enter the second number");
            int b = sc.nextInt();
            System.out.println("Total");
            Calculator calc = new Calculator();
            calc.calculateResult(a, b, c);
            System.out.println("would you like to do more calculation.? : Y or N");
            c1 = sc.next().charAt(0);


        }
        while (c1 == 'Y' || c1 == 'y');

    }
}
